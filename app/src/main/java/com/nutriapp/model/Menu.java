package com.nutriapp.model;

public class Menu {
    private int imgMenu;
    private String namaMenu;
    private int kaloriMenu;

    public Menu(int imgMenu, String namaMenu, int kaloriMenu) {
        this.imgMenu = imgMenu;
        this.namaMenu = namaMenu;
        this.kaloriMenu = kaloriMenu;
    }

    public int getImgMenu() {
        return imgMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public int getKaloriMenu() {
        return kaloriMenu;
    }
}
