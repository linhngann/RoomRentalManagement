package view;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controler.ICon;

import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import controller.DanhSachNguoiThueController;
//import java.awt.event.ActionListener;
//import java.awt.List;

public class DanhSachNguoiThue {

	private MyFrame frame;
	private JTable tableDanhSachNguoiThue;
	private JPanel panel;
	private JButton btnthemNguoiThue;
	private JButton btnSuaNguoiThue;

	
	public MyFrame getFrame() {
		return frame;
	}

	public void setFrame(MyFrame frame) {
		this.frame = frame;
	}

	public JTable getTableDanhSachNguoiThue() {
		return tableDanhSachNguoiThue;
	}

	public void setTableDanhSachNguoiThue(JTable tableDanhSachNguoiThue) {
		this.tableDanhSachNguoiThue = tableDanhSachNguoiThue;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanhSachNguoiThue window = new DanhSachNguoiThue();
					DanhSachNguoiThueController.getAllNguoiThueToTable(window.getTableDanhSachNguoiThue());
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		DanhSachNguoiThue window = new DanhSachNguoiThue();
		DanhSachNguoiThueController.getAllNguoiThueToTable(window.getTableDanhSachNguoiThue());
		window.frame.setVisible(true);
	}
	
	//public void hienManHinh(int Id)
	
	public void hienManHinh() {
		DanhSachNguoiThueController.getAllNguoiThueToTable(this.getTableDanhSachNguoiThue());
		this.frame.setVisible(true);
	}
	
	public void anManHinh() {
		this.frame.setVisible(false);
	}
	/**
	 * Create the application.
	 */
	public DanhSachNguoiThue() {
		DanhSachNguoiThueController action = new DanhSachNguoiThueController(this);
		initialize(action);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(DanhSachNguoiThueController action) {
		frame = new MyFrame();
		frame.setTitle("DSNTT");
		frame.getContentPane().setBackground(new Color(46, 139, 47));
		frame.setBackground(new Color(46, 139, 47));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTieuDe = new JLabel("DANH SÁCH NGƯỜI THUÊ TRỌ");
		lblTieuDe.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTieuDe.setBounds(216, 28, 570, 55);
		frame.getContentPane().add(lblTieuDe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 143, 930, 232);
		frame.getContentPane().add(scrollPane);
		
		tableDanhSachNguoiThue = new JTable();
		tableDanhSachNguoiThue.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"", "T\u00EAn ng\u01B0\u1EDDi thu\u00EA", "Ng\u00E0y sinh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "T\u00ECnh tr\u1EA1ng"
			}
		));
		tableDanhSachNguoiThue.getColumnModel().getColumn(0).setPreferredWidth(0);
		tableDanhSachNguoiThue.getColumnModel().getColumn(0).setMinWidth(0);
		tableDanhSachNguoiThue.getColumnModel().getColumn(0).setMaxWidth(0);
		scrollPane.setViewportView(tableDanhSachNguoiThue);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 104, 994, 1);
		frame.getContentPane().add(panel);
		
		btnthemNguoiThue = new JButton("Thêm người thuê trọ");
		btnthemNguoiThue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnthemNguoiThue.setBackground(new Color(17, 131, 168));
		btnthemNguoiThue.setIcon(ICon.designIcon("D:\\Hoc\\DAI HOC\\ki_6\\ttcn\\TBL_QLTRO\\icon\\user-add.png",10, 10));
		btnthemNguoiThue.addActionListener(action);
		btnthemNguoiThue.setBounds(29, 406, 177, 30);
		frame.getContentPane().add(btnthemNguoiThue);
		
		btnSuaNguoiThue = new JButton("Sửa thông tin người thuê trọ");
		btnSuaNguoiThue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSuaNguoiThue.setBackground(new Color(17, 131, 168));
		btnSuaNguoiThue.setIcon(ICon.designIcon("D:\\Hoc\\DAI HOC\\ki_6\\ttcn\\TBL_QLTRO\\icon\\user-pen.png", 10,10));
		btnSuaNguoiThue.addActionListener(action);
		btnSuaNguoiThue.setBounds(245, 406, 236, 30);
		frame.getContentPane().add(btnSuaNguoiThue);
		frame.addWindowListener(new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		    	frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    }
		});
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
