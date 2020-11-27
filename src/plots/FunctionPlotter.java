package plots;

import java.util.List;
import java.util.function.Function;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FunctionPlotter extends Application {

  public static final Color[] defColors = {
      Color.web("#59D193"),
      Color.web("#BD6AA6"),
      Color.web("#D2BD00"),
      Color.web("#E4831A"),
      Color.web("#97ABEB"),
  };

  @Override
  public void start(Stage stage) throws Exception {
    // Visualise the difference between integer and double.
    // Credit to https://github.com/mooninvader/FunctionPlotter
    integerVsDouble(stage);
  }

  private void integerVsDouble(Stage stage) {

    double xLow, yLow, xMax, yMax;
    // Define range for x: x in [xLow, xMax].
    xLow = -20;
    xMax = 20;
    // Range for the Y-Axis.
    yLow = -60;
    yMax = 60;
    // Dx between every f(x) calculations.
    double increment = 0.01;

    MultiPlot multiPlot;
    Axes axes = new Axes(
        1280,
        720,
        xLow, xMax, 1,
        yLow, yMax, 1
    );
    // Convert the types.
    Function<Number, Number> fInt = x -> EditMe.plotIntFunction(x.intValue());
    Function<Number, Number> fDouble = x -> EditMe.plotDoubleFunction(x.doubleValue());

    multiPlot = new MultiPlot(
        List.of(fInt, fDouble),
        List.of(increment, increment),
        List.of(defColors),
        xLow, xMax,
        axes
    );
    plotVs(stage, multiPlot);

  }

  private void plotVs(Stage stage, MultiPlot plot) {

    // Mostly styling.
    BorderPane layout = new BorderPane(plot);
    Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16);
    Label labelOne = new Label("Integer");
    labelOne.setTextFill(defColors[0]);
    labelOne.setStyle(
        "-fx-background-color: rgb(35,39,50);"
    );
    labelOne.setFont(font);

    Label labelTwo = new Label("Double");
    labelTwo.setTextFill(defColors[1]);
    labelTwo.setStyle(
        "-fx-background-color: rgb(35,39,50);"
    );
    labelTwo.setFont(font);

    VBox legend = new VBox(labelOne, labelTwo);
    legend.setAlignment(Pos.CENTER_RIGHT);
    legend.setPadding(new Insets(10));

    layout.setPadding(new Insets(20));
    layout.setStyle("-fx-background-color: rgb(35,39,50);");

    layout.setTop(legend);

    stage.setTitle("Playground");

    stage.setScene(new Scene(layout, Color.rgb(35, 39, 50)));

    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
