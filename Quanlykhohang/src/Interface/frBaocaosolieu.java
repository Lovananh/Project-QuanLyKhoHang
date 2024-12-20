/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Proccess.DateDAO;
import Proccess.DateDAO.TonKho;
import Proccess.Hangnhap;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class frBaocaosolieu extends javax.swing.JFrame {

    public frBaocaosolieu() {
        initComponents();
        setLocationRelativeTo(null); // can giua khi hien 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        Container = new javax.swing.JPanel();
        lblBaocaosolieu = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblHangnhap = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblTungay = new javax.swing.JLabel();
        lblDenngay = new javax.swing.JLabel();
        txtFromnhap = new javax.swing.JTextField();
        txtTonhap = new javax.swing.JTextField();
        btnBaocaoNhap = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBaocaoXuat = new javax.swing.JButton();
        btnThoat2 = new javax.swing.JButton();
        lblHangxuat = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblTungay1 = new javax.swing.JLabel();
        lblDenngay1 = new javax.swing.JLabel();
        txtFromxuat = new javax.swing.JTextField();
        txtToxuat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBaocaoTonkho = new javax.swing.JButton();
        btnThoat3 = new javax.swing.JButton();
        lblHangtonkho = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTungay2 = new javax.swing.JLabel();
        lblDenngay2 = new javax.swing.JLabel();
        txtFromtonkho = new javax.swing.JTextField();
        txtTotonkho = new javax.swing.JTextField();
        Hoadon = new javax.swing.JPanel();
        lblHANGNHAP = new javax.swing.JLabel();
        lblTungayn = new javax.swing.JLabel();
        lblDenngayn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHangnhap = new javax.swing.JTable();
        Hoadontonkho = new javax.swing.JPanel();
        lblTONKHO = new javax.swing.JLabel();
        lblTungaytk = new javax.swing.JLabel();
        lblDenngaytk = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableTonkho = new javax.swing.JTable();
        HoadonXuat = new javax.swing.JPanel();
        lblHANGXUAT = new javax.swing.JLabel();
        lblTungayx = new javax.swing.JLabel();
        lblDenngayx = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableHangxuat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Main.setLayout(new java.awt.CardLayout());

        Container.setBackground(new java.awt.Color(204, 204, 255));

        lblBaocaosolieu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblBaocaosolieu.setForeground(new java.awt.Color(0, 0, 0));
        lblBaocaosolieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaocaosolieu.setText("Báo cáo số liệu");

        jTabbedPane2.setBackground(java.awt.SystemColor.activeCaption);
        jTabbedPane2.setToolTipText("");

        lblHangnhap.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangnhap.setText("Báo cáo hàng nhập");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTungay.setText("Từ ngày :");

        lblDenngay.setText("Đến ngày :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTungay)
                        .addGap(35, 35, 35)
                        .addComponent(txtFromnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblDenngay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTonhap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungay)
                    .addComponent(txtFromnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDenngay)
                    .addComponent(txtTonhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnBaocaoNhap.setText("Báo cáo");
        btnBaocaoNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaocaoNhapActionPerformed(evt);
            }
        });

        btnThoat1.setText("Thoát");
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnBaocaoNhap)
                .addGap(53, 53, 53)
                .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaocaoNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nhập hàng", jPanel2);

        btnBaocaoXuat.setText("Báo cáo");
        btnBaocaoXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaocaoXuatActionPerformed(evt);
            }
        });

        btnThoat2.setText("Thoát");
        btnThoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat2ActionPerformed(evt);
            }
        });

        lblHangxuat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangxuat.setText("Báo cáo hàng xuất");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTungay1.setText("Từ ngày :");

        lblDenngay1.setText("Đến ngày :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTungay1)
                        .addGap(35, 35, 35)
                        .addComponent(txtFromxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblDenngay1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtToxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungay1)
                    .addComponent(txtFromxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDenngay1)
                    .addComponent(txtToxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnBaocaoXuat)
                .addGap(53, 53, 53)
                .addComponent(btnThoat2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaocaoXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Xuất hàng", jPanel1);

        btnBaocaoTonkho.setText("Báo cáo");
        btnBaocaoTonkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaocaoTonkhoActionPerformed(evt);
            }
        });

        btnThoat3.setText("Thoát");
        btnThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat3ActionPerformed(evt);
            }
        });

        lblHangtonkho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHangtonkho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangtonkho.setText("Báo cáo tồn kho");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTungay2.setText("Từ ngày :");

        lblDenngay2.setText("Đến ngày :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTungay2)
                        .addGap(35, 35, 35)
                        .addComponent(txtFromtonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblDenngay2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungay2)
                    .addComponent(txtFromtonkho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDenngay2)
                    .addComponent(txtTotonkho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHangtonkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnBaocaoTonkho)
                .addGap(53, 53, 53)
                .addComponent(btnThoat3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHangtonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaocaoTonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tồn kho", jPanel3);

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBaocaosolieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addComponent(lblBaocaosolieu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        Main.add(Container, "card2");

        Hoadon.setBackground(new java.awt.Color(255, 255, 255));

        lblHANGNHAP.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblHANGNHAP.setForeground(new java.awt.Color(0, 0, 0));
        lblHANGNHAP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHANGNHAP.setText("Hàng nhập");

        lblTungayn.setForeground(new java.awt.Color(0, 0, 0));
        lblTungayn.setText("Từ ngày :");

        lblDenngayn.setForeground(new java.awt.Color(0, 0, 0));
        lblDenngayn.setText("Đến ngày:");

        TableHangnhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng", "Đơn vị tính", "Số lượng", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableHangnhap);

        javax.swing.GroupLayout HoadonLayout = new javax.swing.GroupLayout(Hoadon);
        Hoadon.setLayout(HoadonLayout);
        HoadonLayout.setHorizontalGroup(
            HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoadonLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(HoadonLayout.createSequentialGroup()
                .addGroup(HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoadonLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblTungayn, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(99, 99, 99)
                        .addComponent(lblDenngayn, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addGroup(HoadonLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblHANGNHAP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGap(127, 127, 127))
        );
        HoadonLayout.setVerticalGroup(
            HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadonLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblHANGNHAP, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungayn)
                    .addComponent(lblDenngayn))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        Main.add(Hoadon, "card2");

        Hoadontonkho.setBackground(new java.awt.Color(255, 255, 255));

        lblTONKHO.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTONKHO.setForeground(new java.awt.Color(0, 0, 0));
        lblTONKHO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTONKHO.setText("Tồn kho");

        lblTungaytk.setForeground(new java.awt.Color(0, 0, 0));
        lblTungaytk.setText("Từ ngày :");

        lblDenngaytk.setForeground(new java.awt.Color(0, 0, 0));
        lblDenngaytk.setText("Đến ngày:");

        TableTonkho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hàng", "Tên hàng", "Lượng nhập", "Lượng xuất", "Tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TableTonkho);

        javax.swing.GroupLayout HoadontonkhoLayout = new javax.swing.GroupLayout(Hoadontonkho);
        Hoadontonkho.setLayout(HoadontonkhoLayout);
        HoadontonkhoLayout.setHorizontalGroup(
            HoadontonkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadontonkhoLayout.createSequentialGroup()
                .addGroup(HoadontonkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoadontonkhoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblTONKHO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(HoadontonkhoLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblTungaytk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99)
                        .addComponent(lblDenngaytk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoadontonkhoLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );
        HoadontonkhoLayout.setVerticalGroup(
            HoadontonkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadontonkhoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblTONKHO, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(HoadontonkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungaytk)
                    .addComponent(lblDenngaytk))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        Main.add(Hoadontonkho, "card4");

        HoadonXuat.setBackground(new java.awt.Color(255, 255, 255));

        lblHANGXUAT.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblHANGXUAT.setForeground(new java.awt.Color(0, 0, 0));
        lblHANGXUAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHANGXUAT.setText("Hàng xuất");

        lblTungayx.setForeground(new java.awt.Color(0, 0, 0));
        lblTungayx.setText("Từ ngày :");

        lblDenngayx.setForeground(new java.awt.Color(0, 0, 0));
        lblDenngayx.setText("Đến ngày:");

        TableHangxuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hàng", "Đơn vị tính", "Số lượng ", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableHangxuat);

        javax.swing.GroupLayout HoadonXuatLayout = new javax.swing.GroupLayout(HoadonXuat);
        HoadonXuat.setLayout(HoadonXuatLayout);
        HoadonXuatLayout.setHorizontalGroup(
            HoadonXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadonXuatLayout.createSequentialGroup()
                .addGroup(HoadonXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoadonXuatLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblHANGXUAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(HoadonXuatLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblTungayx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99)
                        .addComponent(lblDenngayx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoadonXuatLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );
        HoadonXuatLayout.setVerticalGroup(
            HoadonXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadonXuatLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblHANGXUAT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(HoadonXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTungayx)
                    .addComponent(lblDenngayx))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        Main.add(HoadonXuat, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBaocaoNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaocaoNhapActionPerformed
        try {
            // Lấy ngày từ TextField
            String fromDateStr = txtFromnhap.getText();
            String toDateStr = txtTonhap.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fromDate = dateFormat.parse(fromDateStr);
            Date toDate = dateFormat.parse(toDateStr);

            // Lấy dữ liệu hàng nhập từ DAO
            DateDAO dateDAO = new DateDAO();
            List<DateDAO.Hangnhap> hangnhapList = dateDAO.getHangnhapByDate(fromDate, toDate);

            // Tạo workbook Excel
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Hang Nhap");

            // Tạo tiêu đề
            XSSFRow headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Số Phiếu Nhập");
            headerRow.createCell(1).setCellValue("Tên Hàng");
            headerRow.createCell(2).setCellValue("Số Lượng");
            headerRow.createCell(3).setCellValue("Đơn Giá");
            headerRow.createCell(4).setCellValue("Ngày Nhập");

            // Duyệt danh sách và thêm vào bảng
            int rowCount = 1;
            for (DateDAO.Hangnhap hang : hangnhapList) {
                XSSFRow row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(hang.getSophieunhap());
                row.createCell(1).setCellValue(hang.getTenhang());
                row.createCell(2).setCellValue(hang.getSoluong());
                row.createCell(3).setCellValue(hang.getDongia());
                row.createCell(4).setCellValue(hang.getNgaynhap().toString());
            }

            // Ghi dữ liệu vào file Excel
            String excelPath = "D:/Baocao_Hangnhap.xlsx";
            FileOutputStream fileOut = new FileOutputStream(excelPath);
            workbook.write(fileOut);
            fileOut.close();

            JOptionPane.showMessageDialog(this, "Báo cáo đã được xuất thành công ra file Excel: " + excelPath);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xuất báo cáo: " + ex.getMessage());
        }

        Hoadon.setVisible(true);
    }//GEN-LAST:event_btnBaocaoNhapActionPerformed

    private void btnBaocaoXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaocaoXuatActionPerformed
        try {
            String fromDateStr = txtFromxuat.getText();
            String toDateStr = txtToxuat.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fromDate = dateFormat.parse(fromDateStr);
            Date toDate = dateFormat.parse(toDateStr);

            DateDAO dateDAO = new DateDAO();
            List<DateDAO.Hangxuat> hangxuatList = dateDAO.getHangxuatByDate(fromDate, toDate);
            // Sắp xếp danh sách theo ngày xuất tăng dần
            hangxuatList.sort(Comparator.comparing(DateDAO.Hangxuat::getNgayxuat));

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Hang Xuat");

            XSSFRow headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Số phiếu xuất");
            headerRow.createCell(1).setCellValue("Mã Hàng");
            headerRow.createCell(2).setCellValue("Số Lượng");
            headerRow.createCell(3).setCellValue("Ngày Xuất");

            int rowCount = 1;
            for (DateDAO.Hangxuat hang : hangxuatList) {
                XSSFRow row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(hang.getSophieuxuat());
                row.createCell(1).setCellValue(hang.getMahang());
                row.createCell(2).setCellValue(hang.getSoluong());
                row.createCell(3).setCellValue(hang.getNgayxuat().toString());
            }

            String excelPath = "D:/Baocao_Hangxuat.xlsx";
            FileOutputStream fileOut = new FileOutputStream(excelPath);
            workbook.write(fileOut);
            fileOut.close();

            JOptionPane.showMessageDialog(this, "Báo cáo đã được xuất thành công ra file Excel: " + excelPath);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xuất báo cáo: " + ex.getMessage());
        }
        HoadonXuat.setVisible(true);
    }//GEN-LAST:event_btnBaocaoXuatActionPerformed

    private void btnBaocaoTonkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaocaoTonkhoActionPerformed
        try {
            String fromDateStr = txtFromtonkho.getText(); // Input từ người dùng
            String toDateStr = txtTotonkho.getText(); // Input từ người dùng
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fromDate = dateFormat.parse(fromDateStr);
            Date toDate = dateFormat.parse(toDateStr);

            DateDAO dateDAO = new DateDAO();
            List<DateDAO.TonKho> tonKhoList = dateDAO.getBaocaoTonKho(fromDate, toDate);

            // Sắp xếp tăng dần hoặc giảm dần theo tồn kho
            tonKhoList.sort(Comparator.comparingInt(TonKho::getTonKho).reversed()); // Sắp giảm dần

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Ton Kho");

            XSSFRow headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Mã Hàng");
            headerRow.createCell(1).setCellValue("Tên Hàng");
            headerRow.createCell(2).setCellValue("Tổng Nhập");
            headerRow.createCell(3).setCellValue("Tổng Xuất");
            headerRow.createCell(4).setCellValue("Tồn Kho");

            int rowCount = 1;
            for (TonKho ton : tonKhoList) {
                XSSFRow row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(ton.getMahang());
                row.createCell(1).setCellValue(ton.getTenhang());
                row.createCell(2).setCellValue(ton.getTongNhap());
                row.createCell(3).setCellValue(ton.getTongXuat());
                row.createCell(4).setCellValue(ton.getTonKho());
            }

            String excelPath = "D:/Baocao_TonKho_Nhap.xlsx";
            FileOutputStream fileOut = new FileOutputStream(excelPath);
            workbook.write(fileOut);
            fileOut.close();

            JOptionPane.showMessageDialog(this, "Báo cáo tồn kho đã được xuất thành công ra file Excel: " + excelPath);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi xuất báo cáo: " + ex.getMessage());
        }

        Hoadontonkho.setVisible(true);
    }//GEN-LAST:event_btnBaocaoTonkhoActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoat1ActionPerformed

    private void btnThoat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoat2ActionPerformed

    private void btnThoat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoat3ActionPerformed

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
            java.util.logging.Logger.getLogger(frBaocaosolieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frBaocaosolieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frBaocaosolieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frBaocaosolieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frBaocaosolieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Hoadon;
    private javax.swing.JPanel HoadonXuat;
    private javax.swing.JPanel Hoadontonkho;
    private javax.swing.JPanel Main;
    private javax.swing.JTable TableHangnhap;
    private javax.swing.JTable TableHangxuat;
    private javax.swing.JTable TableTonkho;
    private javax.swing.JButton btnBaocaoNhap;
    private javax.swing.JButton btnBaocaoTonkho;
    private javax.swing.JButton btnBaocaoXuat;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnThoat2;
    private javax.swing.JButton btnThoat3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblBaocaosolieu;
    private javax.swing.JLabel lblDenngay;
    private javax.swing.JLabel lblDenngay1;
    private javax.swing.JLabel lblDenngay2;
    private javax.swing.JLabel lblDenngayn;
    private javax.swing.JLabel lblDenngaytk;
    private javax.swing.JLabel lblDenngayx;
    private javax.swing.JLabel lblHANGNHAP;
    private javax.swing.JLabel lblHANGXUAT;
    private javax.swing.JLabel lblHangnhap;
    private javax.swing.JLabel lblHangtonkho;
    private javax.swing.JLabel lblHangxuat;
    private javax.swing.JLabel lblTONKHO;
    private javax.swing.JLabel lblTungay;
    private javax.swing.JLabel lblTungay1;
    private javax.swing.JLabel lblTungay2;
    private javax.swing.JLabel lblTungayn;
    private javax.swing.JLabel lblTungaytk;
    private javax.swing.JLabel lblTungayx;
    private javax.swing.JTextField txtFromnhap;
    private javax.swing.JTextField txtFromtonkho;
    private javax.swing.JTextField txtFromxuat;
    private javax.swing.JTextField txtTonhap;
    private javax.swing.JTextField txtTotonkho;
    private javax.swing.JTextField txtToxuat;
    // End of variables declaration//GEN-END:variables
}
