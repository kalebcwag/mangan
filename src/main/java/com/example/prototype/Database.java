package com.example.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javafx.scene.chart.PieChart.Data;

public class Database {
    private static ArrayList<User> arrUser = new ArrayList<User>();
    private static ArrayList<RumahMakan> ListRumahMakan = new ArrayList<RumahMakan>();
    private static ArrayList<Kategori> listKategori = new ArrayList<Kategori>();

    public static void addUser(User user){arrUser.add(user);}
    public static void addRm(RumahMakan rm) {ListRumahMakan.add(rm);}
    public static void addCategory(Kategori kategori){listKategori.add(kategori);}

    public static ArrayList<User> getArrUser(){
        return arrUser;
    }

    public static ArrayList<RumahMakan> toSearchByKeyword(String keyWord) {
        ArrayList<RumahMakan> rmlist = new ArrayList<>();
        for (RumahMakan rm: ListRumahMakan) {
            if ((rm.getName().toLowerCase()).contains(keyWord.toLowerCase())) {
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

    public static ArrayList<Kategori> getListKategori() {
        return listKategori;
    }
    public static ArrayList<RumahMakan> getListRumahMakan() {
        return ListRumahMakan;
    }

    public static void deleteKategori(int index){
        listKategori.remove(index);
    }
}
