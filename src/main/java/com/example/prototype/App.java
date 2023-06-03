package com.example.prototype;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        RumahMakan[] rm = {new RumahMakan("Nasi Goreng Bang Rusdi", "0271", "Nasi", "Ngawi"),
        new RumahMakan("Nasi Cumi Hitam Pak Kris", "0821190889", "Nasi", "jl condong"),
        new RumahMakan("Mie Goreng Jawa", "08334677639", "Mie", "jl munggur"),
        new RumahMakan("Ayam Goreng", "0893948378499", "Snack", "jl kaliurang"),
        new RumahMakan("Pasta frizz", "08111908939", "Mie", "jl gatot")
        };
        for (RumahMakan r : rm) {
            Database.add(r);
        }
        Parent root = FXMLLoader.load(getClass().getResource("halamanUtamaUser.fxml"));
        stage.setTitle("Halaman Utama");

        stage.setScene(new Scene(root));
        stage.show();
        // db.display();

    }

    public static void main(String[] args) {
        launch();
    }


}
