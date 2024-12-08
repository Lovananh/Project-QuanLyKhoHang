/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import Interface.PanelNhapkho;
import Interface.PanelPhieunhap;
import Interface.PanelNhanvien;
import Proccess.Hanghoa;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class frTrangChu extends javax.swing.JFrame {

    /**
     * Creates new form frTrangChu
     */
//   private JPanel panelNhanvien;
    public frTrangChu() {
        initComponents();
        final JMenuBar menuBar = new JMenuBar();
        setLocationRelativeTo(null);  //dieu chinh form ra giua man hinhf
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
                        Thread.sleep(5);
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
                        Thread.sleep(5);
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
        Container = new javax.swing.JPanel();
        panelTRANGCHU = new javax.swing.JPanel();
        lblTRANGCHU = new javax.swing.JLabel();
        PanelKhohang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblKhohang = new javax.swing.JLabel();
        PanelBaocaosolieu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBaocaosolieu = new javax.swing.JLabel();
        PanelNhapkho = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNhapkho = new javax.swing.JLabel();
        PanelXuatkho = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblXuatkho = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        btnLoc = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Trangchu = new javax.swing.JMenu();
        menuItemTrangchu = new javax.swing.JMenuItem();
        mnItemHanghoa = new javax.swing.JMenuItem();
        menuitemTonkho = new javax.swing.JMenuItem();
        menuItemBaocaosolieu = new javax.swing.JMenuItem();
        mnNhanvien = new javax.swing.JMenu();
        menuItemNhanvien = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        btnBaocaosolieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBaocaosolieuMouseClicked(evt);
            }
        });

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
        btnXuatkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatkhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNhapkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKhohang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXuatkho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBaocaosolieu, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                .addContainerGap())
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
                .addComponent(btnBaocaosolieu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        panelMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, 260));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 170));

        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Close-icon.png"))); // NOI18N
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });
        panelMenu.add(lblThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 50, 40));

        btnGiupdo.setBackground(new java.awt.Color(255, 102, 0));
        btnGiupdo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGiupdo.setText("Giúp đỡ");
        btnGiupdo.setBorder(null);
        btnGiupdo.setBorderPainted(false);
        panelMenu.add(btnGiupdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 180, 40));

        btnGioithieu.setBackground(new java.awt.Color(255, 102, 0));
        btnGioithieu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGioithieu.setText("Giới thiệu");
        btnGioithieu.setBorder(null);
        btnGioithieu.setBorderPainted(false);
        btnGioithieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGioithieuMouseClicked(evt);
            }
        });
        panelMenu.add(btnGioithieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 40));

        btnDangxuat.setBackground(new java.awt.Color(255, 102, 0));
        btnDangxuat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setBorder(null);
        btnDangxuat.setBorderPainted(false);
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });
        panelMenu.add(btnDangxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, 40));

        panelMain.add(panelMenu, java.awt.BorderLayout.CENTER);

        Container.setBackground(new java.awt.Color(204, 204, 204));
        Container.setLayout(new java.awt.CardLayout());
        panelMain.add(Container, java.awt.BorderLayout.CENTER);

        panelTRANGCHU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTRANGCHU.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTRANGCHU.setForeground(new java.awt.Color(0, 0, 102));
        lblTRANGCHU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTRANGCHU.setText("TRANG CHỦ");
        panelTRANGCHU.add(lblTRANGCHU, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 4, 655, -1));

        PanelKhohang.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/khohang.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kho hàng ");

        lblKhohang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblKhohang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKhohang.setText("0");

        javax.swing.GroupLayout PanelKhohangLayout = new javax.swing.GroupLayout(PanelKhohang);
        PanelKhohang.setLayout(PanelKhohangLayout);
        PanelKhohangLayout.setHorizontalGroup(
            PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelKhohangLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelKhohangLayout.setVerticalGroup(
            PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKhohangLayout.createSequentialGroup()
                .addGroup(PanelKhohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKhohangLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(PanelKhohangLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addComponent(lblKhohang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        panelTRANGCHU.add(PanelKhohang, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 85, -1, -1));

        PanelBaocaosolieu.setBackground(new java.awt.Color(51, 255, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Baocaosolieu.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Báo cáo số liệu");

        lblBaocaosolieu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBaocaosolieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaocaosolieu.setText("0");

        javax.swing.GroupLayout PanelBaocaosolieuLayout = new javax.swing.GroupLayout(PanelBaocaosolieu);
        PanelBaocaosolieu.setLayout(PanelBaocaosolieuLayout);
        PanelBaocaosolieuLayout.setHorizontalGroup(
            PanelBaocaosolieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaocaosolieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBaocaosolieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBaocaosolieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBaocaosolieuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelBaocaosolieuLayout.setVerticalGroup(
            PanelBaocaosolieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaocaosolieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBaocaosolieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addComponent(lblBaocaosolieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        panelTRANGCHU.add(PanelBaocaosolieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 85, -1, -1));

        PanelNhapkho.setBackground(new java.awt.Color(51, 255, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/nhapkho.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nhập kho ");

        lblNhapkho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNhapkho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhapkho.setText("0");

        javax.swing.GroupLayout PanelNhapkhoLayout = new javax.swing.GroupLayout(PanelNhapkho);
        PanelNhapkho.setLayout(PanelNhapkhoLayout);
        PanelNhapkhoLayout.setHorizontalGroup(
            PanelNhapkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNhapkhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNhapkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNhapkhoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNhapkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelNhapkhoLayout.setVerticalGroup(
            PanelNhapkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNhapkhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelNhapkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(lblNhapkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        panelTRANGCHU.add(PanelNhapkho, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 270, 181, -1));

        PanelXuatkho.setBackground(new java.awt.Color(51, 255, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xuatkho.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Xuất kho ");

        lblXuatkho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblXuatkho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXuatkho.setText("0");

        javax.swing.GroupLayout PanelXuatkhoLayout = new javax.swing.GroupLayout(PanelXuatkho);
        PanelXuatkho.setLayout(PanelXuatkhoLayout);
        PanelXuatkhoLayout.setHorizontalGroup(
            PanelXuatkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXuatkhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelXuatkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelXuatkhoLayout.createSequentialGroup()
                        .addComponent(lblXuatkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelXuatkhoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(14, 14, 14))))
        );
        PanelXuatkhoLayout.setVerticalGroup(
            PanelXuatkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXuatkhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelXuatkhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(lblXuatkho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        panelTRANGCHU.add(PanelXuatkho, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 270, 219, -1));

        lblMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu-icon.png"))); // NOI18N
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });
        panelTRANGCHU.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 36));

        btnLoc.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        btnLoc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLoc.setForeground(new java.awt.Color(0, 0, 0));
        btnLoc.setText("Lọc ");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });
        panelTRANGCHU.add(btnLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 45, -1, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Backgound3.jpg"))); // NOI18N
        panelTRANGCHU.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 710, 440));

        panelMain.add(panelTRANGCHU, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(java.awt.SystemColor.activeCaption);

        Trangchu.setText("Menu");

        menuItemTrangchu.setText("Trangchu");
        menuItemTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTrangchuActionPerformed(evt);
            }
        });
        Trangchu.add(menuItemTrangchu);

        mnItemHanghoa.setText("Hàng hóa");
        mnItemHanghoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemHanghoaActionPerformed(evt);
            }
        });
        Trangchu.add(mnItemHanghoa);

        menuitemTonkho.setText("Tồn kho");
        menuitemTonkho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemTonkhoActionPerformed(evt);
            }
        });
        Trangchu.add(menuitemTonkho);

        menuItemBaocaosolieu.setText("Báo cáo số liệu");
        menuItemBaocaosolieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBaocaosolieuActionPerformed(evt);
            }
        });
        Trangchu.add(menuItemBaocaosolieu);

        jMenuBar1.add(Trangchu);

        mnNhanvien.setText("Nhân viên");

        menuItemNhanvien.setText("Nhân viên");
        menuItemNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNhanvienActionPerformed(evt);
            }
        });
        mnNhanvien.add(menuItemNhanvien);

        jMenuBar1.add(mnNhanvien);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_lblThoatMouseClicked

    private void btnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangchuActionPerformed
        panelTRANGCHU.setVisible(true);
