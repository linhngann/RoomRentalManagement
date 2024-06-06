/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import database.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.NhaTro;

/**
 *
 * @author nm204
 */
public class NhaTroDAO {


    public void Insert(NhaTro nt) {
        Connection con = JDBCUtils.getConnection();
        
        String sql = "INSERT INTO tbl_nhatro (MANHATRO, TENNHATRO, DICHI, SOLUONGPHONG, STARTDATE, STATUS, IDNHANVIENQUANLY) "
           + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nt.getMaNhaTro());
            ps.setString(2, nt.getTenNhaTro());
            ps.setString(3, nt.getDiaChi());
            ps.setInt(4, nt.getSoLuongPhong());
            ps.setDate(5, new java.sql.Date(nt.getNgayBatDau().getTime()));
            ps.setString(6, nt.getTrangThai());
            ps.setInt(7, nt.getIdNhanVienQuanLy());
            
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void Update(NhaTro nt) {
        Connection con = JDBCUtils.getConnection();
        
        String sql = "UPDATE tbl_nhatro SET TENNHATRO = ?, DICHI = ?, SOLUONGPHONG = ?, STARTDATE = ?"
                      + ", STATUS = ?, IDNHANVIENQUANLY = ? WHERE IDNHATRO = ?";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, nt.getTenNhaTro());
            ps.setString(2, nt.getDiaChi());
            ps.setInt(3, nt.getSoLuongPhong());
            ps.setDate(4, new java.sql.Date(nt.getNgayBatDau().getTime()));
            ps.setString(5, nt.getTrangThai());
            ps.setInt(6, nt.getIdNhanVienQuanLy());
            ps.setInt(7, nt.getIdNhaTro());
            
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void Delete(int id) {
        Connection con = JDBCUtils.getConnection();
        
        String sql = "DELETE FROM tbl_nhatro WHERE IDNHATRO = ?";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void DeleteMa(String maNhaTro) {
        Connection con = JDBCUtils.getConnection();
        
        String sql = "DELETE FROM tbl_nhatro WHERE MANHATRO = ?";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,maNhaTro);
            
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public ArrayList<NhaTro> sellectAll() {
        List<NhaTro> nhatro = new ArrayList<>();
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_nhatro";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                NhaTro nt = new NhaTro();
                nt.setMaNhaTro(rs.getString("MANHATRO"));
                nt.setTenNhaTro(rs.getNString("TENNHATRO"));
                nt.setDiaChi(rs.getNString("DICHI"));
                nt.setSoLuongPhong(rs.getInt("SOLUONGPHONG"));
                nt.setNgayBatDau(rs.getDate("STARTDATE"));
                nt.setTrangThai(rs.getNString("STATUS"));
                nt.setIdNhanVienQuanLy(rs.getInt("IDNHANVIENQUANLY"));
                nhatro.add(nt);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return (ArrayList<NhaTro>) nhatro;
    }


    public NhaTro selectById(int id) {
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_nhatro WHERE IDNHATRO = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                NhaTro nt = new NhaTro();
                nt.setMaNhaTro(rs.getString("MANHATRO"));
                nt.setTenNhaTro(rs.getNString("TENNHATRO"));
                nt.setDiaChi(rs.getNString("DICHI"));
                nt.setSoLuongPhong(rs.getInt("SOLUONGPHONG"));
                nt.setNgayBatDau(rs.getDate("STARTDATE"));
                nt.setTrangThai(rs.getNString("STATUS"));
                nt.setIdNhanVienQuanLy(rs.getInt("IDNHANVIENQUANLY"));
                
                return nt;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public NhaTro selectByMa(String maNhaTro) {
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_nhatro WHERE MANHATRO = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maNhaTro);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                NhaTro nt = new NhaTro();
                nt.setIdNhaTro(rs.getInt("IDNHATRO"));
                nt.setMaNhaTro(rs.getString("MANHATRO"));
                nt.setTenNhaTro(rs.getNString("TENNHATRO"));
                nt.setDiaChi(rs.getNString("DICHI"));
                nt.setSoLuongPhong(rs.getInt("SOLUONGPHONG"));
                nt.setNgayBatDau(rs.getDate("STARTDATE"));
                nt.setTrangThai(rs.getNString("STATUS"));
                nt.setIdNhanVienQuanLy(rs.getInt("IDNHANVIENQUANLY"));
                
                return nt;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<NhaTro> selectByCondition(String name) {
        List<NhaTro> nhatro = new ArrayList<>();
        
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_nhatro WHERE TENNHATRO = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                NhaTro nt = new NhaTro();
                nt.setIdNhaTro(rs.getInt("IDNHATRO"));
                nt.setMaNhaTro(rs.getString("MANHATRO"));
                nt.setTenNhaTro(rs.getNString("TENNHATRO"));
                nt.setDiaChi(rs.getNString("DICHI"));
                nt.setSoLuongPhong(rs.getInt("SOLUONGPHONG"));
                nt.setNgayBatDau(rs.getDate("STARTDATE"));
                nt.setTrangThai(rs.getNString("STATUS"));
                nt.setIdNhanVienQuanLy(rs.getInt("IDNHANVIENQUANLY"));
                nhatro.add(nt);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return (ArrayList<NhaTro>) nhatro;
    }
    
}
