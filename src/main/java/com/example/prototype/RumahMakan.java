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
    
    private int id;
    private String name;
    private String noTelp;
    private Kategori kategori;
    private String alamat;
    private static int idNow = 0;
    private Button namaRumahMakan;
    private Parent root;
    private Scene akar;
    private ArrayList<RumahMakan> listRM = new ArrayList<>();

    public RumahMakan(String name, String noTelp, Kategori kategori, String alamat) {
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public String getAlamat() {
        return alamat;
    }

    public static int getIdNow() {
        return idNow;
    }

    public Scene getAkar() {
        return akar;
    }

    public ArrayList<RumahMakan> getListRM() {
        return listRM;
    }
}