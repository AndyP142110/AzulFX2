package com.example.azulfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HelloController {
    @FXML
    private Pane Menu;

    @FXML
    void startGame(ActionEvent event) throws IOException {
        Gamestate gamestate = new Gamestate();
        Menu.setVisible(false);
        HelloApplication.showGame();
    }
}
