package com.example.prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class addRMController {

    @FXML
    private TextField alamat;

    @FXML
    private Button buttonUploadFoto;

    @FXML
    private Button cancelButton;

    @FXML
    private Label haiUser;

    @FXML
    private Pane judul;

    @FXML
    private Label judulBesar;

    @FXML
    private Label judulKecil;

    @FXML
    private TextField kategori;

    @FXML
    private Label labelAlamat;

    @FXML
    private Label labelNama;

    @FXML
    private Label labelNoHp;

    @FXML
    private Label labelTambahTempatMakan;

    @FXML
    private Label labelUploadFoto;

    @FXML
    private Label labelWebsite;

    @FXML
    private TextField nama;

    @FXML
    private TextField noHp;

    @FXML
    private ImageView profilUser;

    @FXML
    private Button saveButton;

    @FXML
    private Separator separator;

    @FXML
    public void toHalamanUtamaAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void add(MouseEvent event) throws IOException {
        String nama = this.nama.getText();
        String alamat = this.alamat.getText();
        String noTelp = this.noHp.getText();
        Kategori kategori = new Kategori(this.kategori.getText());
        RumahMakan rm = new RumahMakan(nama, noTelp, kategori, alamat);
        Database.addRm(rm);
        this.toHalamanUtamaAdmin(event);
    }

}
