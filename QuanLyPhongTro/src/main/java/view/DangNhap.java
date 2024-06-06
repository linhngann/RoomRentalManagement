package view;

import java.awt.EventQueue;
import controler.GradientPanel;
import controler.ICon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class DangNhap {

	private JFrame frame;
	private JTextField textFieldDangNhap;
	private JTextField textFieldMatKhau;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap window = new DangNhap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DangNhap() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 139, 87));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setIcon(ICon.designIcon("D:\\TTCN\\QuanLyPhongTro\\src\\main\\resources\\icon\\key.png", 10, 10));
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDangNhap.setBounds(72, 214, 115, 37);
		frame.getContentPane().add(btnDangNhap);
		
		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.setIcon(ICon.designIcon("D:\\TTCN\\QuanLyPhongTro\\src\\main\\resources\\icon\\arrowleft.png", 10, 10));
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHuyBo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHuyBo.setBounds(252, 214, 115, 37);
		frame.getContentPane().add(btnHuyBo);
		
		textFieldDangNhap = new JTextField();
		textFieldDangNhap.setBounds(189, 104, 223, 23);
		frame.getContentPane().add(textFieldDangNhap);
		textFieldDangNhap.setColumns(10);
		
		textFieldMatKhau = new JTextField();
		textFieldMatKhau.setBounds(189, 146, 223, 23);
		frame.getContentPane().add(textFieldMatKhau);
		textFieldMatKhau.setColumns(10);
		
		JLabel lblTenDangNhap = new JLabel("Tên đăng nhập");
		lblTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTenDangNhap.setBounds(88, 104, 100, 23);
		frame.getContentPane().add(lblTenDangNhap);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu");
		lblMatKhau.setBackground(new Color(46, 139, 87));
		lblMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMatKhau.setBounds(88, 146, 100, 23);
		frame.getContentPane().add(lblMatKhau);
		
		JLabel lblDangNhap = new JLabel("Đăng nhập hệ thống");
		lblDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDangNhap.setBounds(111, 21, 208, 37);
		frame.getContentPane().add(lblDangNhap);
		
		GradientPanel panelDo = new GradientPanel();
		panelDo.setGradientColors(new Color(255,255,255), new Color(255,0,0));
		panelDo.setBounds(0, 58, 434, 10);
		frame.getContentPane().add(panelDo);
		
		GradientPanel panelXanh = new GradientPanel();
		panelXanh.setGradientColors(new Color(255,255,255), new Color(255,0,0));
		panelXanh.setBounds(0, 198, 435, 4);
		frame.getContentPane().add(panelXanh);
		
		JLabel lblIconLock = new JLabel("");
		lblIconLock.setIcon(ICon.designIcon("D:\\TTCN\\QuanLyPhongTro\\src\\main\\resources\\icon\\lock.png", 40, 40));
		lblIconLock.setBounds(20, 104, 40, 49);
		frame.getContentPane().add(lblIconLock);
		
	}
}
