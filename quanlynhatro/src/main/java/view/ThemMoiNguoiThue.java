package view;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

import controler.ThemMoiNguoiThueController;

import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import model.TinhThanh;
import java.util.ArrayList;
import javax.swing.Action;

public class ThemMoiNguoiThue {

	private JFrame frame;
	private JTextField textFieldHoTen;
	private JTextField textFieldNgaySinh;
	private JTextField textFieldEmail;
	private JTextField textFieldCCCD;
	private JTextField textFieldSDT;
	private JTextField textFieldNguoiThueMa;
	private JRadioButton RadioButtonNam;
	private JRadioButton RadioButtonNu;
	private ButtonGroup buttonRadioGroupGioiTinh;
	private JComboBox<String> comboBoxQueQuan;
	
	
	public JTextField getTextFieldHoTen() {
		return textFieldHoTen;
	}

	public void setTextFieldHoTen(JTextField textFieldHoTen) {
		this.textFieldHoTen = textFieldHoTen;
	}

	public JTextField getTextFieldNgaySinh() {
		return textFieldNgaySinh;
	}

	public void setTextFieldNgaySinh(JTextField textFieldNgaySinh) {
		this.textFieldNgaySinh = textFieldNgaySinh;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}

	public JTextField getTextFieldCCCD() {
		return textFieldCCCD;
	}

	public void setTextFieldCCCD(JTextField textFieldCCCD) {
		this.textFieldCCCD = textFieldCCCD;
	}

	public JTextField getTextFieldSDT() {
		return textFieldSDT;
	}

	public void setTextFieldSDT(JTextField textFieldSDT) {
		this.textFieldSDT = textFieldSDT;
	}

	public JTextField getTextFieldNguoiThueMa() {
		return textFieldNguoiThueMa;
	}

	public void setTextFieldNguoiThueMa(JTextField textFieldNguoiThueMa) {
		this.textFieldNguoiThueMa = textFieldNguoiThueMa;
	}

	public ButtonGroup getButtonRadioGroupGioiTinh() {
		return buttonRadioGroupGioiTinh;
	}

	public void setButtonRadioGroupGioiTinh(ButtonGroup buttonRadioGroupGioiTinh) {
		this.buttonRadioGroupGioiTinh = buttonRadioGroupGioiTinh;
	}

	public JComboBox<String> getComboBoxQueQuan() {
		return comboBoxQueQuan;
	}