//       Account.setVisible(false);
        closeMenuBar();
    }//GEN-LAST:event_btnTrangchuActionPerformed

    private void btnKhohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhohangMouseClicked
        frHanghoa dskho = new frHanghoa();
        dskho.setVisible(true);
        closeMenuBar();
    }//GEN-LAST:event_btnKhohangMouseClicked

    //da thanh cong
    private void btnNhapkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapkhoActionPerformed

        JPanel nhapkho = new PanelNhapkho();
        panelMain.removeAll();
        panelMain.add(nhapkho);
        panelMain.validate();
        closeMenuBar();
    }//GEN-LAST:event_btnNhapkhoActionPerformed

    private void switchPanel(JPanel panel) {
        getContentPane().removeAll(); // Xóa tất cả các thành phần hiện tại
        getContentPane().add(panel);  // Thêm panel mới vào
        revalidate(); // Làm mới layout
        repaint();    // Vẽ lại JFrame
    }
    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        openMenuBar();
    }//GEN-LAST:event_lblMenuMouseClicked

    private void menuItemNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNhanvienActionPerformed
//        switchPanel(new PanelNhanvien());
        JPanel nhanvien = new PanelNhanvien();
        panelMain.removeAll();
        panelMain.add(nhanvien);
        panelMain.validate();
    }//GEN-LAST:event_menuItemNhanvienActionPerformed

    private void mnItemHanghoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemHanghoaActionPerformed
        frHanghoa dskho = new frHanghoa();
        dskho.setVisible(true);
    }//GEN-LAST:event_mnItemHanghoaActionPerformed

    private void menuItemTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTrangchuActionPerformed
        panelMain.removeAll();
        panelMain.add(panelTRANGCHU);
        panelMain.validate();
        panelMain.repaint();
    }//GEN-LAST:event_menuItemTrangchuActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        this.dispose();
        frDangnhap dn = new frDangnhap();
        dn.setVisible(true);
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void btnGioithieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGioithieuMouseClicked

    }//GEN-LAST:event_btnGioithieuMouseClicked

    private void menuitemTonkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemTonkhoActionPerformed
        frQuanlytonkho tonkho = new frQuanlytonkho();
        tonkho.setVisible(true);
    }//GEN-LAST:event_menuitemTonkhoActionPerformed

    private void btnBaocaosolieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaocaosolieuMouseClicked
        frBaocaosolieu baocao = new frBaocaosolieu();
        baocao.setVisible(true);
        closeMenuBar();
    }//GEN-LAST:event_btnBaocaosolieuMouseClicked

    private void menuItemBaocaosolieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBaocaosolieuActionPerformed
        frBaocaosolieu baocao = new frBaocaosolieu();
        baocao.setVisible(true);
    }//GEN-LAST:event_menuItemBaocaosolieuActionPerformed

    private void btnXuatkhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatkhoActionPerformed
        JPanel xuatkho = new PanelXuatkho();
        panelMain.removeAll();
        panelMain.add(xuatkho);
        panelMain.validate();
    }//GEN-LAST:event_btnXuatkhoActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        try {
            Hanghoa hanghoa = new Hanghoa(); // Đối tượng chứa truy vấn dữ liệu
            int[] soLuong = hanghoa.getSoLuongNhapXuat(); // Phương thức lấy tổng nhập, tổng xuất

            int tongNhap = soLuong[0];
            int tongXuat = soLuong[1];
            int tongKho = tongNhap - tongXuat;

            // Cập nhật thông tin vào các JLabel
            lblNhapkho.setText("Tổng nhập: " + tongNhap);
            lblXuatkho.setText("Tổng xuất: " + tongXuat);
            lblKhohang.setText("Tổng kho: " + tongKho);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tải dữ liệu: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnLocActionPerformed

