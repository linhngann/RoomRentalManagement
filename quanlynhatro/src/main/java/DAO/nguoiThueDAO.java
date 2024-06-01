package DAO;
import java.util.ArrayList;
import database.JDBCUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import controller.Date;

import model.NguoiThue;
public class nguoiThueDAO {
	
	public static nguoiThueDAO getInstance() {
		return new nguoiThueDAO();
	}
	
	
	public int insert(NguoiThue t) {
		int ketQua = 0;
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO TBL_NGUOI_THUE( MANGUOITHUE, TENNGUOITHUE, NGAYSINH, SODIENTHOAI, EMAIL, SOCCCD, QUEQUAN, TRANGTHAI, GIOITINH) " +
						"VALUES( " + "'" + t.getMaNguoiThue() + "'" + ", " + "'" + t.getTenNguoiThue() + "'" + ", " +  Date.ngayTOSQL(t.getNgaySinh()) +  ", " + 
						"'" + t.getSDT() + "'" + ", " + "'" + t.getEmail() + "'" + ", " + "'" + t.getSoCCCD() + "'" + ", " + "'" +t.getQueQuan() + "'"  + "," + 
						"'" + t.getTrangThai() + "'" + "," +"'" + t.getGioiTinh() + "'" +");";
			System.out.println(sql);
			ketQua = statement.executeUpdate(sql);
			JDBCUtils.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return ketQua;
	}

	
	public int update(NguoiThue t) {
		int ketQua = 0;
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "UPDATE TBL_NGUOI_THUE T SET T.MANGUOITHUE = " + "'" + t.getMaNguoiThue() + "'" + ", T.TENNGUOITHUE = " +  "'" + t.getTenNguoiThue() + "'" 
						+ ", T.NGAYSINH = " + Date.ngayTOSQL(t.getNgaySinh()) + ", T.SODIENTHOAI = " + "'" + t.getSDT() + "'"  + ", T.EMAIL = " + "'" + t.getEmail() + "'"
						+ ", T.SOCCCD = " +  "'" + t.getSoCCCD() + "'" +  ", T.QUEQUAN = " + "'" + t.getQueQuan() + "'" + ", T.TRANGTHAI = " + "'" + t.getTrangThai() + "'"
						+ ", T.GIOITINH = " + "'" + t.getGioiTinh() + "'" + "WHERE T.IDNGUOITHUE = " + t.getIdnguoiThue();
			//System.out.println(sql);
			ketQua = statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return ketQua;
	}

	
	public int delete(NguoiThue t) {
		int ketQua = 0;
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "DELETE FROM TBL_NGUOI_THUE WHERE IDNGUOITHUE = " + t.getIdnguoiThue();
			//System.out.println(sql);
			ketQua = statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return ketQua;
	}

	
	public ArrayList<NguoiThue> selectAll() {
		ArrayList <NguoiThue> nguoiThueList = new ArrayList<NguoiThue>();
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM TBL_NGUOI_THUE";
			ResultSet rs  = statement.executeQuery(sql);
			
			while (rs.next()) {
				int iD = rs.getInt("IDNGUOITHUE");
				String maNguoiThue = rs.getString("MANGUOITHUE");
				String tenNguoiThue = rs.getString("TENNGUOITHUE");
				String ngaySinh = rs.getString("NGAYSINH");
				String soDienThoai = rs.getString("SODIENTHOAI");
				String eMail = rs.getString("EMAIL");
				String soCCCD = rs.getString("SOCCCD");
				String queQuan = rs.getString("QUEQUAN");
				String gioiTinh	= rs.getString("GIOITINH");
				String stringTrangThai = rs.getString("TRANGTHAI");
				char	trangThai = stringTrangThai.charAt(0);
				
				NguoiThue nt = new NguoiThue(iD, maNguoiThue, tenNguoiThue, ngaySinh, soDienThoai, eMail,soCCCD, queQuan, trangThai, gioiTinh);
				nguoiThueList.add(nt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return nguoiThueList;
	}


	public NguoiThue selectByID(NguoiThue t) {
		NguoiThue nguoiThue = null;
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM TBL_NGUOI_THUE WHERE IDNGUOITHUE = " + t.getIdnguoiThue();
			//System.out.println(sql);
			ResultSet rs  = statement.executeQuery(sql);
			
			while (rs.next()) {
				int iD = rs.getInt("IDNGUOITHUE");
				String maNguoiThue = rs.getString("MANGUOITHUE");
				String tenNguoiThue = rs.getString("TENNGUOITHUE");
				String ngaySinh = rs.getString("NGAYSINH");
				String soDienThoai = rs.getString("SODIENTHOAI");
				String eMail = rs.getString("EMAIL");
				String soCCCD = rs.getString("SOCCCD");
				String queQuan = rs.getString("QUEQUAN");
				String gioiTinh = rs.getString("GIOITINH");
				String stringTrangThai = rs.getString("TRANGTHAI");
				char	trangThai = stringTrangThai.charAt(0);
				
				nguoiThue = new NguoiThue(iD, maNguoiThue, tenNguoiThue, ngaySinh, soDienThoai, eMail,soCCCD, queQuan, trangThai, gioiTinh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return nguoiThue;
	}


	public ArrayList<NguoiThue> selectByCondition(String condition) {
		ArrayList <NguoiThue> nguoiThueList = new ArrayList<NguoiThue>();
		Connection connection = JDBCUtils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = condition;
			ResultSet rs  = statement.executeQuery(sql);
			
			while (rs.next()) {
				int iD = rs.getInt("IDNGUOITHUE");
				String maNguoiThue = rs.getString("MANGUOITHUE");
				String tenNguoiThue = rs.getString("TENNGUOITHUE");
				String ngaySinh = rs.getString("NGAYSINH");
				String soDienThoai = rs.getString("SODIENTHOAI");
				String eMail = rs.getString("EMAIL");
				String soCCCD = rs.getString("SOCCCD");
				String queQuan = rs.getString("QUEQUAN");
				String gioiTinh	= rs.getString("GIOITINH");
				String stringTrangThai = rs.getString("TRANGTHAI");
				char	trangThai = stringTrangThai.charAt(0);
				
				NguoiThue nt = new NguoiThue(iD, maNguoiThue, tenNguoiThue, ngaySinh, soDienThoai, eMail,soCCCD, queQuan, trangThai, gioiTinh);
				nguoiThueList.add(nt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtils.closeConnection(connection);
		return nguoiThueList;
	}

}
