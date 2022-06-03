package jme48;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.FileInputStream;
import java.io.IOException;

public class Appfx extends Application {

    @Override
    public void start(Stage stage) {
        System.out.println("Called start");
        initUI(stage);
    }

    private void initUI(Stage stage) {
        System.out.println("Called initUI");
        Parent root;
        try {
            final FXMLLoader loader = new FXMLLoader();
            //FileInputStream fileInputStream = new FileInputStream("src/main/resources/interfaces/example.fxml");
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/interfaces/bg_image.fxml");
            root = loader.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Caught IOException");
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(root, 300, 300);

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