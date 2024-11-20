/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Proccess.Hangnhap;
import java.sql.SQLException;
import java.util.List;

public class PanelNhapkho extends javax.swing.JPanel {

    /**
     * Creates new form PanelNhapkho
     */
    public PanelNhapkho() {
        initComponents();
        loadDataToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTaophieunhap = new javax.swing.JButton();
        btnInphieunhap = new javax.swing.JButton();
        lblHangnhap = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblmahang = new javax.swing.JLabel();
        txtMahang = new javax.swing.JTextField();
        lblSophieun = new javax.swing.JLabel();
        txtSophieun = new javax.swing.JTextField();
        lblMakho = new javax.swing.JLabel();
        txtMakho = new javax.swing.JTextField();
        lblNgaynhap = new javax.swing.JLabel();
        txtNgaynhap = new javax.swing.JTextField();
        lblSoluongtn = new javax.swing.JLabel();
        txtSoluongtn = new javax.swing.JTextField();
        lblSoluongxn = new javax.swing.JLabel();
        txtSoluongxn = new javax.swing.JTextField();
        lblMathukho = new javax.swing.JLabel();
        txtMathukho = new javax.swing.JTextField();
        lblDongia = new javax.swing.JLabel();
        txtDongia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHangnhap = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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

        btnTaophieunhap.setText("Tạo phiếu nhập");
        btnTaophieunhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaophieunhapActionPerformed(evt);
            }
        });

        btnInphieunhap.setText("In phiếu nhập");
        btnInphieunhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInphieunhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnTaophieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(btnInphieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThoat)
                    .addComponent(btnTaophieunhap)
                    .addComponent(btnInphieunhap))
                .addContainerGap())
        );

        lblHangnhap.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHangnhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHangnhap.setText("Hàng nhập");

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        lblmahang.setText("Mã hàng :");

        txtMahang.setToolTipText("");

        lblSophieun.setText("Số phiếu nhập :");

        lblMakho.setText("Mã kho :");

        lblNgaynhap.setText("Ngày nhập :");

        lblSoluongtn.setText("Số lượng thực nhập :");

        lblSoluongxn.setText("Số lượng xuất nhập :");

        lblMathukho.setText("Mã thu kho :");

        lblDongia.setText("Đơn giá :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblMathukho, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMathukho, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDongia, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDongia, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(261, 261, 261))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmahang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMakho, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMakho)
                            .addComponent(txtMahang, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSophieun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtSophieun, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSoluongtn, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoluongtn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSoluongxn, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSoluongxn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMahang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSophieun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoluongtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmahang)
                            .addComponent(lblSophieun)
                            .addComponent(lblSoluongtn))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMakho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSoluongxn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMakho)
                            .addComponent(lblNgaynhap)
                            .addComponent(lblSoluongxn))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMathukho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDongia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMathukho)
                            .addComponent(lblDongia))))
                .addGap(37, 37, 37))
        );

        tableHangnhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hàng", "Mã kho", "Số phiếu nhập", "Ngày nhập", "Mã thủ kho", "Số lượng xuất nhập", "Số lượng thực nhập", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHangnhapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHangnhap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHangnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataToTable() {
        try {
            // Tạo đối tượng HangxuatModel để lấy danh sách dữ liệu
            Hangnhap HangnhapModel = new Hangnhap();
            List<Hangnhap> list = HangnhapModel.getHangnhap();

            // Lấy mô hình bảng (table model) và xóa dữ liệu cũ
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tableHangnhap.getModel();
            // Xóa các hàng cũ trong bảng
            model.setRowCount(0);

            // Thêm các hàng dữ liệu mới vào bảng
            int stt = 1;
            for (Hangnhap hn : list) {
                model.addRow(new Object[]{
                    stt++,
                    hn.getmahang(),
                    hn.getmakho(),
                    hn.getsophieun(),
                    hn.getngaynhap(),
                    hn.getmathukho(),
                    hn.getsoluongtn(),
                    hn.getsoluongxn(),
                    hn.getdongia(),});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu vào bảng.");
        }
    }
    private void btnTaophieunhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaophieunhapActionPerformed
        String mahang = txtMahang.getText();
        String makho = txtMakho.getText();
        int sophieun = Integer.parseInt(txtSophieun.getText());
        java.sql.Date ngaynhap = java.sql.Date.valueOf(txtNgaynhap.getText()); // yyyy-MM-dd
        String mathukho = txtMathukho.getText();
        int soluongtn = Integer.parseInt(txtSoluongtn.getText());
        int soluongxn = Integer.parseInt(txtSoluongxn.getText());
        double dongia = Double.parseDouble(txtDongia.getText());

        if (makho.isEmpty() || mahang.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
        } else {
            try {
                Hangnhap hangnhap = new Hangnhap();
                if (hangnhap.getHangnhap(sophieun) != null) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Mã hàng đã tồn tại. Vui lòng nhập mã khác!");
                    return;
                }
                
                // Thiết lập giá trị
                hangnhap.setmahang(mahang);
                hangnhap.setmakho(makho);
                hangnhap.setsophieun(sophieun);
                hangnhap.setngaynhap(ngaynhap);
                hangnhap.setmathukho(mathukho);
                hangnhap.setsoluongtn(soluongtn);
                hangnhap.setsoluongxn(soluongxn);
                hangnhap.setdongia(dongia);

                if (hangnhap.InsertHangnhap(hangnhap)) {
                    loadDataToTable();

                    txtMahang.setText("");
                    txtMakho.setText("");
                    txtSophieun.setText("");
                    txtNgaynhap.setText("");
                    txtMathukho.setText("");
                    txtSoluongtn.setText("");
                    txtSoluongxn.setText("");
                    txtDongia.setText("");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                }
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Lỗi!");
            }
        }
    }//GEN-LAST:event_btnTaophieunhapActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int row = tableHangnhap.getSelectedRow();
        if (row != -1) {
            String mahang = txtMahang.getText();
            String makho = txtMakho.getText();
            int sophieun = Integer.parseInt(txtSophieun.getText());
            java.sql.Date ngaynhap = java.sql.Date.valueOf(txtNgaynhap.getText()); // yyyy-MM-dd
            String mathukho = txtMathukho.getText();
            int soluongtn = Integer.parseInt(txtSoluongtn.getText());
            int soluongxn = Integer.parseInt(txtSoluongxn.getText());
            double dongia = Double.parseDouble(txtDongia.getText());
            if (makho.isEmpty() || mahang.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            } else {
                try {
                    // Cập nhật dữ liệu cho đối tượng Hangnhap
                    Hangnhap hangnhap = new Hangnhap();
                    hangnhap.setmakho(makho);
                    hangnhap.setmahang(mahang);
                    hangnhap.setsophieun(sophieun);
                    hangnhap.setngaynhap(ngaynhap);
                    hangnhap.setmathukho(mathukho);
                    hangnhap.setsoluongtn(soluongtn);
                    hangnhap.setsoluongxn(soluongxn);
                    hangnhap.setdongia(dongia);

                    if (hangnhap.EditHangnhap(hangnhap)) {
                        loadDataToTable();
                        javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật thành công!");

                        txtMahang.setText("");
                        txtMakho.setText("");
                        txtSophieun.setText("");
                        txtNgaynhap.setText("");
                        txtMathukho.setText("");
                        txtSoluongtn.setText("");
                        txtSoluongxn.setText("");
                        txtDongia.setText("");
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    javax.swing.JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật dữ liệu!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tableHangnhap.getSelectedRow();
        if (row != -1) {
            int sophieunhap = Integer.parseInt(tableHangnhap.getValueAt(row, 3).toString());
            try {
                Hangnhap hn = new Hangnhap();
                if (hn.DeleteHangnhap(sophieunhap)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Xóa thành công!");
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tableHangnhap.getModel();
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
        frTrangChu menu = new frTrangChu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnInphieunhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInphieunhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInphieunhapActionPerformed

    private void tableHangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHangnhapMouseClicked
        int selectRow = tableHangnhap.getSelectedRow();
        if (selectRow != -1) {
            String mahang = tableHangnhap.getValueAt(selectRow, 1).toString();
            String makho = tableHangnhap.getValueAt(selectRow, 2).toString();
            String sophieun = tableHangnhap.getValueAt(selectRow, 3).toString();
            String ngaynhap = tableHangnhap.getValueAt(selectRow, 4).toString();
            String mathukho = tableHangnhap.getValueAt(selectRow, 5).toString();
            String soluongxn = tableHangnhap.getValueAt(selectRow, 6).toString();
            String soluongtn = tableHangnhap.getValueAt(selectRow, 7).toString();
            String gia = tableHangnhap.getValueAt(selectRow, 8).toString();

            txtMahang.setText(mahang);
            txtMakho.setText(makho);
            txtSophieun.setText(sophieun);
            txtNgaynhap.setText(ngaynhap);
            txtMathukho.setText(mathukho);
            txtSoluongxn.setText(soluongxn);
            txtSoluongtn.setText(soluongtn);
            txtDongia.setText(gia);
        }
    }//GEN-LAST:event_tableHangnhapMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInphieunhap;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaophieunhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDongia;
    private javax.swing.JLabel lblHangnhap;
    private javax.swing.JLabel lblMakho;
    private javax.swing.JLabel lblMathukho;
    private javax.swing.JLabel lblNgaynhap;
    private javax.swing.JLabel lblSoluongtn;
    private javax.swing.JLabel lblSoluongxn;
    private javax.swing.JLabel lblSophieun;
    private javax.swing.JLabel lblmahang;
    private javax.swing.JTable tableHangnhap;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMahang;
    private javax.swing.JTextField txtMakho;
    private javax.swing.JTextField txtMathukho;
    private javax.swing.JTextField txtNgaynhap;
    private javax.swing.JTextField txtSoluongtn;
    private javax.swing.JTextField txtSoluongxn;
    private javax.swing.JTextField txtSophieun;
    // End of variables declaration//GEN-END:variables
}
