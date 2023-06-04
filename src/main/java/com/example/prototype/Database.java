package com.example.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javafx.scene.chart.PieChart.Data;

public class Database {
    public static ArrayList<User> arrUser = new ArrayList<User>();
    public static ArrayList<RumahMakan> ListRumahMakan = new ArrayList<RumahMakan>();
    public static ArrayList<Kategori> listKategori = new ArrayList<Kategori>();

    public static void addUser(User user){arrUser.add(user);}
    public static void addRm(RumahMakan rm) {ListRumahMakan.add(rm);}
    public static void addCategory(Kategori kategori){listKategori.add(kategori);}

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
            if ((rm.getKategori().getNama().toLowerCase()).contains(keyWord.toLowerCase())) {
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
    public static void display() throws IOException {
        for (RumahMakan rm: ListRumahMakan) {
            rm.display();
        }
    }
    public static ArrayList<Kategori> getListKategori() {
        return listKategori;
    }

    public static void deleteKategori(int index){
        listKategori.remove(index);
    }
}
