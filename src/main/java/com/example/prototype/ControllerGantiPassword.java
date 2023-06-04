package com.example.prototype;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerGantiPassword {

    @FXML
    private Button batalButton;

    @FXML
    private Pane judul;

    @FXML
    private Label judulBesar;

    @FXML
    private Label judulKecil;

    @FXML
    private PasswordField konfirmasiPasswordBaru;

    @FXML
    private Label labelGantiPassword;

    @FXML
    private Label labelKonfirmasi;

    @FXML
    private Label labelPasswordBaru;

    @FXML
    private Label labelPasswordLama;

    @FXML
    private PasswordField passwordBaru;

    @FXML
    private PasswordField passwordLama;

    @FXML
    private ImageView profilUser;

    @FXML
    private Separator separator;

    @FXML
    private Button simpanButton;

    App app = App.getApp();

    @FXML
    void toGantiPassword(MouseEvent event) {

    }

    @FXML
    void toLogin(MouseEvent event) {

    }

    @FXML
    void change(MouseEvent event) throws IOException {
        String user = app.user;
        for (User u:Database.getArrUser()) {
            if(u.getUsername().equals(user) && passwordLama.getText().equals(u.getPassword()) && passwordBaru.getText().equals(konfirmasiPasswordBaru.getText())){
                u.setPassword(passwordBaru.getText());
                App.changeScene("halamanUtamaAdmin.fxml");
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

}
