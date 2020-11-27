module Playground {

  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.swing;

  opens plots to javafx.fxml, javafx.graphics;
  opens john to javafx.fxml, javafx.graphics;
}