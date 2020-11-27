package john;

import java.util.Set;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Game {

  public static final double RADIUS = 30d;
  public BorderPane background;
  public Rectangle r0;
  public Rectangle r1;
  public Rectangle r2;
  public Rectangle r3;
  public ImageView cookie;
  private Set<Rectangle> obstacles;
  private John john;
  private AnimationTimer gameLoop;


  @FXML
  public void initialize() {
    // This function is called after the scene is created.
    this.obstacles = Set.of(r0, r1, r2, r3);
    john = new John(50, 50);
    background.getChildren().addAll(john.create());
    // This can be understood as the main game-loop.
    gameLoop =
        new AnimationTimer() {
          @Override
          public void handle(long currentNanoTime) {
            // This function will be called (approximately) 60 times a second
            editMe();
          }
        };
    gameLoop.start();

  }

  private void editMe() {
    // TODO: Move john safely to the cookie!
    // This function should update john position.
    // It is roughly called 60 times a second, therefore your increment should be relatively small.

    // Get the current position from john.
    double currentX = john.getX();
    double currentY = john.getY();

    // Define the increment by which johns position should change.
    double xInc = 0.5;
    double yInc = 0.0d;

    // Test if your next move would result in a collision with doesJohnCollide.
    // for example: boolean crash = doesJohnCollide(currentX + 1d, currentY +1d);

    moveJohn(xInc, yInc);
  }

  private void moveJohn(double xInc, double yInc) {
    // Update johns coordinates if no collision is detected.
    double x = john.getX() + xInc;
    double y = john.getY() + yInc;

    // Check if the game is won.
    if (johnGotTheCookie(x, y)) {
      // End the game-loop.
      gameLoop.stop();
      // Set the victory scene
      background.getChildren().clear();
      Label victory = new Label("Yum yum yum");
      victory.setAlignment(Pos.CENTER);
      victory.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 25));
      background.setCenter(victory);
      // End the application on click.
      background.setOnMouseClicked(mouseEvent -> JohnGame.exit());
    }

    boolean collision = doesJohnCollide();
    if (!collision) {
      // Check if the player moved john outside of the screen,
      if (!background.contains(x, y)) {
        System.err.println("John is not within the scene.");
      }
      // Update johns coordinates.
      john.update(x, y);
    } else {
      // Collision detected → Reset john.
      System.err.println("John collided with an object");
      john.update(50, 50);
    }
  }

  private boolean johnGotTheCookie(double x, double y) {
    double cr = cookie.getFitWidth() / 2d;
    double cx = cookie.getLayoutX() + cr;
    double cy = cookie.getLayoutY() + cr;
    return Math.abs((x - cx) * (x - cx) + (y - cy) * (y - cy)) < (RADIUS + cr) * (RADIUS + cr);

  }

  private boolean doesJohnCollide() {
    // helper method for the player.
    return obstacles.stream()
        .anyMatch(r -> circleRectangleIntersection(john.getX(), john.getY(), r));
  }


  private boolean circleRectangleIntersection(double cx, double cy, final Rectangle rect) {
    // Test if a circle and a rectangle collide.
    // credits to http://jeffreythompson.org/collision-detection/circle-rect.php
    double rx = rect.getLayoutX();
    double ry = rect.getLayoutY();
    double width = rect.getWidth();
    double height = rect.getHeight();

    double testX = cx;
    double testY = cy;
    if (cx < rx) {
      testX = rx;
    } else if (cx > rx + width) {
      testX = rx + width;
    }
    if (cy < ry) {
      testY = ry;
    } else if (cy > ry + height) {
      testY = ry + height;
    }
    double distX = cx - testX;
    double distY = cy - testY;
    double distance = Math.sqrt((distX * distX) + (distY * distY));

    return distance <= Game.RADIUS;

  }

}
