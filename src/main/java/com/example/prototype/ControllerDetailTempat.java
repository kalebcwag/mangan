package com.example.prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerDetailTempat {

    @FXML
    private Button backButton;

    @FXML
    private AnchorPane bgUlasan;

    @FXML
    private AnchorPane body;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private ImageView gambarTempat;

    @FXML
    private Pane judul;

    @FXML
    private Label judulBesar;

    @FXML
    private Label judulKecil;

    @FXML
    private Label labelUlasan;

    @FXML
    private Label namaTempat;

    @FXML
    private ImageView profilUser;

    @FXML
    private Separator separator;

    @FXML
    public void delete(MouseEvent event) throws IOException {
        try {
            String namaRM = namaTempat.getText();
            for (RumahMakan rm:Database.getListRumahMakan()) {
                if(namaRM.equals(rm.getName())){
                    Database.getListRumahMakan().remove(rm);
                    App.changeScene("halamanUtamaAdmin.fxml");
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void toGantiPassword(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("formGantiPassword.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toHalamanUtamaAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toLogin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

}
