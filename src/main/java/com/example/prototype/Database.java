package com.example.prototype;

import java.util.ArrayList;

import javafx.scene.chart.PieChart.Data;

public class Database {
    
    public static ArrayList<RumahMakan> ListRumahMakan = new ArrayList<>();

    public static ArrayList<RumahMakan> toSearchByKeyword(String keyWord) {
        ArrayList<RumahMakan> rmlist = new ArrayList<>();
        for (RumahMakan rm: ListRumahMakan) {
            if ((rm.name.toLowerCase()).contains(keyWord.toLowerCase())) {
                rmlist.add(rm);
            }

        }
        return rmlist;
    }
    public static ArrayList<RumahMakan> toSearchByCategory(String keyWord) {
        ArrayList<RumahMakan> rmlist = new ArrayList<>();
        for (RumahMakan rm: ListRumahMakan) {
            if ((rm.kategori.toLowerCase()).contains(keyWord.toLowerCase())) {
                rmlist.add(rm);
            }

        }
        return rmlist;
    }

    public static void display() {
        for (RumahMakan rm: ListRumahMakan) {
            rm.display();
        }
    }

    public static void add(RumahMakan rm) {
        ListRumahMakan.add(rm);
    }
}
