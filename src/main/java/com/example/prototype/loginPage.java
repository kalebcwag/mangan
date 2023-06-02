package com.example.prototype;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class loginPage {

    @FXML
    private ImageView gambarProfil;

    @FXML
    private Pane judul;

    @FXML
    private Label judulBesar;

    @FXML
    private Label judulKecil;

    @FXML
    private Label labelLogin;

    @FXML
    private Label labelPassword;

    @FXML
    private Label labelUsername;

    @FXML
    private Button loginButton;

    @FXML
    private Button loginButton1;

    @FXML
    private PasswordField password;

    @FXML
    private Separator separator;

    @FXML
    private TextField username;

    @FXML
    private Label warning;

    @FXML
    void toHalamanUtamaAdmin(MouseEvent event) {

    }

    @FXML
    void toHalamanUtamaUser(MouseEvent event) {

    }

    public PasswordField getPassword() {
        return password;
    }

    public TextField getUsername() {
        return username;
    }

    public Label getWarning() {
        return warning;
    }
}
