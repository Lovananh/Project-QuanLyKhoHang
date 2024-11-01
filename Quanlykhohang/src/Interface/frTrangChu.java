/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interface.PanelNhapkho;
import Interface.PanelPhieunhap;
import javax.swing.JPanel;


/**
 *
 * @author Lenovo
 */
public class frTrangChu extends javax.swing.JFrame {

    /**
     * Creates new form frTrangChu
     */
    private JPanel kho ;
    private JPanel phieu;
    public frTrangChu() {
        initComponents();
        
    }

    int width = 200;
    int height = 500;

    void openMenuBar() {
        // Tạo luồng chạy song song với luồng chính Main
        new Thread(new Runnable() {
            @Override
            public void run() { // dây là phương thức chạy <trong hàm này  các lệnh sẽ được tạo>
                for (int i = 0; i < width; i++) {
                    panelMenu.setSize(width, height);

                    try {
                        Thread.sleep(0,5);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frTrangChu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    //taoj phuongw thucws dong menu
    void closeMenuBar() {
        // Tạo luồng chạy song song với luồng chính Main
        new Thread(new Runnable() {
            @Override
            public void run() { // dây là phương thức chạy <trong hàm này  các lệnh sẽ được tạo>
                for (int i = width; i > 0; i--) {
                    panelMenu.setSize(i, height);
                    try {
                        Thread.sleep(0,1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(frTrangChu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    // phương thức quay trở lại 
    public void Close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnBaocaosolieu = new javax.swing.JButton();
        btnTrangchu = new javax.swing.JButton();
        btnKhohang = new javax.swing.JButton();
        btnNhapkho = new javax.swing.JButton();
        btnXuatkho = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblThoat = new javax.swing.JLabel();
        btnGiupdo = new javax.swing.JButton();
        btnGioithieu = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        Container = new javax.swing.JPanel();
        panelTRANGCHU = new javax.swing.JPanel();
        lblTRANGCHU = new javax.swing.JLabel();
        PanelKhohang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelKhohang1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelKhohang2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelKhohang3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý kho hàng");
        setBackground(new java.awt.Color(255, 255, 255));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setToolTipText("Quản lý kho hàng");
        panelMain.setPreferredSize(new java.awt.Dimension(615, 500));
        panelMain.setLayout(new java.awt.BorderLayout());

        panelMenu.setBackground(new java.awt.Color(204, 204, 204));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        btnBaocaosolieu.setBackground(new java.awt.Color(255, 102, 0));
        btnBaocaosolieu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBaocaosolieu.setText("Báo cáo số liệu");
        btnBaocaosolieu.setBorder(null);
        btnBaocaosolieu.setBorderPainted(false);

        btnTrangchu.setBackground(new java.awt.Color(255, 102, 0));
        btnTrangchu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTrangchu.setText("Trang chủ");
        btnTrangchu.setBorder(null);
        btnTrangchu.setBorderPainted(false);
        btnTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangchuActionPerformed(evt);
            }
        });

        btnKhohang.setBackground(new java.awt.Color(255, 102, 0));
        btnKhohang.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnKhohang.setText("Kho hàng");
        btnKhohang.setBorder(null);
        btnKhohang.setBorderPainted(false);
        btnKhohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhohangMouseClicked(evt);
            }
        });
        btnKhohang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhohangActionPerformed(evt);
            }
        });

        btnNhapkho.setBackground(new java.awt.Color(255, 102, 0));
        btnNhapkho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNhapkho.setText("Nhập kho");
        btnNhapkho.setBorder(null);
        btnNhapkho.setBorderPainted(false);
        btnNhapkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapkhoActionPerformed(evt);
            }
        });

        btnXuatkho.setBackground(new java.awt.Color(255, 102, 0));
        btnXuatkho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXuatkho.setText("Xuất Kho");
        btnXuatkho.setBorder(null);
        btnXuatkho.setBorderPainted(false);
        btnXuatkho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuatkhoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnNhapkho, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnXuatkho, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBaocaosolieu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnKhohang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnNhapkho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnXuatkho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnBaocaosolieu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, 260));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 170));

        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Close-icon.png"))); // NOI18N
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });
        panelMenu.add(lblThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 40));

        btnGiupdo.setBackground(new java.awt.Color(255, 102, 0));
        btnGiupdo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGiupdo.setText("Giúp đỡ");
        btnGiupdo.setBorder(null);
        btnGiupdo.setBorderPainted(false);
        panelMenu.add(btnGiupdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 40));

        btnGioithieu.setBackground(new java.awt.Color(255, 102, 0));
        btnGioithieu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGioithieu.setText("Giới thiệu");
        btnGioithieu.setBorder(null);
        btnGioithieu.setBorderPainted(false);
        panelMenu.add(btnGioithieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

        btnDangxuat.setBackground(new java.awt.Color(255, 102, 0));
        btnDangxuat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setBorder(null);
        btnDangxuat.setBorderPainted(false);
        panelMenu.add(btnDangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, 40));

        panelMain.add(panelMenu, java.awt.BorderLayout.CENTER);

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu-icon.png"))); // NOI18N
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        panelMain.add(lblMenu, java.awt.BorderLayout.PAGE_START);

        Container.setBackground(new java.awt.Color(204, 204, 204));
        Container.setLayout(new java.awt.CardLayout());

        lblTRANGCHU.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTRANGCHU.setForeground(new java.awt.Color(0, 0, 102));
        lblTRANGCHU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTRANGCHU.setText("TRANG CHỦ");

        PanelKhohang.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/khohang.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kho hàng ");

        javax.swing.GroupLayout PanelKhohangLayout = new javax.swing.GroupLayout(PanelKhohang);
        PanelKhohang.setLayout(PanelKhohangLayout);
        PanelKhohangLayout.setHorizontalGroup(
            PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKhohangLayout.setVerticalGroup(
            PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohangLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        PanelKhohang1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Baocaosolieu.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Báo cáo số liệu");

        javax.swing.GroupLayout PanelKhohang1Layout = new javax.swing.GroupLayout(PanelKhohang1);
        PanelKhohang1.setLayout(PanelKhohang1Layout);
        PanelKhohang1Layout.setHorizontalGroup(
            PanelKhohang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKhohang1Layout.setVerticalGroup(
            PanelKhohang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohang1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelKhohang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelKhohang2.setBackground(new java.awt.Color(51, 255, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/nhapkho.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nhập kho ");

        javax.swing.GroupLayout PanelKhohang2Layout = new javax.swing.GroupLayout(PanelKhohang2);
        PanelKhohang2.setLayout(PanelKhohang2Layout);
        PanelKhohang2Layout.setHorizontalGroup(
            PanelKhohang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKhohang2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(26, 26, 26))
        );
        PanelKhohang2Layout.setVerticalGroup(
            PanelKhohang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohang2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelKhohang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelKhohang2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelKhohang3.setBackground(new java.awt.Color(51, 255, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatkho.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Xuất kho ");

        javax.swing.GroupLayout PanelKhohang3Layout = new javax.swing.GroupLayout(PanelKhohang3);
        PanelKhohang3.setLayout(PanelKhohang3Layout);
        PanelKhohang3Layout.setHorizontalGroup(
            PanelKhohang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohang3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelKhohang3Layout.setVerticalGroup(
            PanelKhohang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohang3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanelKhohang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout panelTRANGCHULayout = new javax.swing.GroupLayout(panelTRANGCHU);
        panelTRANGCHU.setLayout(panelTRANGCHULayout);
        panelTRANGCHULayout.setHorizontalGroup(
            panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTRANGCHU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTRANGCHULayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel9)
                .addGap(64, 64, 64)
                .addGroup(panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKhohang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelKhohang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKhohang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        panelTRANGCHULayout.setVerticalGroup(
            panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTRANGCHULayout.createSequentialGroup()
                .addGroup(panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTRANGCHULayout.createSequentialGroup()
                        .addComponent(lblTRANGCHU)
                        .addGap(27, 27, 27)
                        .addGroup(panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelKhohang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelTRANGCHULayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9)))
                .addGap(46, 46, 46)
                .addGroup(panelTRANGCHULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelKhohang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKhohang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        Container.add(panelTRANGCHU, "card3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        Container.add(jPanel2, "card3");

        panelMain.add(Container, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("Dữ liệu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Kho hàng");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Nhập hàng");

        jMenuItem1.setText("jMenuItem1");
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Xuất hàng ");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangchuActionPerformed
        panelTRANGCHU.setVisible(true);
//       Account.setVisible(false);
        closeMenuBar();
    }//GEN-LAST:event_btnTrangchuActionPerformed

    private void btnKhohangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhohangActionPerformed

    }//GEN-LAST:event_btnKhohangActionPerformed

    private void btnKhohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhohangMouseClicked
        frSanphamKhohang dskho = new frSanphamKhohang();
        dskho.setVisible(true);
    }//GEN-LAST:event_btnKhohangMouseClicked

    
    //da thanh cong
    
    private void btnNhapkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapkhoActionPerformed
//         kho = new PanelNhapkho();
 phieu = new PanelPhieunhap();
          panelMain.removeAll();
          panelMain.add(kho);
          panelMain.validate();
           closeMenuBar();
    }//GEN-LAST:event_btnNhapkhoActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
       
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void btnXuatkhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatkhoMouseClicked
//         phieu = new PanelPhieunhap();
          panelMain.removeAll();
          panelMain.add(kho);
          panelMain.validate();
    }//GEN-LAST:event_btnXuatkhoMouseClicked

//      kho = new PanelNhapkho();
//          panelTRANGCHU.removeAll();
//          panelTRANGCHU.add(kho);
//          panelTRANGCHU.validate();
//           closeMenuBar();
//                         
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
            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frTrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel PanelKhohang;
    private javax.swing.JPanel PanelKhohang1;
    private javax.swing.JPanel PanelKhohang2;
    private javax.swing.JPanel PanelKhohang3;
    private javax.swing.JButton btnBaocaosolieu;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnGioithieu;
    private javax.swing.JButton btnGiupdo;
    private javax.swing.JButton btnKhohang;
    private javax.swing.JButton btnNhapkho;
    private javax.swing.JButton btnTrangchu;
    private javax.swing.JButton btnXuatkho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblTRANGCHU;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelTRANGCHU;
    // End of variables declaration//GEN-END:variables
}
