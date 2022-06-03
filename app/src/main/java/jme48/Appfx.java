package jme48;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Appfx extends Application {

    @Override
    public void start(Stage stage) {
        System.out.println("Called start");
        initUI(stage);
    }

    private void initUI(Stage stage) {
        System.out.println("Called initUI");
        var root = new StackPane();

        var scene = new Scene(root, 300, 250);

        var lbl = new Label("Simple JavaFX application.");
        lbl.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
        root.getChildren().add(lbl);

        stage.setTitle("Simple application");
        stage.setScene(scene);
        stage.show();
        System.out.println("End initUI");
    }

    public static void main(String[] args) {
        System.out.println("Launching app");
        launch(args);
        System.out.println("App launched");
    }
}