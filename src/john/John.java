package john;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class John {

  private final DoubleProperty x;
  private final DoubleProperty y;
  public static final int RADIUS = 30;
  private Group john;

  public John(double x, double y) {
    this.x = new SimpleDoubleProperty(x);
    this.y = new SimpleDoubleProperty(y);
  }

  public Group create() {
    // Define the visual representation of john and bind the shapes to x and y.
    if (john == null) {
      john = new Group();
      Circle face = new Circle(RADIUS, Color.YELLOW);
      face.centerXProperty().bind(x);
      face.centerYProperty().bind(y);
      john.getChildren().add(face);

      Circle leftEye = new Circle(RADIUS / 10.0, Color.BLACK);
      leftEye.centerXProperty().bind(Bindings.subtract(x, RADIUS / 3.0));
      leftEye.centerYProperty().bind(Bindings.subtract(y, RADIUS / 3.0));
      john.getChildren().add(leftEye);

      Circle rightEye = new Circle(RADIUS / 10.0, Color.BLACK);
      rightEye.centerXProperty().bind(Bindings.add(RADIUS / 3.0, x));
      rightEye.centerYProperty().bind(Bindings.subtract(y, RADIUS / 3.0));
      john.getChildren().add(rightEye);

      Arc smile = new Arc();
      smile.centerXProperty().bind(x);
      smile.centerYProperty().bind(y);
      smile.setRadiusX((RADIUS * 2) / 3.0);
      smile.setRadiusY((RADIUS * 2) / 3.0);
      smile.setStartAngle(180);
      smile.setLength(180);
      john.getChildren().add(smile);

      Arc smile2 = new Arc();//(RADIUS*2)/3,(RADIUS*2)/3,180,180);
      smile2.centerXProperty().bind(x);
      smile2.centerYProperty().bind(Bindings.add(RADIUS / 8, y));
      smile2.setRadiusX((RADIUS * 2) / 4.0);
      smile2.setRadiusY((RADIUS * 2) / 4.0);
      smile2.setStartAngle(180);
      smile2.setLength(180);
      smile2.setFill(Color.WHITE);
      john.getChildren().add(smile2);
    }
    return john;

  }

  public void update(double x, double y) {
    this.x.set(x);
    this.y.set(y);
  }

  public double getX() {
    return x.get();
  }

  public double getY() {
    return y.get();
  }
}
