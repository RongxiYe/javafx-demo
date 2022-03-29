package com.example.javafxdemo.controller;

import com.example.javafxdemo.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {
    @FXML
    public AnchorPane mainanchor;


    public void init() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        AnchorPane root = fxmlLoader.load();
        mainanchor.getChildren().add(root);
    }

}
