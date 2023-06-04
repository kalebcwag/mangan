package com.example.prototype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static Stage stage;
    private static App app;

    @Override
    public void start(Stage stage) throws Exception {
        app = this;
        App.stage = stage;
        User kaleb = new User("kaleb", "kaleb");
        User yandi = new User("yandi", "yandi");
        User glen = new User("glen", "glen");

        Kategori k1 = new Kategori("Nasi");
        Kategori k2 = new Kategori("Mie");
        Kategori k3 = new Kategori("Snack");

        Database.addUser(kaleb);
        Database.addUser(yandi);
        Database.addUser(glen);

        RumahMakan[] rm = {new RumahMakan("Nasi Goreng Bang Rusdi", "0271", k1, "Ngawi"),
        new RumahMakan("Nasi Cumi Hitam Pak Kris", "0821190889", k1, "jl condong"),
        new RumahMakan("Mie Goreng Jawa", "08334677639", k2, "jl munggur"),
        new RumahMakan("Ayam Goreng", "0893948378499", k3, "jl kaliurang"),
        new RumahMakan("Pasta frizz", "08111908939", k2, "jl gatot")
        };
        for (RumahMakan r : rm) {
            Database.addRm(r);
        }

        Database.addCategory(k1);
        Database.addCategory(k2);
        Database.addCategory(k3);

        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaUser.fxml"));
        stage.setTitle("Halaman Utama");

        stage.setScene(new Scene(root));
        stage.show();
        // db.display();

    }

    public static void main(String[] args) {
        launch();
    }

    public static App getApp(){ return app;}
    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stage.getScene().setRoot(pane);
    }


}
