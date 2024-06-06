package controller;

public class Date {
	public static String ngayTOSQL(String ngaySinh) {
		return "STR_TO_DATE( '"  + ngaySinh + "', '%d/%m/%Y')";
	}
	public static String getDate(String dateTime) {
		String[] parts = dateTime.split(" ");
		String[] dateParts = parts[0].split("-"); // Tách ngày tháng
		String datePart = dateParts[2] + "/" + dateParts[1] + "/" + dateParts[0];
		return datePart;
	}
	public static void main (String[] args) {
		
		System.out.println(Date.ngayTOSQL("12/12/2003"));
	}
}
