package model;

import java.util.ArrayList;

import DAO.nguoiThueDAO;

public class NguoiThue {
	private int idnguoiThue;
	private String maNguoiThue;
	private String tenNguoiThue;
	private String NgaySinh;
	private String SDT;
	private String Email;
	private String SoCCCD;
	private String queQuan;
	private String gioiTinh;
	private char TrangThai;
	
	
	public NguoiThue() {
		// TODO Auto-generated constructor stub
	}
	
	public NguoiThue(int nguoiThue, String maNguoiThue, String tenNguoiThue, String ngaySinh, String sDT, String email,
			String soCCCD, String queQuan, char TrangThai, String gioiTinh) {
		this.idnguoiThue = nguoiThue;
		this.maNguoiThue = maNguoiThue;
		this.tenNguoiThue = tenNguoiThue;
		NgaySinh = ngaySinh;
		SDT = sDT;
		Email = email;
		SoCCCD = soCCCD;
		this.queQuan = queQuan;
		this.TrangThai = TrangThai;
		this.gioiTinh = gioiTinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public int getIdnguoiThue() {
		return idnguoiThue;
	}
	public void setIdnguoiThue(int idnguoiThue) {
		this.idnguoiThue = idnguoiThue;
	}
	public char getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(char trangThai) {
		TrangThai = trangThai;
	}
	public String getMaNguoiThue() {
		return maNguoiThue;
	}
	public int setMaNguoiThue(String maNguoiThue) {
		String sql = "select * from TBL_NGUOI_THUE T WHERE T.MANGUOITHUE = " + "'" + maNguoiThue + "';";
		ArrayList<NguoiThue> listNguoiThue = nguoiThueDAO.getInstance().selectByCondition(sql);
		if(listNguoiThue.size() == 0) {
			this.maNguoiThue = maNguoiThue;
			return 1;
		}else {
			return -1;
		}
		
	}
	public String getTenNguoiThue() {
		return tenNguoiThue;
	}
	public void setTenNguoiThue(String tenNguoiThue) {
		this.tenNguoiThue = tenNguoiThue;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public int setNgaySinh(String ngaySinh) {
		String datePattern = "^\\d{2}/\\d{2}/\\d{4}$";
		//String dateTimePattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\\\d{4} (2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9]$";
		if(ngaySinh.matches(datePattern)){
			this.NgaySinh = ngaySinh;
			return 1;
		}  else {
			return -1;
		}
		
	}
	public String getSDT() {
		return SDT;
	}
	public int setSDT(String sDT) {
		String regex = "^0\\d{0,9}$";
		if(sDT.matches(regex)) {
			this.SDT = sDT;
			return 1;
		} else {
			return -1;
		}
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSoCCCD() {
		return SoCCCD;
	}
	public int setSoCCCD(String soCCCD) {
		String regex = "^\\d{12}$";
		if(soCCCD.matches(regex)) {
			SoCCCD = soCCCD;
			return 1;
		} else {
			return -1;
		}
		
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	
}
