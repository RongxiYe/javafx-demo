package com.example.javafxdemo.controller.user;

import com.example.javafxdemo.data.UserData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PrintPageController {
    @FXML
    private Label airLineInfo;
    private Label extraPay;
    public AnchorPane checkinanchor;
    private UserData userData;

    public void init(UserData userData){
        this.userData = userData;
    }

    @FXML
    protected void onClickPrintMaterialButton() throws IOException {


    }

}
