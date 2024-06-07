/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import database.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.DichVu;

/**
 *
 * @author nm204
 */
public class DichVuDAO{
    
    public boolean isMaDichVuExists(String maDichVu) {
    Connection con = JDBCUtils.getConnection();
    String sql = "SELECT COUNT(*) FROM tbl_dichvu WHERE MADICHVU = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, maDichVu);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0; // Trả về true nếu mã dịch vụ đã tồn tại
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
    }
    public boolean isEndDateValid(LocalDate startDate, LocalDate endDate) {
        LocalDate currentDate = LocalDate.now();
        
        // Kiểm tra nếu ngày kết thúc nhỏ hơn hoặc bằng ngày bắt đầu
        if (endDate.isBefore(startDate)) {
            return false;
        }
        
        // Kiểm tra nếu ngày kết thúc lớn hơn ngày hiện tại
        if (endDate.isAfter(currentDate)) {
            return false;
        }
        
        return true;
    }
    public void Insert(DichVu dv, JFrame parentFrame) {
        if (isMaDichVuExists(dv.getMaDichVu())) {
             JOptionPane.showMessageDialog(parentFrame, "Mã dịch vụ đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return; // Không thực hiện chèn nếu mã dịch vụ đã tồn tại
        }
        LocalDate startDate = LocalDate.parse(dv.getNgayBatDau().toString());
            LocalDate endDate = LocalDate.parse(dv.getNgayKetThuc().toString());
            
            // Kiểm tra ngày kết thúc có hợp lệ không
            if (!isEndDateValid(startDate, endDate)) {
                javax.swing.JOptionPane.showMessageDialog(parentFrame, "Ngày kết thúc phải lớn hơn ngày bắt đầu và nhỏ hơn hoặc bằng ngày hiện tại.", "Lỗi nhập liệu", javax.swing.JOptionPane.ERROR_MESSAGE);
                return; // Dừng lại nếu có lỗi
            }
        Connection con = JDBCUtils.getConnection();
        String sql = "INSERT INTO tbl_dichvu (MADICHVU, TENDICHVU, GIA, DONVITINH, STARTDATE, ENDDATE, STATUS) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, dv.getMaDichVu());
        ps.setString(2, dv.getTenDichVu());
        ps.setDouble(3, dv.getGia());
        ps.setString(4, dv.getDonViTinh());
        ps.setDate(5, new java.sql.Date(dv.getNgayBatDau().getTime()));
        ps.setDate(6, new java.sql.Date(dv.getNgayKetThuc().getTime()));
        ps.setString(7, dv.getTrangThai());

        int rs = ps.executeUpdate();
        System.out.println(rs);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }


    public void Update(DichVu dv) {
        Connection con = JDBCUtils.getConnection();
    
        String sql = "UPDATE tbl_dichvu SET TENDICHVU = ?, GIA = ?, DONVITINH = ?, STARTDATE = ?, ENDDATE = ?, STATUS = ? WHERE MADICHVU = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dv.getTenDichVu());
            ps.setDouble(2, dv.getGia());
            ps.setString(3, dv.getDonViTinh());
            ps.setDate(4, new java.sql.Date(dv.getNgayBatDau().getTime()));
            ps.setDate(5, new java.sql.Date(dv.getNgayKetThuc().getTime()));
            ps.setString(6, dv.getTrangThai());
            ps.setString(7, dv.getMaDichVu());

            int rs = ps.executeUpdate();
            System.out.println("Số dòng cập nhật: " + rs);
            if(rs > 0) {
                System.out.println("Cập nhật thành công cho MADICHVU: " + dv.getMaDichVu());
            } else {
                System.out.println("Cập nhật thất bại cho MADICHVU: " + dv.getMaDichVu());
            }
        } catch (SQLException e) {
                e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                    e.printStackTrace();
            }
        }
    }

    public void Delete(String maDichVu) {
        Connection con = JDBCUtils.getConnection();
        
        String sql = "DELETE FROM tbl_dichvu WHERE MADICHVU = ?";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,maDichVu);
            
            int rs = ps.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<DichVu> sellectAll() {
        List<DichVu> dichvu = new ArrayList<>();
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_dichvu";
        try {PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getString("MADICHVU"));
                dv.setTenDichVu(rs.getNString("TENDICHVU"));
                dv.setGia(rs.getDouble("GIA"));
                dv.setDonViTinh(rs.getNString("DONVITINH"));
                dv.setNgayBatDau(rs.getDate("STARTDATE"));
                dv.setNgayKetThuc(rs.getDate("ENDDATE"));
                dv.setTrangThai(rs.getNString("STATUS"));
                dichvu.add(dv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return (ArrayList<DichVu>) dichvu;
    }

    public DichVu selectById(String maDichVu) {
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_dichvu WHERE MADICHVU = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, maDichVu);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getString("MADICHVU"));
                dv.setTenDichVu(rs.getNString("TENDICHVU"));
                dv.setGia(rs.getDouble("GIA"));
                dv.setDonViTinh(rs.getNString("DONVITINH"));
                dv.setNgayBatDau(rs.getDate("STARTDATE"));
                dv.setNgayKetThuc(rs.getDate("ENDDATE"));
                dv.setTrangThai(rs.getNString("STATUS"));
                
                return dv;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<DichVu> selectByCondition(String name) {
        List<DichVu> dichvu = new ArrayList<>();
        
        Connection con = new JDBCUtils().getConnection();
        
        String sql = "SELECT * FROM tbl_nhatro WHERE TENNHATRO = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getString("MADICHVU"));
                dv.setTenDichVu(rs.getNString("TENDICHVU"));
                dv.setGia(rs.getDouble("GIA"));
                dv.setDonViTinh(rs.getNString("DONVITINH"));
                dv.setNgayBatDau(rs.getDate("STARTDATE"));
                dv.setNgayKetThuc(rs.getDate("ENDDATE"));
                dv.setTrangThai(rs.getNString("STATUS"));
                dichvu.add(dv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return (ArrayList<DichVu>) dichvu;
    }
    
}