	public void setComboBoxQueQuan(JComboBox<String> comboBoxQueQuan) {
		this.comboBoxQueQuan = comboBoxQueQuan;
	}

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemMoiNguoiThue window = new ThemMoiNguoiThue();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	public void hienThiManHinh() {
		this.frame.setVisible(true);
	}
	/**
	 * Create the application.
	 */
	public ThemMoiNguoiThue() {
		Action action = new ThemMoiNguoiThueController(this);
		initialize(action);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Action action) {
		//Action action = new ThemMoiNguoiThueController(This);
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_data = new JPanel();
		panel_data.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_data.setBounds(10, 115, 964, 293);
		frame.getContentPane().add(panel_data);
		panel_data.setLayout(null);
		
		JLabel lblHoTen = new JLabel("Họ và tên");
		lblHoTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHoTen.setBounds(55, 25, 62, 30);
		panel_data.add(lblHoTen);
		
		JLabel lblCCCD = new JLabel("Số CCCD");
		lblCCCD.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCCCD.setBounds(514, 100, 62, 30);
		panel_data.add(lblCCCD);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh");
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNgaySinh.setBounds(55, 100, 62, 30);
		panel_data.add(lblNgaySinh);
		
		JLabel lblQueQuan = new JLabel("Quê quán");
		lblQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQueQuan.setBounds(55, 172, 62, 30);
		panel_data.add(lblQueQuan);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(537, 25, 39, 30);
		panel_data.add(lblEmail);
		
		textFieldHoTen = new JTextField();
		textFieldHoTen.setBounds(127, 25, 248, 30);
		panel_data.add(textFieldHoTen);
		textFieldHoTen.setColumns(10);
		
		textFieldNgaySinh = new JTextField();
		textFieldNgaySinh.setColumns(10);
		textFieldNgaySinh.setBounds(127, 100, 248, 30);
		panel_data.add(textFieldNgaySinh);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(590, 25, 248, 30);
		panel_data.add(textFieldEmail);
		
		textFieldCCCD = new JTextField();
		textFieldCCCD.setColumns(10);
		textFieldCCCD.setBounds(590, 100, 248, 30);
		panel_data.add(textFieldCCCD);
		
		textFieldSDT = new JTextField();
		textFieldSDT.setColumns(10);
		textFieldSDT.setBounds(590, 172, 248, 30);
		panel_data.add(textFieldSDT);
		
		JLabel lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSDT.setBounds(489, 172, 84, 30);
		panel_data.add(lblSDT);
		
		JLabel lblNguoiThueMa = new JLabel("Người thuê mã");
		lblNguoiThueMa.setBounds(26, 236, 91, 30);
		panel_data.add(lblNguoiThueMa);
		lblNguoiThueMa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNguoiThueMa = new JTextField();
		textFieldNguoiThueMa.setBounds(127, 238, 248, 30);
		panel_data.add(textFieldNguoiThueMa);
		textFieldNguoiThueMa.setColumns(10);
		
		JLabel llblGioiTinh = new JLabel("Giới tính");
		llblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		llblGioiTinh.setBounds(525, 236, 48, 30);
		panel_data.add(llblGioiTinh);
		
		RadioButtonNam = new JRadioButton("Nam");
		RadioButtonNam.setActionCommand("Nam");
		RadioButtonNam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RadioButtonNam.setBounds(607, 240, 71, 23);
		panel_data.add(RadioButtonNam);
		
		RadioButtonNu = new JRadioButton("Nữ");
		RadioButtonNu.setActionCommand("Nữ");
		RadioButtonNu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RadioButtonNu.setBounds(717, 240, 71, 23);
		panel_data.add(RadioButtonNu);
		
		buttonRadioGroupGioiTinh = new ButtonGroup();
		buttonRadioGroupGioiTinh.add(RadioButtonNu);
		buttonRadioGroupGioiTinh.add(RadioButtonNam);
		
		comboBoxQueQuan = new JComboBox<String>();
		comboBoxQueQuan.setBounds(127, 174, 248, 30);
		ArrayList<TinhThanh> arrayListTinhThanh = TinhThanh.getArrayListTinhThanh();
		comboBoxQueQuan.addItem(null);
		for(TinhThanh i:arrayListTinhThanh) {
			comboBoxQueQuan.addItem(i.getTenTinh());
		}
		panel_data.add(comboBoxQueQuan);
		
		JPanel panel_header = new JPanel();
		panel_header.setBorder(UIManager.getBorder("FileChooser.listViewBorder"));
		panel_header.setBounds(10, 11, 964, 82);
		frame.getContentPane().add(panel_header);
		panel_header.setLayout(null);
		
		JLabel lblThemMoiNguoiThue = new JLabel("THÊM MỚI NGƯỜI THUÊ TRỌ");
		lblThemMoiNguoiThue.setBounds(249, 18, 442, 53);
		panel_header.add(lblThemMoiNguoiThue);
		lblThemMoiNguoiThue.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_control = new JPanel();
		panel_control.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel_control.setBounds(154, 419, 684, 73);
		frame.getContentPane().add(panel_control);
		panel_control.setLayout(null);
		
		JButton btnThemMoiNguoIThue = new JButton("Thêm mới người thuê");
		btnThemMoiNguoIThue.addActionListener(action);
		btnThemMoiNguoIThue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThemMoiNguoIThue.setBounds(95, 24, 200, 30);
		panel_control.add(btnThemMoiNguoIThue);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(action);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(377, 24, 200, 30);
		panel_control.add(btnClear);
		frame.addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		    	frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    	DanhSachNguoiThue sc = new DanhSachNguoiThue();	
            	sc.hienManHinh();
            	//JOptionPane.showMessageDialog(null,"Đã chỉnh sửa người thuê " );
		    }
		});
	}
	public void btnClear() {
		textFieldHoTen.setText("");;
		textFieldNgaySinh.setText("");;
		textFieldEmail.setText("");;
		textFieldCCCD.setText("");;
		textFieldSDT.setText("");;
		textFieldNguoiThueMa.setText("");
		comboBoxQueQuan.setSelectedIndex(-1);
		buttonRadioGroupGioiTinh.clearSelection();
	}
}
