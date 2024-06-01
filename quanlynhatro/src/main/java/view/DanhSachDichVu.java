/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DichVuController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.DichVu;
import model.NguoiThue;

/**
 *
 * @author ASUS
 */
public class DanhSachDichVu extends javax.swing.JFrame {
    DichVuController dichVuController;
    
    DefaultTableModel defaultTableModel = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    /**
     * Creates new form QuanLyDichVu2
     */
     private void setActiveTab(String tabName) {
        switch (tabName) {
            case "nhatro" -> {
                this.nhaTroTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "phongtro" -> {
                this.phongTroTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "taisan" -> {
               this.taiSanTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "dichvu" -> {
                this.dichVuTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "hopdong" -> {
                this.hopDongTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "nguoichothue" -> {
               this.nguoiChoThueTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "hoadon" -> {
                this.hoaDonTab.setBackground(new Color(179, 229, 252));
                break;
            }
            case "baocao" -> {
                this.baoCaoTab.setBackground(new Color(179, 229, 252));
                break;
            }

            default -> {
                this.nhaTroTab.setBackground(Color.WHITE);
                this.dichVuTab.setBackground(Color.WHITE);
                this.taiSanTab.setBackground(Color.WHITE);
                this.nguoiChoThueTab.setBackground(Color.WHITE);
                this.hopDongTab.setBackground(Color.WHITE);
                this.hoaDonTab.setBackground(Color.WHITE);
                this.baoCaoTab.setBackground(Color.WHITE);
                
                break;
            }
        }
    }

   
    public DanhSachDichVu() {
        initComponents();
        dichVuController = new DichVuController();
        DichVuTable.getTableHeader().setFont(new Font("Time New Roman", Font.BOLD, 16));
        DichVuTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Mã dịch vụ");
        defaultTableModel.addColumn("Tên dịch vụ");
        defaultTableModel.addColumn("Giá");
        defaultTableModel.addColumn("Đơn vị tính");
        defaultTableModel.addColumn("Ngày bắt đầu");
        defaultTableModel.addColumn("Ngày kết thúc");
        defaultTableModel.addColumn("Trạng thái");
        
        setData(dichVuController.sellectAll());
        // Thêm sự kiện lắng nghe cho các tab
        nhaTroTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("nhatro");
            }
            });

        phongTroTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("phongtro");
            }
        });

        dichVuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("dichvu");
            }
        });

        taiSanTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("taisan");
            }
        });

        hopDongTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("hopdong");
            }
        });

        nguoiChoThueTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setActiveTab("nguoichothue");
            }
        });

        baoCaoTab.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            setActiveTab("baocao");
        }
        });

        hoaDonTab.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            setActiveTab("hoadon");
        }
        });

       
    }
    public void setData(List <DichVu> listdichvu){
        
        for(DichVu x : listdichvu){
            defaultTableModel.addRow(new Object[]{x.getMaDichVu(), x.getTenDichVu(), x.getGia(), x.getDonViTinh(), 
                x.getNgayBatDau(), x.getNgayKetThuc(), x.getTrangThai()});
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhaTroTab = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nhaTroLabel = new javax.swing.JLabel();
        phongTroTab = new javax.swing.JPanel();
        phongTroLabel = new javax.swing.JLabel();
        dichVuTab = new javax.swing.JPanel();
        dichVuLabel = new javax.swing.JLabel();
        hopDongTab = new javax.swing.JPanel();
        hopDongLabel = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        taiSanTab = new javax.swing.JPanel();
        taiSanLabel = new javax.swing.JLabel();
        nguoiChoThueTab = new javax.swing.JPanel();
        nguoiChoThueLabel = new javax.swing.JLabel();
        baoCaoTab = new javax.swing.JPanel();
        baoCaoLabel = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        hoaDonTab = new javax.swing.JPanel();
        hoaDonLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DichVuTable = new javax.swing.JTable();
        themDichVuButton = new javax.swing.JButton();
        suaDichVuButton = new javax.swing.JButton();
        xoaDichVuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhaTroTab.setBackground(new java.awt.Color(255, 255, 255));
        nhaTroTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaTroTabMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        nhaTroLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nhaTroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        nhaTroLabel.setText("Nhà trọ");
        nhaTroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhaTroLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nhaTroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaTroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        phongTroTab.setBackground(new java.awt.Color(255, 255, 255));

        phongTroLabel.setBackground(new java.awt.Color(255, 255, 255));
        phongTroLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        phongTroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bed.png"))); // NOI18N
        phongTroLabel.setText("Phòng trọ");
        phongTroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phongTroLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout phongTroTabLayout = new javax.swing.GroupLayout(phongTroTab);
        phongTroTab.setLayout(phongTroTabLayout);
        phongTroTabLayout.setHorizontalGroup(
            phongTroTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phongTroTabLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(phongTroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phongTroTabLayout.setVerticalGroup(
            phongTroTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phongTroTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phongTroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dichVuTab.setBackground(new java.awt.Color(255, 255, 255));
        dichVuTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dichVuTabMouseClicked(evt);
            }
        });

        dichVuLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dichVuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer-service.png"))); // NOI18N
        dichVuLabel.setText("Dịch vụ");

        javax.swing.GroupLayout dichVuTabLayout = new javax.swing.GroupLayout(dichVuTab);
        dichVuTab.setLayout(dichVuTabLayout);
        dichVuTabLayout.setHorizontalGroup(
            dichVuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dichVuTabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dichVuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        dichVuTabLayout.setVerticalGroup(
            dichVuTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dichVuTabLayout.createSequentialGroup()
                .addComponent(dichVuLabel)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        hopDongTab.setBackground(new java.awt.Color(255, 255, 255));

        hopDongLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hopDongLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contract.png"))); // NOI18N
        hopDongLabel.setText("Hợp đồng");

        javax.swing.GroupLayout hopDongTabLayout = new javax.swing.GroupLayout(hopDongTab);
        hopDongTab.setLayout(hopDongTabLayout);
        hopDongTabLayout.setHorizontalGroup(
            hopDongTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hopDongTabLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(hopDongLabel)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        hopDongTabLayout.setVerticalGroup(
            hopDongTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hopDongTabLayout.createSequentialGroup()
                .addComponent(hopDongLabel)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        taiSanTab.setBackground(new java.awt.Color(255, 255, 255));

        taiSanLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        taiSanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fixed-asset.png"))); // NOI18N
        taiSanLabel.setText("Tài sản");

        javax.swing.GroupLayout taiSanTabLayout = new javax.swing.GroupLayout(taiSanTab);
        taiSanTab.setLayout(taiSanTabLayout);
        taiSanTabLayout.setHorizontalGroup(
            taiSanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taiSanTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(taiSanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        taiSanTabLayout.setVerticalGroup(
            taiSanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taiSanTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taiSanLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nguoiChoThueTab.setBackground(new java.awt.Color(255, 255, 255));

        nguoiChoThueLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nguoiChoThueLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/team.png"))); // NOI18N
        nguoiChoThueLabel.setText("Người cho thuê");
        nguoiChoThueLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nguoiChoThueLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nguoiChoThueTabLayout = new javax.swing.GroupLayout(nguoiChoThueTab);
        nguoiChoThueTab.setLayout(nguoiChoThueTabLayout);
        nguoiChoThueTabLayout.setHorizontalGroup(
            nguoiChoThueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nguoiChoThueTabLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nguoiChoThueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        nguoiChoThueTabLayout.setVerticalGroup(
            nguoiChoThueTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nguoiChoThueTabLayout.createSequentialGroup()
                .addComponent(nguoiChoThueLabel)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        baoCaoTab.setBackground(new java.awt.Color(255, 255, 255));

        baoCaoLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        baoCaoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/seo-report.png"))); // NOI18N
        baoCaoLabel.setText("Báo cáo");

        javax.swing.GroupLayout baoCaoTabLayout = new javax.swing.GroupLayout(baoCaoTab);
        baoCaoTab.setLayout(baoCaoTabLayout);
        baoCaoTabLayout.setHorizontalGroup(
            baoCaoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baoCaoTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(baoCaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        baoCaoTabLayout.setVerticalGroup(
            baoCaoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baoCaoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baoCaoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        hoaDonTab.setBackground(new java.awt.Color(255, 255, 255));

        hoaDonLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        hoaDonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        hoaDonLabel.setText("Hóa đơn");

        javax.swing.GroupLayout hoaDonTabLayout = new javax.swing.GroupLayout(hoaDonTab);
        hoaDonTab.setLayout(hoaDonTabLayout);
        hoaDonTabLayout.setHorizontalGroup(
            hoaDonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoaDonTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hoaDonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        hoaDonTabLayout.setVerticalGroup(
            hoaDonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hoaDonTabLayout.createSequentialGroup()
                .addComponent(hoaDonLabel)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(phongTroTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dichVuTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(baoCaoTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nguoiChoThueTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hopDongTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taiSanTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(hoaDonTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(phongTroTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dichVuTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taiSanTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(hopDongTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nguoiChoThueTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baoCaoTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(hoaDonTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Danh sách dịch vụ");

        DichVuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá", "Đơn vị tính", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DichVuTable);

        themDichVuButton.setBackground(new java.awt.Color(46, 145, 87));
        themDichVuButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        themDichVuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        themDichVuButton.setText("Thêm");
        themDichVuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDichVuButtonActionPerformed(evt);
            }
        });

        suaDichVuButton.setBackground(new java.awt.Color(46, 145, 87));
        suaDichVuButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        suaDichVuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exchange.png"))); // NOI18N
        suaDichVuButton.setText("Sửa");
        suaDichVuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDichVuButtonActionPerformed(evt);
            }
        });

        xoaDichVuButton.setBackground(new java.awt.Color(46, 145, 87));
        xoaDichVuButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        xoaDichVuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        xoaDichVuButton.setText("Xóa ");
        xoaDichVuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDichVuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(themDichVuButton)
                .addGap(139, 139, 139)
                .addComponent(suaDichVuButton)
                .addGap(178, 178, 178)
                .addComponent(xoaDichVuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themDichVuButton)
                            .addComponent(suaDichVuButton)
                            .addComponent(xoaDichVuButton))
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout nhaTroTabLayout = new javax.swing.GroupLayout(nhaTroTab);
        nhaTroTab.setLayout(nhaTroTabLayout);
        nhaTroTabLayout.setHorizontalGroup(
            nhaTroTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhaTroTabLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nhaTroTabLayout.setVerticalGroup(
            nhaTroTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nhaTroTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(nhaTroTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nhaTroTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhaTroTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themDichVuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themDichVuButtonActionPerformed
        new ThemDichVu().setVisible(true);
    }//GEN-LAST:event_themDichVuButtonActionPerformed

    private void suaDichVuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaDichVuButtonActionPerformed
        // TODO add your handling code here:
        int row = DichVuTable.getSelectedRow();
        if(row == -1) {
            JOptionPane.showMessageDialog(DanhSachDichVu.this, "Vui lòng chọn dịch vụ trước", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            String maDichVu = String.valueOf(DichVuTable.getValueAt(row, 0));
            new SuaDichVu(maDichVu).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_suaDichVuButtonActionPerformed

    private void xoaDichVuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaDichVuButtonActionPerformed
        // TODO add your handling code here:
        int row = DichVuTable.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(DanhSachDichVu.this , "Vui lòng chọn dịch vụ cần xóa trước!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            int confirm = JOptionPane.showConfirmDialog(DanhSachDichVu.this, "Bạn chắc chắn muốn xóa không?");
            
            if(confirm == JOptionPane.YES_OPTION)
            {
                String maDichVu = String.valueOf(DichVuTable.getValueAt(row, 0));
                dichVuController.deleteDichVu(maDichVu);
                defaultTableModel.setRowCount(0);
                setData(dichVuController.sellectAll());
            }
        }
    }//GEN-LAST:event_xoaDichVuButtonActionPerformed

    private void nhaTroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaTroLabelMouseClicked
        // TODO add your handling code here:
        this.setActiveTab("nhatro");
        new NhaTroView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nhaTroLabelMouseClicked

    private void nhaTroTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhaTroTabMouseClicked
        // TODO add your handling code here:
         this.nhaTroLabelMouseClicked(evt);
    }//GEN-LAST:event_nhaTroTabMouseClicked

    private void phongTroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongTroLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phongTroLabelMouseClicked
    
    private void dichVuTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dichVuTabMouseClicked
        // TODO add your handling code here:
        this.setActiveTab("dichvu");
        new DanhSachDichVu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dichVuTabMouseClicked

    private void nguoiChoThueLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nguoiChoThueLabelMouseClicked
        // TODO add your handling code here:
        this.setActiveTab("nguoithue");
        new DanhSachNguoiThue().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nguoiChoThueLabelMouseClicked

    /**
     * @param args the command line arguments
     */     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DichVuTable;
    private javax.swing.JLabel baoCaoLabel;
    private javax.swing.JPanel baoCaoTab;
    private javax.swing.JLabel dichVuLabel;
    private javax.swing.JPanel dichVuTab;
    private javax.swing.JLabel hoaDonLabel;
    private javax.swing.JPanel hoaDonTab;
    private javax.swing.JLabel hopDongLabel;
    private javax.swing.JPanel hopDongTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nguoiChoThueLabel;
    private javax.swing.JPanel nguoiChoThueTab;
    private javax.swing.JLabel nhaTroLabel;
    private javax.swing.JPanel nhaTroTab;
    private javax.swing.JLabel phongTroLabel;
    private javax.swing.JPanel phongTroTab;
    private javax.swing.JButton suaDichVuButton;
    private javax.swing.JLabel taiSanLabel;
    private javax.swing.JPanel taiSanTab;
    private javax.swing.JButton themDichVuButton;
    private javax.swing.JButton xoaDichVuButton;
    // End of variables declaration//GEN-END:variables
}
