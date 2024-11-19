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
import javax.swing.table.DefaultTableModel;


public class PanelXuatkho extends javax.swing.JPanel {

    public PanelXuatkho() {
        initComponents();
        loadDataToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHangxuat = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnTaophieu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnInphieuxuat = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNgayxuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(txtSophieuxuat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtManv, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMahang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMathukho, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMahang, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
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
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hàng xuất ");

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
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaophieu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInphieuxuat)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
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
                "STT", "Mã NV", "Số phiếu xuất", "Ngày xuất", "Mã thủ kho", "Mã hàng", "Số lượng", "Giá"
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
                    hx.getSoluong(),
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
                
//                hangxuat.setMahang(mahang);
//                hangxuat.setSoluong(soluong);
//                hangxuat.setGia(gia);

                Hanghoa hanghoa = new Hanghoa();
                hanghoa.setMahh(mahang);
                hanghoa.setSoluong(soluong);
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
                    hangxuat.setSoluong(soluong);
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
     /*   try {
            // Lấy thông tin từ các trường dữ liệu trên giao diện
            Hangxuat hangxuat = new Hangxuat();
            hangxuat.setManv(txtManv.getText());
            hangxuat.setSophieuxuat(Integer.parseInt(txtSophieuxuat.getText()));
            hangxuat.setNgayxuat((java.sql.Date) new SimpleDateFormat("yyyy-MM-dd").parse(txtNgayxuat.getText()));
            hangxuat.setMathukho(txtMathukho.getText());

            // Thêm dữ liệu vào cơ sở dữ liệu
            boolean isInserted = hangxuatDAO.InsertHangxuat(hangxuat);
            if (isInserted) {
                // Nếu thành công, hiển thị thông báo
                javax.swing.JOptionPane.showMessageDialog(null, "Thêm phiếu xuất thành công!");

                // Làm mới bảng hiển thị dữ liệu
//                refreshHangxuatTable();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Thêm phiếu xuất không thành công!");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage());
        } */
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMahang;
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