//      kho = new PanelNhapkho();
//          panelTRANGCHU.removeAll();
//          panelTRANGCHU.add(kho);
//          panelTRANGCHU.validate();
//           closeMenuBar();
//              
//     switchPanel(panelTRANGCHU);
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
    private javax.swing.JPanel PanelBaocaosolieu;
    private javax.swing.JPanel PanelKhohang;
    private javax.swing.JPanel PanelNhapkho;
    private javax.swing.JPanel PanelXuatkho;
    private javax.swing.JMenu Trangchu;
    private javax.swing.JButton btnBaocaosolieu;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnGioithieu;
    private javax.swing.JButton btnGiupdo;
    private javax.swing.JButton btnKhohang;
    private javax.swing.JButton btnLoc;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBaocaosolieu;
    private javax.swing.JLabel lblKhohang;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNhapkho;
    private javax.swing.JLabel lblTRANGCHU;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblXuatkho;
    private javax.swing.JMenuItem menuItemBaocaosolieu;
    private javax.swing.JMenuItem menuItemNhanvien;
    private javax.swing.JMenuItem menuItemTrangchu;
    private javax.swing.JMenuItem menuitemTonkho;
    private javax.swing.JMenuItem mnItemHanghoa;
    private javax.swing.JMenu mnNhanvien;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelTRANGCHU;
    // End of variables declaration//GEN-END:variables
}
