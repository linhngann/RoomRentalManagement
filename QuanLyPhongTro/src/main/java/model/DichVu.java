/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;



/**
 *
 * @author ASUS
 */
public class DichVu {
    private int IdDichVu;
    private String maDichVu;
    private String TenDichVu;
    private double gia;
    private String donViTinh;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String trangThai;

    public DichVu() {
    }

    public DichVu(int IdDichVu, String maDichVu, String TenDichVu, double gia, String donViTinh, Date ngayBatDau, Date ngayKetThuc, String trangThai) {
        this.IdDichVu = IdDichVu;
        this.maDichVu = maDichVu;
        this.TenDichVu = TenDichVu;
        this.gia = gia;
        this.donViTinh = donViTinh;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public int getIdDichVu() {
        return IdDichVu;
    }

    public void setIdDichVu(int IdDichVu) {
        this.IdDichVu = IdDichVu;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
