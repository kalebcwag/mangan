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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

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
    App app = App.getApp();

    @FXML
    private Label warning;

    @FXML
    void toHalamanUtamaAdmin(MouseEvent event) {

    }

    @FXML
    public void toHalamanUtamaUser(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaUser.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public PasswordField getPassword() {
        return password;
    }

    public void login(MouseEvent event) throws IOException {
        if (username.getText() != null && password.getText() != null) {
            String username = this.username.getText();
            String password = this.password.getText();
            Scene currentScene = ((Node) event.getSource()).getScene();
            TextField search = (TextField) currentScene.lookup("#username");

            if (Database.cekUser(username, password)){
                app.changeScene("halamanUtamaAdmin.fxml");
                Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaAdmin.fxml"));
                Scene scene = new Scene(root);
                root.applyCss();
                root.layout();
                Label label = (Label) root.lookup("#haiUser");
                label.setText("Hai, "+search.getText());
            }
        }
    }

    public void register(MouseEvent event) throws IOException {
        if (username.getText() != null && password.getText() != null) {
            String username = this.username.getText();
            String password = this.password.getText();
            User u = new User(username, password);
            Database.addUser(u);
            app.changeScene("loginAdmin.fxml");
        }
    }

    public TextField getUsername() {
        return username;
    }

    public Label getWarning() {
        return warning;
    }
}
