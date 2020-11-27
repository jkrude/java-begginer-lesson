package plots;

import java.util.List;
import java.util.function.Function;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

/**
 * @author jewelsea / jkrude
 */
public class MultiPlot extends Pane {


  public MultiPlot(
      List<Function<Number, Number>> functions,
      List<Number> xIncs,
      List<Color> colors,
      double xMin, double xMax,
      Axes axes) {

    for (int i = 0; i < functions.size(); i++) {
      Path path = new Path();
      path.setStroke(colors.get(i % colors.size()));
      path.setStrokeWidth(2);

      path.setClip(
          new Rectangle(
              0, 0,
              axes.getPrefWidth(),
              axes.getPrefHeight()
          )
      );

      var f = functions.get(i);

      double x = xMin;
      boolean firstDotPlotted = false;

      while (x < xMax) {
        try {
          double mx = mapX(x, axes);
          double my = mapY(f.apply(x).doubleValue(), axes);

          if (firstDotPlotted) {
            path.getElements().add(
                new LineTo(
                    mx, my
                )
            );
          } else {
            path.getElements().add(
                new MoveTo(
                    mx, my
                )
            );
            firstDotPlotted = true;
          }

        } catch (Exception e) {
          // not in domain of definition
        } finally {
          x += xIncs.get(i).doubleValue();
        }
      }

      setMinSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
      setPrefSize(axes.getPrefWidth(), axes.getPrefHeight());
      setMaxSize(Pane.USE_PREF_SIZE, Pane.USE_PREF_SIZE);
      getChildren().add(path);
    }

    getChildren().add(axes);
  }

  private double mapX(double x, Axes axes) {
    double tx = axes.getPrefWidth() / 2;
    double sx = axes.getPrefWidth()
        / (axes.getXAxis().getUpperBound()
        - axes.getXAxis().getLowerBound());

    return x * sx + tx;
  }

  private double mapY(double y, Axes axes) {
    double ty = axes.getPrefHeight() / 2;
    double sy = axes.getPrefHeight()
        / (axes.getYAxis().getUpperBound()
        - axes.getYAxis().getLowerBound());
    return -y * sy + ty;
  }

}
