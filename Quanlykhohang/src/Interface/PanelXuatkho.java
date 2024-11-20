/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Proccess.Hanghoa;
import Proccess.Hangxuat;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelXuatkho extends javax.swing.JPanel {

    public PanelXuatkho() {
        initComponents();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        PanelXUATPHIEU = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblSophieux = new javax.swing.JLabel();
        lblSoluongx = new javax.swing.JLabel();
        lblMAHANG = new javax.swing.JLabel();
        Panelhangxuat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHangxuat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtSophieuxuat = new javax.swing.JTextField();
        txtNgayxuat = new javax.swing.JTextField();
        txtMathukho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        lblMahang = new javax.swing.JLabel();
        txtMahang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        lblHANGXUAT = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTaophieu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnInphieuxuat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phiếu xuất");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(468, 468, 468))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(624, 440));

        lblSophieux.setForeground(new java.awt.Color(0, 0, 0));
        lblSophieux.setText("Số phiếu xuất :");

        lblSoluongx.setForeground(new java.awt.Color(0, 0, 0));
        lblSoluongx.setText("Số lượng xuất :");

        lblMAHANG.setForeground(new java.awt.Color(0, 0, 0));
        lblMAHANG.setText("Mã hàng :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMAHANG)
                    .addComponent(lblSophieux)
                    .addComponent(lblSoluongx))
                .addGap(182, 182, 182))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblMAHANG)
                .addGap(18, 18, 18)
                .addComponent(lblSophieux)
                .addGap(28, 28, 28)
                .addComponent(lblSoluongx)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout PanelXUATPHIEULayout = new javax.swing.GroupLayout(PanelXUATPHIEU);
        PanelXUATPHIEU.setLayout(PanelXUATPHIEULayout);
        PanelXUATPHIEULayout.setHorizontalGroup(
            PanelXUATPHIEULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelXUATPHIEULayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(PanelXUATPHIEULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelXUATPHIEULayout.setVerticalGroup(
            PanelXUATPHIEULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXUATPHIEULayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(PanelXUATPHIEULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(PanelXUATPHIEU, "card2");

        tableHangxuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Số phiếu xuất ", "Ngày xuất ", "Mã thủ kho", "Mã hàng", "Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHangxuat.setShowHorizontalLines(false);
        tableHangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHangxuatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHangxuat);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setText("Mã nhân viên : ");

        jLabel3.setText("Số phiếu xuất :");

        jLabel4.setText("Ngày xuất : ");

        jLabel5.setText("Mã thu  kho :");

        jLabel6.setText("Giá :");

        lblMahang.setText("Mã hàng :");

        jLabel8.setText("Số lượng :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNgayxuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(txtSophieuxuat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManv, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMahang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMathukho, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMahang, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMahang)
                    .addComponent(txtMahang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSophieuxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtMathukho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNgayxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        lblHANGXUAT.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHANGXUAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHANGXUAT.setText("Hàng xuất ");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnTaophieu.setText("Tạo phiếu ");
        btnTaophieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaophieuActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnInphieuxuat.setText("In phiếu xuất hàng ");
        btnInphieuxuat.setActionCommand("");
        btnInphieuxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInphieuxuatActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa ");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInphieuxuat)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTaophieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaophieu)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInphieuxuat)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelhangxuatLayout = new javax.swing.GroupLayout(Panelhangxuat);
        Panelhangxuat.setLayout(PanelhangxuatLayout);
        PanelhangxuatLayout.setHorizontalGroup(
            PanelhangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHANGXUAT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelhangxuatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelhangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(PanelhangxuatLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelhangxuatLayout.setVerticalGroup(
            PanelhangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelhangxuatLayout.createSequentialGroup()
                .addComponent(lblHANGXUAT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PanelhangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(Panelhangxuat, "card3");
    }// </editor-fold>//GEN-END:initComponents
    private void loadDataToTable() {
        try {
            // Tạo đối tượng HangxuatModel để lấy danh sách dữ liệu
            Hangxuat HangxuatModel = new Hangxuat();
            List<Hangxuat> list = HangxuatModel.getHangxuat();

            // Lấy mô hình bảng (table model) và xóa dữ liệu cũ
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tableHangxuat.getModel();

            // Đặt tên cột
            model.setColumnIdentifiers(new Object[]{
                "STT", "Mã NV", "Số phiếu xuất", "Ngày xuất", "Mã thủ kho", "Mã hàng", "Số lượng ", "Giá"
            });

            // Xóa các hàng cũ trong bảng
            model.setRowCount(0);

            // Thêm các hàng dữ liệu mới vào bảng
            int stt = 1;
            for (Hangxuat hx : list) {
                model.addRow(new Object[]{
                    stt++,
                    hx.getManv(),
                    hx.getSophieuxuat(),
                    hx.getNgayxuat(),
                    hx.getMathukho(),
                    hx.getMahang(),
                    hx.getSoluongxuat(),
                    hx.getGia()
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu vào bảng.");
        }
    }

    private void btnTaophieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaophieuActionPerformed
        String manv = txtManv.getText();
        int sophieuxuat = Integer.parseInt(txtSophieuxuat.getText());
        java.sql.Date ngayxuat = java.sql.Date.valueOf(txtNgayxuat.getText());  // nam-thang-ngay 
        String mathukho = txtMathukho.getText();

        String mahang = txtMahang.getText();
        int soluong = Integer.parseInt(txtSoluong.getText());
        double gia = Double.parseDouble(txtGia.getText());

        if (manv.isEmpty() || mahang.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
        } else {
            try {
                Hangxuat hangxuat = new Hangxuat();
                if (hangxuat.getHangxuat(sophieuxuat) != null) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Số phiếu xuất đã tồn tại. Vui lòng nhập mã khác!");
                    return;
                }

                // Thiết lập giá trị
                hangxuat.setManv(manv);
                hangxuat.setSophieuxuat(sophieuxuat);
                hangxuat.setNgayxuat(ngayxuat);
                hangxuat.setMathukho(mathukho);
                hangxuat.setSoluongxuat(soluong);
//                hangxuat.setMahang(mahang);

//                hangxuat.setGia(gia);
                Hanghoa hanghoa = new Hanghoa();
                hanghoa.setMahh(mahang);
                hanghoa.setGia(gia);
                hangxuat.getDSHanghoa().add(hanghoa);

                if (hangxuat.InsertHangxuat(hangxuat)) {
                    loadDataToTable();

                    txtManv.setText("");
                    txtSophieuxuat.setText("");
                    txtNgayxuat.setText("");
                    txtMathukho.setText("");
                    txtMahang.setText("");
                    txtSoluong.setText("");
                    txtGia.setText("");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi!");
            }
        }
    }//GEN-LAST:event_btnTaophieuActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tableHangxuat.getSelectedRow();
        // Kiểm tra xem đã chọn hàng chưa
        if (row != -1) {
            String manv = txtManv.getText();
            int sophieuxuat = Integer.parseInt(txtSophieuxuat.getText());
            Date ngayxuat = java.sql.Date.valueOf(txtNgayxuat.getText()); // Định dạng yyyy-MM-dd
            String mathukho = txtMathukho.getText();
            String mahang = txtMahang.getText();
            int soluong = Integer.parseInt(txtSoluong.getText());
            double gia = Double.parseDouble(txtGia.getText());

            if (manv.isEmpty() || mahang.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin");
            } else {
                try {
                    Hangxuat hangxuat = new Hangxuat();

                    // Thiết lập giá trị
                    hangxuat.setManv(manv);
                    hangxuat.setSophieuxuat(sophieuxuat);
                    hangxuat.setNgayxuat((java.sql.Date) ngayxuat);
                    hangxuat.setMathukho(mathukho);
                    hangxuat.setMahang(mahang);
                    hangxuat.setSoluongxuat(soluong);
                    hangxuat.setGia(gia);

                    // Gọi hàm
                    if (hangxuat.EditHangxuat(hangxuat)) {
                        javax.swing.JOptionPane.showMessageDialog(this, "Sửa thành công.");
                        // Cập nhật vào bảng
                        tableHangxuat.setValueAt(manv, row, 1);
                        tableHangxuat.setValueAt(sophieuxuat, row, 2);
                        tableHangxuat.setValueAt(ngayxuat, row, 3);
                        tableHangxuat.setValueAt(mathukho, row, 4);
                        tableHangxuat.setValueAt(mahang, row, 5);
                        tableHangxuat.setValueAt(soluong, row, 6);
                        tableHangxuat.setValueAt(gia, row, 7);
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Sửa thất bại.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(this, "Lỗi trong quá trình sửa.");
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng để sửa.");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tableHangxuat.getSelectedRow();
        if (row != -1) {
            int sophieuxuat = Integer.parseInt(tableHangxuat.getValueAt(row, 2).toString()); // Lấy số phiếu xuất từ bảng
            try {
                Hangxuat hx = new Hangxuat();
                if (hx.DeleteHangxuat(sophieuxuat)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tableHangxuat.getModel();
                    model.removeRow(row);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi trong quá trình xóa.");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn hàng để xóa.");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.disable();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnInphieuxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInphieuxuatActionPerformed
   /*     int selectedRow = tableHangxuat.getSelectedRow();  // Lấy dòng được chọn
        if (selectedRow != -1) {
            // Lấy giá trị của Sophieuxuat và Mahang từ bảng
            int sophieuxuat = (int) tableHangxuat.getValueAt(selectedRow, 1);  // Cột 1: Sophieuxuat
            String mahang = (String) tableHangxuat.getValueAt(selectedRow, 0); // Cột 0: Mahang

            // Gọi phương thức lấy dữ liệu từ cơ sở dữ liệu
            try {
                Phieuxuat phieuxuat = getPhieuxuatData(sophieuxuat, mahang);  // Phương thức lấy dữ liệu

                // Cập nhật các JLabel trong JPanel mới với dữ liệu từ phieuxuat
                lblSophieux.setText("Số phiếu xuất: " + phieuxuat.getSophieuxuat());
                lblMahang.setText("Mã hàng: " + phieuxuat.getMahang());
                lblSoluongx.setText("Số lượng xuất: " + phieuxuat.getSoluongxuat());
                lblNgayxuat.setText("Ngày xuất: " + phieuxuat.getNgayxuat().toString());

                // Chuyển sang JPanel hiển thị thông tin
                PanelXUATPHIEU.setVisible(true); //  là JPanel hiển thị thông tin phiếu xuất

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu phiếu xuất");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng trong bảng!");
        }
*/
    }//GEN-LAST:event_btnInphieuxuatActionPerformed

    private void tableHangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHangxuatMouseClicked
        int selectedRow = tableHangxuat.getSelectedRow(); // Lấy chỉ số dòng được chọn

        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn hay không
            String manv = tableHangxuat.getValueAt(selectedRow, 1).toString();
            String sophieuxuat = tableHangxuat.getValueAt(selectedRow, 2).toString();
            String ngayxuat = tableHangxuat.getValueAt(selectedRow, 3).toString();
            String mathukho = tableHangxuat.getValueAt(selectedRow, 4).toString();
            String mahang = tableHangxuat.getValueAt(selectedRow, 5).toString();
            String soluongxuat = tableHangxuat.getValueAt(selectedRow, 6).toString();
            String Gia = tableHangxuat.getValueAt(selectedRow, 7).toString();

            // Set các giá trị cho các JTextField
            txtManv.setText(manv);
            txtSophieuxuat.setText(sophieuxuat);
            txtNgayxuat.setText(ngayxuat);
            txtMathukho.setText(mathukho);
            txtMahang.setText(mahang);
            txtSoluong.setText(soluongxuat);
            txtGia.setText(Gia);
        }
    }//GEN-LAST:event_tableHangxuatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelXUATPHIEU;
    private javax.swing.JPanel Panelhangxuat;
    private javax.swing.JButton btnInphieuxuat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaophieu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblHANGXUAT;
    private javax.swing.JLabel lblMAHANG;
    private javax.swing.JLabel lblMahang;
    private javax.swing.JLabel lblSoluongx;
    private javax.swing.JLabel lblSophieux;
    private javax.swing.JTable tableHangxuat;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMahang;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtMathukho;
    private javax.swing.JTextField txtNgayxuat;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtSophieuxuat;
    // End of variables declaration//GEN-END:variables
}
