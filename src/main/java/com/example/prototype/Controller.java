package com.example.prototype;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
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
    private User admin = new User("admin", "admin");
    private User user = new User("user", "user");
    private loginPage lp = new loginPage();
    App app = App.getApp();

    HashMap<String, String> userMap = new HashMap<String, String>();

    public void putUsers(){
        userMap.put("admin", "admin");
        userMap.put("user", "user");
    }


    public void toLogin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void login(MouseEvent event) throws IOException {
        if (lp.getUsername() != null || lp.getPassword() != null) {
            String username = lp.getUsername().getText();
            String password = lp.getPassword().getText();

            if (Database.cekUser(username, password)){
                app.changeScene("halamanUtamaAdmin.fxml");
            }
        }
    }


    public void toHalamanUtamaAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toSearchByKeyword(MouseEvent event) throws IOException {
        Scene currentScene = ((Node) event.getSource()).getScene();
        TextField search = (TextField) currentScene.lookup("#searchBar");

        Parent root = FXMLLoader.load(getClass().getResource("pencarianBedasarkankatakunci.fxml"));
        Scene scene = new Scene(root);
        root.applyCss();
        root.layout();
        ScrollPane scrollPane = ((ScrollPane) root.lookup("#result"));
        VBox vbox = new VBox(5);
        ArrayList<RumahMakan> rmlist = Database.toSearchByKeyword(search.getText());
        for (RumahMakan rm: rmlist) {
            vbox.getChildren().add(rm.getNamaRumahMakan());
        }
        scrollPane.setContent(vbox);
        ((Stage) currentScene.getWindow()).setScene(scene);;
        
    }

    public void toSearchByCategories(MouseEvent event) throws IOException {
        Scene currentScene = ((Node) event.getSource()).getScene();
        Parent root = FXMLLoader.load(getClass().getResource("pencarianBedasarkankategori.fxml"));

        root.applyCss();
        root.layout();
        Scene scene = new Scene(root);
        ScrollPane scrollPane = (ScrollPane) root.lookup("#scrollpane");
        VBox vbox = new VBox(5);
        ArrayList<RumahMakan> rmlist = Database.toSearchByCategory("Nasi");
        for (RumahMakan rm: rmlist) {
            vbox.getChildren().add(rm.getNamaRumahMakan());
        }
        scrollPane.setContent(vbox);
        ((Stage) currentScene.getWindow()).setScene(scene);;
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toEditKategori(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("editkategori.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toEditTempatMakan(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("editInformasi.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toDetailTempat(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("detailTempat.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toDetailTempatUser(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("detailTempatUser.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toFormGantiPassword(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("formGantiPassword.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toTambahTempatMakan(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tambahTempatMakan.fxml"));
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
