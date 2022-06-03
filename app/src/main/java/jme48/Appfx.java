package jme48;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

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
            FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/interfaces/example.fxml"));
            root = loader.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Caught IOException");
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(root, 300, 275);

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