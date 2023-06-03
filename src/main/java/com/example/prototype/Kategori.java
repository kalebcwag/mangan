package com.example.prototype;

import java.util.ArrayList;

public class Kategori {
    private String nama;
    private ArrayList<RumahMakan> daftarRm = new ArrayList<RumahMakan>();
    public Kategori(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void addRm(RumahMakan rm){
        this.daftarRm.add(rm);
    }
    public void removeRm(RumahMakan rm){
        this.daftarRm.remove(rm);
    }
}
