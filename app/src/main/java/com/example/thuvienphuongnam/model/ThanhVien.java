package com.example.thuvienphuongnam.model;

public class ThanhVien {
    public int maTV;
    public String hoTen;
    public String namSinh;



    public ThanhVien() {
    }

    public ThanhVien(int maTV, String hoTen, String namSinh) {
        this.maTV = maTV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

//    public ThanhVien(int maTV, String hoTen, String namSinh, String cccd) {
//        this.maTV = maTV;
//        this.hoTen = hoTen;
//        this.namSinh = namSinh;
//        this.cccd = cccd;
//    }

    public int getMaTV() {
        return maTV;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

//    public String getCccd() {
//        return cccd;
//    }
//
//    public void setCccd(String cccd) {
//        this.cccd = cccd;
//    }
}
