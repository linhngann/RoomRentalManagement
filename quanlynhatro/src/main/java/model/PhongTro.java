/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author nm204
 */
public class PhongTro {
    private int idPhongTro;
    private int idNhaTro;
    private String maNhaTro;
    private float chieuDai;
    private float chieuRong;
    private Date ngayBatDau;
    private String trangThai;

    public PhongTro() {
    }

    public PhongTro(int idPhongTro, int idNhaTro, String maNhaTro, float chieuDai, float chieuRong, Date ngayBatDau, String trangThai) {
        this.idPhongTro = idPhongTro;
        this.idNhaTro = idNhaTro;
        this.maNhaTro = maNhaTro;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.ngayBatDau = ngayBatDau;
        this.trangThai = trangThai;
    }

    public int getIdPhongTro() {
        return idPhongTro;
    }

    public void setIdPhongTro(int idPhongTro) {
        this.idPhongTro = idPhongTro;
    }

    public int getIdNhaTro() {
        return idNhaTro;
    }

    public void setIdNhaTro(int idNhaTro) {
        this.idNhaTro = idNhaTro;
    }

    public String getMaNhaTro() {
        return maNhaTro;
    }

    public void setMaNhaTro(String maNhaTro) {
        this.maNhaTro = maNhaTro;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
