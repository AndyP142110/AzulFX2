package com.example.azulfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static Stage stage;


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        this.stage = stage;
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void showGame() throws IOException {
        stage.hide();
        Stage game = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Board.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        game.setResizable(false);
        game.setScene(scene);
        game.show();
    }

    public static void main(String[] args) {
        launch();
    }
}