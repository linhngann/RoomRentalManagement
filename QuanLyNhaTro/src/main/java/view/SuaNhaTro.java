/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.NhaTroController;
import java.sql.Date;
import javax.swing.JOptionPane;
import model.NhaTro;

/**
 *
 * @author nm204
 */
public class SuaNhaTro extends javax.swing.JFrame {
    private NhaTro nhatro;
    NhaTroController nhaTroController;
    /**
     * Creates new form SuaNhaTro
     */
    public SuaNhaTro(String maNhaTro) {
        nhatro = new NhaTro();
        nhaTroController = new NhaTroController();
        nhatro = nhaTroController.selectByMa(maNhaTro);
        initComponents();
        
        maNhaTroTextFiled.setText(nhatro.getMaNhaTro());
        tenTextField.setText(nhatro.getTenNhaTro());
        diachiTextField.setText(nhatro.getDiaChi());
        soluongTextField.setText(String.valueOf(nhatro.getSoLuongPhong()));
        ngaybdTextField.setText(String.valueOf(nhatro.getNgayBatDau()));
        tenTextField.setText(nhatro.getTenNhaTro());
        String status = nhatro.getTrangThai();
        if(status != null)
        {
            if(status.equalsIgnoreCase("Y"))
            {
                ttYRadioButton.setSelected(true);
            }
            if(status.equalsIgnoreCase("N"))
            {
                ttNRadioButton.setSelected(true);
            }
        }
        idNVQLTextField.setText(String.valueOf(nhatro.getIdNhanVienQuanLy()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        suabutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tenTextField = new javax.swing.JTextField();
        diachiTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        soluongTextField = new javax.swing.JTextField();
        ngaybdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ttYRadioButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ttNRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        idNVQLTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        maNhaTroTextFiled = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày bắt đầu");

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backbutton.setText("Quay lại");
        backbutton.setPreferredSize(new java.awt.Dimension(120, 35));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Trạng thái");

        suabutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        suabutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        suabutton.setText("Sửa");
        suabutton.setPreferredSize(new java.awt.Dimension(120, 35));
        suabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suabuttonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID nhân viên quản lý");

        tenTextField.setPreferredSize(new java.awt.Dimension(250, 30));

        diachiTextField.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thêm nhà trọ mới");

        soluongTextField.setPreferredSize(new java.awt.Dimension(250, 30));

        ngaybdTextField.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên nhà trọ");

        buttonGroup2.add(ttYRadioButton);
        ttYRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ttYRadioButton.setSelected(true);
        ttYRadioButton.setText("Yes");
        ttYRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttYRadioButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");

        buttonGroup2.add(ttNRadioButton);
        ttNRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ttNRadioButton.setText("No");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Số lượng phòng");

        idNVQLTextField.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhà trọ");

        maNhaTroTextFiled.setEditable(false);
        maNhaTroTextFiled.setEnabled(false);
        maNhaTroTextFiled.setPreferredSize(new java.awt.Dimension(250, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(suabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ttYRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ttNRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(maNhaTroTextFiled, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(tenTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(diachiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(soluongTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ngaybdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idNVQLTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maNhaTroTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diachiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soluongTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngaybdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttYRadioButton)
                    .addComponent(ttNRadioButton)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNVQLTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(suabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void suabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suabuttonActionPerformed
        try {
    // Kiểm tra tên nhà trọ
        String tenNhaTro = tenTextField.getText().trim();
        if (tenNhaTro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên nhà trọ không được để trống.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setTenNhaTro(tenNhaTro);

        // Kiểm tra địa chỉ
        String diaChi = diachiTextField.getText().trim();
        if (diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Địa chỉ không được để trống.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setDiaChi(diaChi);

        // Kiểm tra số lượng phòng
        String soLuongPhongText = soluongTextField.getText().trim();
        int soLuongPhong;
        try {
            soLuongPhong = Integer.parseInt(soLuongPhongText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Số lượng phòng phải là một số nguyên.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setSoLuongPhong(soLuongPhong);

        // Kiểm tra ngày bắt đầu
        String ngayBatDauText = ngaybdTextField.getText().trim();
        Date ngayBatDau;
        try {
            ngayBatDau = Date.valueOf(ngayBatDauText);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu không hợp lệ. Định dạng phải là YYYY-MM-DD.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setNgayBatDau(ngayBatDau);

        // Kiểm tra trạng thái
        String status = "";
        if (ttYRadioButton.isSelected()) {
            status = "Y";
        } else if (ttNRadioButton.isSelected()) {
            status = "N";
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn trạng thái.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setTrangThai(status);

        // Kiểm tra ID nhân viên quản lý
        String idNhanVienQuanLyText = idNVQLTextField.getText().trim();
        int idNhanVienQuanLy;
        try {
            idNhanVienQuanLy = Integer.parseInt(idNhanVienQuanLyText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID nhân viên quản lý phải là một số nguyên.", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nhatro.setIdNhanVienQuanLy(idNhanVienQuanLy);

        // Cập nhật đối tượng nhà trọ vào cơ sở dữ liệu
        nhaTroController.Update(nhatro);
        JOptionPane.showMessageDialog(null, "Cập nhật nhà trọ thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        // Hiển thị view mới và đóng view hiện tại
        this.dispose();

    } catch (Exception e) {
        // Hiển thị thông báo lỗi chung nếu có lỗi xảy ra ngoài các kiểm tra nhập liệu
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi cập nhật nhà trọ: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_suabuttonActionPerformed

    private void ttYRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttYRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttYRadioButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField diachiTextField;
    private javax.swing.JTextField idNVQLTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maNhaTroTextFiled;
    private javax.swing.JTextField ngaybdTextField;
    private javax.swing.JTextField soluongTextField;
    private javax.swing.JButton suabutton;
    private javax.swing.JTextField tenTextField;
    private javax.swing.JRadioButton ttNRadioButton;
    private javax.swing.JRadioButton ttYRadioButton;
    // End of variables declaration//GEN-END:variables
}
