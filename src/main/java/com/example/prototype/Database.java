package com.example.prototype;

import java.util.ArrayList;
import java.util.Objects;

import javafx.scene.chart.PieChart.Data;

public class Database {
    
    public static ArrayList<RumahMakan> ListRumahMakan = new ArrayList<>();
    public static ArrayList<User> arrUser = new ArrayList<>();

    public static ArrayList<RumahMakan> toSearchByKeyword(String keyWord) {
        ArrayList<RumahMakan> rmlist = new ArrayList<>();
        for (RumahMakan rm: ListRumahMakan) {
            if ((rm.getName().toLowerCase()).contains(keyWord.toLowerCase())) {
                rmlist.add(rm);
            }

        }
        return rmlist;
    }
    public static ArrayList<RumahMakan> toSearchByCategory(String keyWord) {
        ArrayList<RumahMakan> rmlist = new ArrayList<>();
        for (RumahMakan rm: ListRumahMakan) {
            if ((rm.getKategori().toLowerCase()).contains(keyWord.toLowerCase())) {
                rmlist.add(rm);
            }

        }
        return rmlist;
    }

    public static boolean cekUser(String username, String password){
        for (User u: arrUser) {
            if (Objects.equals(u.getUsername(), username) && Objects.equals(u.getPassword(), password)){
                return true;
            }
        }
        return false;
    }
    public static void display() {
        for (RumahMakan rm: ListRumahMakan) {
            rm.display();
        }
    }

    public static void add(RumahMakan rm) {
        ListRumahMakan.add(rm);
    }
    public static void add(User user){arrUser.add(user);}
}
