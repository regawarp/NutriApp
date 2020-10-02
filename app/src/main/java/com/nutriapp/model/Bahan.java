package com.nutriapp.model;

public class Bahan {
    private int bahanImg;
    private String bahanName;
    private String bahanBerat;
    private String bahanUrt;
    private String bahanSatuan;
    private String bahanKeterangan;

    public Bahan(int bahanImg, String bahanName, String bahanBerat, String bahanUrt, String bahanSatuan, String bahanKeterangan) {
        this.bahanImg = bahanImg;
        this.bahanName = bahanName;
        this.bahanBerat = bahanBerat;
        this.bahanUrt = bahanUrt;
        this.bahanSatuan = bahanSatuan;
        this.bahanKeterangan = bahanKeterangan;
    }

    public String getBahanUrt() {
        return bahanUrt;
    }

    public int getBahanImg() {
        return bahanImg;
    }

    public String getBahanName() {
        return bahanName;
    }

    public String getBahanBerat() {
        return bahanBerat;
    }

    public String getBahanSatuan() {
        return bahanSatuan;
    }

    public String getBahanKeterangan() {
        return bahanKeterangan;
    }
}
