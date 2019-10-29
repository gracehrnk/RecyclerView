package com.example.a1718040_recyclerview;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;

import java.util.ArrayList;

public class Daftar {
    private String nama, isi;
    private Drawable gambar;

    public Daftar(String nama, String isi,Drawable gambar)
    {
        this.nama = nama;
        this.isi = isi;
        this.gambar = gambar;
    }

    public Daftar(ArrayList<Daftar> daftarArrayList) {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
