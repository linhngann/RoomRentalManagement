package controler;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import view.ThemMoiNguoiThue;
import javax.swing.Action;
//import javax.swing.ButtonModel;

import DAO.nguoiThueDAO;
import javax.swing.JOptionPane;
import model.NguoiThue;
import model.TinhThanh;


public class ThemMoiNguoiThueController implements Action {
	public ThemMoiNguoiThue view;
	public ThemMoiNguoiThueController(ThemMoiNguoiThue view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCommand =  e.getActionCommand();
		//JOptionPane.showMessageDialog(null, actionCommand);
		if(actionCommand.equals("Thêm mới người thuê")) {
			//this.view.btnClear();
			btnThemMoiNguoIThueController(this.view);
		} else if (actionCommand.equals("Clear")) {
			this.view.btnClear();
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

	public void btnThemMoiNguoIThueController(ThemMoiNguoiThue view) {
		boolean insert_tt = true;
		NguoiThue nguoiThue = new NguoiThue();
		//JOptionPane.showMessageDialog(null,view.getTextFieldNguoiThueMa().getText());
		String maNguoiThue = view.getTextFieldNguoiThueMa().getText() + "";
		String ngaySinh = view.getTextFieldNgaySinh().getText();
		String sDT = view.getTextFieldSDT().getText();
		String soCCCD = view.getTextFieldCCCD().getText();
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
		
		if(nguoiThue.setMaNguoiThue(maNguoiThue) == -1 && insert_tt) {
			JOptionPane.showMessageDialog(null,"Mã người thuê đã tồn tại!");
			insert_tt = false;
		}
		
		if(nguoiThue.getMaNguoiThue().equals("") && insert_tt) {
			JOptionPane.showMessageDialog(null,"Thông tin mã người thuê là bắt buộc nhập !!!");
			insert_tt = false;
		}
		if(nguoiThue.getTenNguoiThue().equals("") && insert_tt) {
			JOptionPane.showMessageDialog(null,"Thông tin tên người thuê là bắt buộc nhập !!!");
			insert_tt = false;
		}
		
		
		if(nguoiThue.setNgaySinh(ngaySinh) == -1 && insert_tt && !ngaySinh.equals("")) {
			JOptionPane.showMessageDialog(null,"Ngày sinh không đúng định dạng dd/mm/yyyy!!");
			insert_tt = false;
		}
		
	if(nguoiThue.setSDT(sDT) == -1 && !sDT.equals("") && insert_tt) {
			JOptionPane.showMessageDialog(null,"Số điện thoại không đúng định dạng!");
			insert_tt = false;
		}
		
		if(nguoiThue.setSoCCCD(soCCCD) == - 1 && insert_tt && !soCCCD.equals("")) {
			JOptionPane.showMessageDialog(null,"Số căn cước công dân không đúng định dạng!");
			insert_tt = false;
		}
		
		if(insert_tt) {
			nguoiThueDAO.getInstance().insert(nguoiThue);
			JOptionPane.showMessageDialog(null,"Đã thêm người thuê " + nguoiThue.getMaNguoiThue());
			this.view.btnClear();
		}
		
		
	}
}
