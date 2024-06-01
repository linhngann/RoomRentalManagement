package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.NguoiThue;
import DAO.nguoiThueDAO;
import view.ChiTietNguoiThue;
import view.DanhSachNguoiThue;
import view.ThemMoiNguoiThue;

public class DanhSachNguoiThueController   implements Action {
	public DanhSachNguoiThue view;
	
	
	
	public DanhSachNguoiThueController(DanhSachNguoiThue view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String actionCommand =  e.getActionCommand();
		//JOptionPane.showMessageDialog(null, actionCommand);
		if(actionCommand.equals("Thêm người thuê trọ")) {
			//this.view.btnClear();
			this.view.anManHinh();
			ThemMoiNguoiThue ct = new ThemMoiNguoiThue();
			ct.hienThiManHinh();
			
		} else if (actionCommand.equals("Sửa thông tin người thuê trọ")) {
			suaNguoiThueTro(this.view);
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
	
	public static void getAllNguoiThueToTable(JTable table) {
		DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
		ArrayList<NguoiThue> listNguoiThue = new ArrayList<NguoiThue>();
		listNguoiThue = nguoiThueDAO.getInstance().selectAll();
		for(NguoiThue nt : listNguoiThue) {
			modelTable.addRow(new Object[] {
					nt.getIdnguoiThue() + "",
					nt.getTenNguoiThue() + "",
					Date.getDate(nt.getNgaySinh() + ""),
					nt.getSDT() + "",
					nt.getEmail() + "",
					nt.getTrangThai() + ""
			});
		}
	}
	public void suaNguoiThueTro(DanhSachNguoiThue view) {
		DefaultTableModel modelTable = (DefaultTableModel) view.getTableDanhSachNguoiThue().getModel();
		int row_id = view.getTableDanhSachNguoiThue().getSelectedRow();
		if(row_id == -1) {
			JOptionPane.showMessageDialog(null,"Chọn một người thuê để thực hiện chức năng này!");
		} else {
			int iDNguoiThue = Integer.parseInt(modelTable.getValueAt(row_id, 0) + "");
			//JOptionPane.showMessageDialog(null,iDNguoiThue);
			view.anManHinh();
			ChiTietNguoiThue ct = new ChiTietNguoiThue();
			ct.hienManHinh(iDNguoiThue);
		}
		
	}

}
