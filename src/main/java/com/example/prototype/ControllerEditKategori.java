package com.example.prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerEditKategori implements Initializable {

    @FXML
    private TextField kategoriName;
    @FXML
    private ListView<String> myKategoriList;

    @FXML
    private void loadKategoriData(){
        for (Kategori kt:Database.getListKategori()){
            myKategoriList.getItems().add(kt.getNama());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadKategoriData();
    }

    public void toHalamanUtamaAdmin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void addKategori(){
        Kategori newKt = new Kategori(kategoriName.getText());
        Database.addCategory(newKt);
        myKategoriList.getItems().add(newKt.getNama());
    }
    @FXML
    private void deleteKategori(){
        int index = myKategoriList.getSelectionModel().getSelectedIndex();
        Database.deleteKategori(index);
        myKategoriList.getItems().remove(index);
    }
}