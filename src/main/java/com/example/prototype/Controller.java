package com.example.prototype;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    // Database db = new Database();

    public void toLogin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


    public void toHalamanUtamaAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toGantiPassword(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("formGantiPassword.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toHalamanUtamaUser(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaUser.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}
