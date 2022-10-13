/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapPG;

import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import GUI.TrangChuSinhVien;
import GUI.TrangChuGiaoVien;
import ObjectPG.DonXinNghiGV;
import ObjectPG.DonXinNghiSV;
import ObjectPG.GiaoVien;
import ObjectPG.SinhVien;

/**
 *
 * @author trqhu
 */
public class DangNhap extends javax.swing.JFrame {

    static final String LOGO = "./src/File/Image/logo.jpg";

    /**
     * Creates new form NewJFrame
     */
    public void demoTaiKhoan() {
//        TaiKhoan.tks.add(new TaiKhoan("student", "123456", 0));
//        TaiKhoan.tks.add(new TaiKhoan("teacher", "654321", 1));
//        TaiKhoan.tks.add(new TaiKhoan("admin", "admin", 2));
//        TaiKhoan.tks.add(new TaiKhoan("hung", "hung", 0));
//        TaiKhoan.writeData();
        TaiKhoan.readData();
    }

    public void demoDonXN() {
//        DonXinNghiSV.dxnsvs.add(new DonXinNghiSV("Test1", "SV01", "a", "./src/File/Image/df-avt.png", "B", "A", "A", "A", false));
//        DonXinNghiGV.dxngvs.add(new DonXinNghiGV("Test1", "GV01", "a", "./src/File/Image/df-avt.png", "B", "A", "A", "A", false));
//        DonXinNghiSV.writeData();
//        DonXinNghiGV.writeData();
        DonXinNghiGV.readData();
        DonXinNghiSV.readData();
    }

    public void demoSVvaGV() {
//        SinhVien.svs.add(new SinhVien("CNTT", "KTPM2", "2019600001", "Nguyễn Văn A", 
//                "Hà Nội", "0987654321", "1/1/2001", "Bình thường", "./src/File/Image/df-avt.png", "student"));
//        SinhVien.svs.add(new SinhVien("CNTT", "KTPM2", "2019600002", "Nguyễn Văn E", 
//                "Hà Nội", "0987654321", "1/1/2001", "Bình thường", "./src/File/Image/df-avt.png", "hung"));
//        GiaoVien.gvs.add(new GiaoVien("CNTT", "GV01", "Nguyễn Văn B", 
//                "Hà Nội", "0987654321", "1/1/1979", "Bình thường","./src/File/Image/df-avt.png", "teacher"));
//        GiaoVien.gvs.add(new GiaoVien("CNTT", "QT01", "Nguyễn Văn C", 
//                "Hà Nội", "0987654321", "1/1/1979", "Bình thường","./src/File/Image/df-avt.png", "admin"));
//        
//        SinhVien.writeData();
//        GiaoVien.writeData();

        SinhVien.readData();
        GiaoVien.readData();
    }

    public void showLogo(String linkImage) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(LOGO));
            Image img1 = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void formatFormLogin() {
        panelRound1.setBorder(new MatteBorder(3, 0, 0, 0, Color.blue));
        btnSignIn.setBackground(Color.blue);
        btnSignIn.setForeground(Color.white);
    }

    public void showFormLogin() {
        showLogo(LOGO);
        formatFormLogin();
    }

    public DangNhap() {
        initComponents();
        showFormLogin();
        demoTaiKhoan();
        demoSVvaGV();
        demoDonXN();
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
        panelRound1 = new DangNhapPG.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tUser = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        jLabel1.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Trường Đại Học Công Nghiệp Hà Nội");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quản lý sức khỏe");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        tUser.setForeground(new java.awt.Color(204, 204, 204));
        tUser.setText("Tên tài khoản");
        tUser.setToolTipText("");
        tUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tUserFocusLost(evt);
            }
        });
        tUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUserActionPerformed(evt);
            }
        });

        tPassword.setText("Mật khẩu");
        tPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tPasswordFocusLost(evt);
            }
        });
        tPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPasswordActionPerformed(evt);
            }
        });

        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignIn.setText("Đăng nhập");
        btnSignIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(137, 137, 137))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)))))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(tUser, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(tUser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(368, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        //Lấy thông tin người dùng nhập vào
        String user = tUser.getText().toString();
        String pass = String.valueOf(tPassword.getPassword());
        boolean flag = false;
        
        //Đọc file và kiểm tra xem tài khoản thuộc quyền gì
        for (TaiKhoan value : TaiKhoan.tks) {
            if (value.getUsername().equals(user) && value.getPassword().equals(pass) && value.getRole() == 0) {
                this.setVisible(false);
                new TrangChuSinhVien(user).setVisible(true);
                flag = true;
                break;
            } else if (value.getUsername().equals(user) && value.getPassword().equals(pass) && value.getRole() == 1) {
                this.setVisible(false);
                new TrangChuGiaoVien(user).setVisible(true);
                flag = true;
                break;
            } else if (value.getUsername().equals(user) && value.getPassword().equals(pass) && value.getRole() == 2) {
                this.setVisible(false);
                new TrangChuQuanTri(user).setVisible(true);
                flag = true;
                break;
            }
        }

        if (!flag) {
            JOptionPane.showMessageDialog(this, "Sai tên tài khoản hoặc mật khẩu");
        }

    }//GEN-LAST:event_btnSignInActionPerformed

    private void tPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPasswordFocusLost
        // TODO add your handling code here:

        char[] tempPassword = tPassword.getPassword();
        String password = String.valueOf(tempPassword);

        if (password.equals("")) {
            tPassword.setText("Mật khẩu");
            tPassword.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tPasswordFocusLost

    private void tUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tUserFocusGained
        // TODO add your handling code here:
        if (tUser.getText().equals("Tên tài khoản")) {
            tUser.setText("");
            tUser.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_tUserFocusGained

    private void tUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tUserFocusLost
        // TODO add your handling code here:
        if (tUser.getText().equals("")) {
            tUser.setText("Tên tài khoản");
            tUser.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_tUserFocusLost

    private void tPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPasswordFocusGained
        // TODO add your handling code here:
        char[] tempPassword = tPassword.getPassword();
        String password = String.valueOf(tempPassword);

        if (password.equals("Mật khẩu")) {
            tPassword.setText("");
            tPassword.setForeground(new Color(0, 0, 0));
        }

    }//GEN-LAST:event_tPasswordFocusGained

    private void tUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tUserActionPerformed

    private void tPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private DangNhapPG.PanelRound panelRound1;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUser;
    // End of variables declaration//GEN-END:variables
}
