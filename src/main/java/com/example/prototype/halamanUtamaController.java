package com.example.prototype;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class halamanUtamaController {

    @FXML
    private Pane judul;

    @FXML
    private Label judulBesar;

    @FXML
    private Label judulKecil;

    @FXML
    private Label labelFavorites;

    @FXML
    private Label labelKategori;

    @FXML
    private Hyperlink loginAdmin;

    @FXML
    private static ListView<String> myKategoriList;

    @FXML
    private AnchorPane restoItemsContainer;

    @FXML
    private ListView<String> rumahMakanList;

    @FXML
    private TextField searchBar;

    @FXML
    private Separator separator;

    @FXML
    private Button tombolCari;

    @FXML
    void toLogin(MouseEvent event) {

    }

    @FXML
    void toSearchByKeyword(MouseEvent event) {

    }


}
