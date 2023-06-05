package com.example.prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerHalamanUtama implements Initializable {
    @FXML
    private VBox kategoriVbox;
    @FXML
    private AnchorPane restoItemsContainer;
    @FXML
    private ScrollPane SP;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Kategori kt: Database.getListKategori()) {
            Button bt = new Button(kt.getNama());
            bt.setId(kt.getNama());
            bt.setPrefSize(95,45);
            kategoriVbox.setSpacing(10);
            kategoriVbox.getChildren().add(bt);
        }
    }
    @FXML
    public void readKategori(String namaKategori){
        for (Kategori kt:Database.getListKategori()) {
            if (kt.getNama().equals(namaKategori)){
                Label title = new Label();
                title.setText(("Daftar tempat makan berdasarkan kategori: "+kt.getNama()+" ("+kt.getDaftarRm().size()+" tempat makan was found)"));
                title.setStyle("-fx-font-weight: bold");
                title.setPrefSize(900,50);
                title.setFont(new Font("Arial",20));
                title.setCenterShape(true);
                VBox ap = new VBox();
                ap.getChildren().add(title);
                for (RumahMakan rm : kt.getDaftarRm()) {
                    FlowPane fp = new FlowPane();
                    fp.setPrefSize(700,135);
                    ImageView imgv = new ImageView();
                    Image img = new Image("file:///F:/Documents/UKDW/Semester%204/Praktikum%20RPL-BO/Project/mangan/src/main/resources/com/example/images/nasiIcon.jpg");
                    imgv.setImage(img);
                    imgv.setFitHeight(120);
                    imgv.setFitWidth(120);
                    Label lb = new Label(rm.getName());
                    fp.getChildren().addAll(imgv,lb);
                    ap.getChildren().add(fp);
                }
                SP.setContent(ap);
            }
        }
    }
    @FXML
    public void readClicked(){
        for (Node node:kategoriVbox.getChildren()) {
            node.setOnMouseClicked(event -> {
                readKategori(node.idProperty().getValue());
            });
        }
    }
    public void toEditKategori(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("editkategori.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void toSearchByKeywordAdmin(MouseEvent event) throws IOException {
        Scene currentScene = ((Node) event.getSource()).getScene();
        TextField search = (TextField) currentScene.lookup("#searchBar");

        Parent root = FXMLLoader.load(getClass().getResource("pencarianBedasarkankatakunciAdmin.fxml"));
        Scene scene = new Scene(root);
        root.applyCss();
        root.layout();
        Label label = (Label) root.lookup("#label");
        ScrollPane scrollPane = ((ScrollPane) root.lookup("#result"));
        VBox vbox = new VBox(5);
        ArrayList<RumahMakan> rmlist = Database.toSearchByKeyword(search.getText());
        for (RumahMakan rm: rmlist) {
            vbox.getChildren().add(rm.getNamaRumahMakan());
        }
        scrollPane.setContent(vbox);
        label.setText("Warung yang menjual "+search.getText());
        ((Stage) currentScene.getWindow()).setScene(scene);

    }

    public void toTambahTempatMakan(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("tambahTempatMakan.fxml"));
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
        Label label = (Label) root.lookup("#label");
        ScrollPane scrollPane = ((ScrollPane) root.lookup("#result"));
        VBox vbox = new VBox(5);
        ArrayList<RumahMakan> rmlist = Database.toSearchByKeyword(search.getText());
        for (RumahMakan rm: rmlist) {
            vbox.getChildren().add(rm.getNamaRumahMakan());
        }
        scrollPane.setContent(vbox);
        label.setText("Warung yang menjual "+search.getText());
        ((Stage) currentScene.getWindow()).setScene(scene);

    }
    public void toLogin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginAdmin.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public void nasiGorengYaul(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("nasiGorengYaul.fxml"));
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
}
