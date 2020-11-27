package john;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JohnGame extends Application {

  private static Stage pStage;

  public static void exit() {
    pStage.close();
  }

  @Override
  public void start(Stage stage) throws Exception {
    // Load the level and set it as scene.
    // The level will start the game-loop on its own.
    pStage = stage;
    Pane pane = FXMLLoader.load(JohnGame.class.getResource("level.fxml"));
    stage.setScene(new Scene(pane));
    stage.show();
  }


}
