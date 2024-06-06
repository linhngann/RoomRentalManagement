package model;

import java.util.ArrayList;

public class TinhThanh {
	private String tenTinh;
	private int maTinh;
	
	public TinhThanh() {};
	
	public TinhThanh(String tenTinh, int maTinh) {
		super();
		this.tenTinh = tenTinh;
		this.maTinh = maTinh;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	public int getMaTinh() {
		return maTinh;
	}
	public void setMaTinh(int maTinh) {
		this.maTinh = maTinh;
	}
	public static ArrayList<TinhThanh> getArrayListTinhThanh(){
		ArrayList<TinhThanh> arrayListTinhThanh = new ArrayList<TinhThanh>();
		String[] arrayTenTinhThanh = {
							"An Giang",
							"Bà Rịa – Vũng Tàu",
							"Bắc Giang",
							"Bắc Kạn",
							"Bạc Liêu",
							"Bắc Ninh",
							"Bến Tre",
							"Bình Định",
							"Bình Dương",
							"Bình Phước",
							"Bình Thuận",
							"Cà Mau",
							"Cần Thơ",
							"Cao Bằng",
							"Đà Nẵng",
							"Đắk Lắk",
							"Đắk Nông",
							"Điện Biên",
							"Đồng Nai",
							"Đồng Tháp",
							"Gia Lai",
							"Hà Giang",
							"Hà Nam",
							"Hà Nội",
							"Hà Tĩnh",
							"Hải Dương",
							"Hải Phòng",
							"Hậu Giang",
							"Hòa Bình",
							"Hưng Yên",
							"Khánh Hòa",
							"Kiên Giang",
							"Kon Tum",
							"Lai Châu",
							"Lâm Đồng",
							"Lạng Sơn",
							"Lào Cai",
							"Long An",
							"Nam Định",
							"Nghệ An",
							"Ninh Bình",
							"Ninh Thuận",
							"Phú Thọ",
							"Phú Yên",
							"Quảng Bình",
							"Quảng Nam",
							"Quảng Ngãi",
							"Quảng Ninh",
							"Quảng Trị",
							"Sóc Trăng",
							"Sơn La",
							"Tây Ninh",
							"Thái Bình",
							"Thái Nguyên",
							"Thanh Hóa",
							"Thừa Thiên Huế",
							"Tiền Giang",
							"TP Hồ Chí Minh",
							"Trà Vinh",
							"Tuyên Quang",
							"Vĩnh Long",
							"Vĩnh Phúc",
							"Yên Bái"};
		int i = 1;
		for(String tenTinh : arrayTenTinhThanh) {
			TinhThanh a = new TinhThanh(tenTinh, i);
			arrayListTinhThanh.add(a);
			i ++;
		}
	return arrayListTinhThanh;	
	}
	public static String getTinhThanhByID(int Id) {
		for(TinhThanh tinhThanh: getArrayListTinhThanh() ) {
			if(tinhThanh.getMaTinh() == Id ) {
				return tinhThanh.getTenTinh();
			}
		}
		return null;
	}
}
