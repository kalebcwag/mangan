package com.example.prototype;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RumahMakan {
    
    int id;
    String name;
    String noTelp;
    String kategori;
    String alamat;
    static int idNow = 0;
    Button namaRumahMakan;
    Parent root;
    Scene akar;
    ArrayList<RumahMakan> listRM = new ArrayList<>();

    public RumahMakan(String name, String noTelp, String kategori, String alamat) {
        this.name = name;
        this.noTelp = noTelp;
        this.kategori = kategori;
        this.alamat = alamat;
        this.id = idNow;
        idNow++;
        FXMLLoader fxmlLoader = new FXMLLoader(RumahMakan.class.getResource("detailTempatUser.fxml"));
        try {
            this.root = (Parent) fxmlLoader.load();
            akar = new Scene(root);
            root.applyCss();
            root.layout();
            ((Label) root.lookup("#namaTempat")).setText(this.name);
            ((Label) root.lookup("#notelp")).setText("No Telp.\t: "+this.noTelp);
            ((Label) root.lookup("#kategori")).setText("Kategori\t: "+this.kategori);
            ((Label) root.lookup("#alamatresto")).setText("Alamat\t: "+this.alamat);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        Stage stage = new Stage();
        stage.setScene(akar);
        stage.showAndWait();
    }

    public Parent getRoot() {
        return this.root;
    }

    public Button getNamaRumahMakan() {
        namaRumahMakan = new Button(this.name);
        namaRumahMakan.setMinWidth(200);
        namaRumahMakan.setMinHeight(200);
        namaRumahMakan.setOnAction(e -> {
            display();
        });
        return namaRumahMakan;
    }

    





}