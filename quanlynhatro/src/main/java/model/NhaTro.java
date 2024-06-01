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
public class NhaTro {
    private int idNhaTro;
    private String maNhaTro;
    private String tenNhaTro;
    private String diaChi;
    private int soLuongPhong;
    private Date ngayBatDau;
    private String trangThai;
    private int idNhanVienQuanLy;

    public NhaTro() {
    }

    public NhaTro(int idNhaTro, String maNhaTro, String tenNhaTro, String diaChi, int soLuongPhong, Date ngayBatDau, String trangThai, int idNhanVienQuanLy) {
        this.idNhaTro = idNhaTro;
        this.maNhaTro = maNhaTro;
        this.tenNhaTro = tenNhaTro;
        this.diaChi = diaChi;
        this.soLuongPhong = soLuongPhong;
        this.ngayBatDau = ngayBatDau;
        this.trangThai = trangThai;
        this.idNhanVienQuanLy = idNhanVienQuanLy;
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

    public String getTenNhaTro() {
        return tenNhaTro;
    }

    public void setTenNhaTro(String tenNhaTro) {
        this.tenNhaTro = tenNhaTro;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoLuongPhong() {
        return soLuongPhong;
    }

    public void setSoLuongPhong(int soLuongPhong) {
        this.soLuongPhong = soLuongPhong;
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

    public int getIdNhanVienQuanLy() {
        return idNhanVienQuanLy;
    }

    public void setIdNhanVienQuanLy(int idNhanVienQuanLy) {
        this.idNhanVienQuanLy = idNhanVienQuanLy;
    }

    
}
