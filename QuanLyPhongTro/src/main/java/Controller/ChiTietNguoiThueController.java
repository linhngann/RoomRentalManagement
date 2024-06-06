package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JOptionPane;

import DAO.nguoiThueDAO;
import model.NguoiThue;
import model.TinhThanh;
import view.ChiTietNguoiThue;
import view.ThemMoiNguoiThue;

public class ChiTietNguoiThueController implements Action{
	private ChiTietNguoiThue view;
	
	public ChiTietNguoiThueController(ChiTietNguoiThue view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand =  e.getActionCommand();
		//JOptionPane.showMessageDialog(null, actionCommand);
		if(actionCommand.equals("Hủy bỏ các thay đổi")) {
			JOptionPane.showMessageDialog(null, actionCommand);
			hienThiDuLieuNguoiThue(this.view);

		} else if (actionCommand.equals("Cập nhật thông tin")) {
			updateNguoiThue(this.view);
		}
		
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}
	
	public static void updateNguoiThue(ChiTietNguoiThue view) {
		boolean update_tt = true;
		NguoiThue nguoiThue = new NguoiThue();
		//JOptionPane.showMessageDialog(null,view.getTextFieldNguoiThueMa().getText());
		int idNguoiThue = view.getIDNguoiThue();
		String maNguoiThue = view.getTextFieldNguoiThueMa().getText();
		String ngaySinh = view.getTextFieldNgaySinh().getText();
		String sDT = view.getTextFieldSDT().getText();
		String soCCCD = view.getTextFieldCCCD().getText();
		//JOptionPane.showMessageDialog(null, view.getTextFieldNguoiThueMa() .getText());
		nguoiThue.setTenNguoiThue(view.getTextFieldHoTen().getText() + "");
		nguoiThue.setEmail(view.getTextFieldEmail().getText());

		nguoiThue.setQueQuan(TinhThanh.getTinhThanhByID(view.getComboBoxQueQuan().getSelectedIndex()));
		//JOptionPane.showMessageDialog(null,nguoiThue.getQueQuan());
		if( view.getButtonRadioGroupGioiTinh().getSelection() != null) {
			nguoiThue.setGioiTinh(view.getButtonRadioGroupGioiTinh().getSelection().getActionCommand());
		} else {
			nguoiThue.setGioiTinh("");
		}
		nguoiThue.setTrangThai('Y');
		
		
		if(maNguoiThue.equals("") && update_tt) {
			JOptionPane.showMessageDialog(null,"Thông tin mã người thuê là bắt buộc nhập !!!");
			update_tt = false;
		} else {
			nguoiThue.setMaNguoiThue(maNguoiThue);
		}
		if(nguoiThue.getTenNguoiThue().equals("") && update_tt) {
			JOptionPane.showMessageDialog(null,"Thông tin tên người thuê là bắt buộc nhập !!!");
			update_tt = false;
		}
		

		
		if(nguoiThue.setNgaySinh(ngaySinh) == -1 && update_tt && !ngaySinh.equals("")) {
			JOptionPane.showMessageDialog(null,"Ngày sinh không đúng định dạng dd/mm/yyyy hoặc dd/mm/yyyy hh24:mi:ss!");
			update_tt = false;
		}
		
	if(nguoiThue.setSDT(sDT) == -1 && !sDT.equals("") && update_tt) {
			JOptionPane.showMessageDialog(null,"Số điện thoại không đúng định dạng!");
			update_tt = false;
		}
		
		if(nguoiThue.setSoCCCD(soCCCD) == - 1 && update_tt && !soCCCD.equals("")) {
			JOptionPane.showMessageDialog(null,"Số căn cước công dân không đúng định dạng!");
			update_tt = false;
		}
		
		if(update_tt) {
			nguoiThueDAO.getInstance().update(nguoiThue);
			JOptionPane.showMessageDialog(null,"Đã chỉnh sửa người thuê " + nguoiThue.getMaNguoiThue());
		}
	}
	
	public static void setDuLieu(ChiTietNguoiThue view, NguoiThue nt) {
		view.getTextFieldHoTen().setText(nt.getTenNguoiThue());
		view.getTextFieldEmail().setText(nt.getEmail());
		view.getTextFieldNgaySinh().setText(Date.getDate(nt.getNgaySinh()));
		view.getTextFieldCCCD().setText(nt.getSoCCCD());
		view.getTextFieldSDT().setText(nt.getSDT());
		view.getTextFieldNguoiThueMa().setText(nt.getMaNguoiThue());
		JOptionPane.showMessageDialog(null,view.getTextFieldNguoiThueMa().getText() + "");
		view.getComboBoxQueQuan().setSelectedItem(nt.getQueQuan());
		if(nt.getGioiTinh().equals("Nam")) {
			view.getRadioButtonNam().setSelected(true);
		} else {
			view.getRadioButtonNu().setSelected(true);
		}
		if(nt.getTrangThai() == 'Y') {
			view.getchckbxTrangThai().setSelected(true);
		} else {
			view.getchckbxTrangThai().setSelected(false);
		}
	}
	public static void hienThiDuLieuNguoiThue(ChiTietNguoiThue view) {
		NguoiThue findNT = new NguoiThue();
		findNT.setIdnguoiThue(view.getIDNguoiThue());
		NguoiThue nt = nguoiThueDAO.getInstance().selectByID(findNT);
		setDuLieu(view, nt);
	}

}
