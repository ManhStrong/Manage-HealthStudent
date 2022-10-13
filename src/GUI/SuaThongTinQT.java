/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DangNhapPG.TrangChuQuanTri;
import ObjectPG.GiaoVien;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Admin
 */
public final class SuaThongTinQT extends javax.swing.JFrame {

    private String username;
    private String linkAbsolute;
    private String link;
    
    public SuaThongTinQT() {
        initComponents();
        //formatInfor();
    }
    public SuaThongTinQT(String username) {
        this.username = username;
        //formatInfor();
        initComponents();
    }
    public void formatInfor() {
        GiaoVien userlogin = getGiaoVienLogIn();
        showAnh(userlogin.getAnh());
        tfTenTaiKhoan.setText(userlogin.getTenTaiKhoan());
        tfMa.setText(userlogin.getMa());
        tfHoTen.setText(userlogin.getHoTen());
        tfDiaChi.setText(userlogin.getDiaChi());
        tfSoDienThoai.setText(userlogin.getSdt());
        tfNgaySinh.setText(userlogin.getNgaySinh());
    }
    public GiaoVien getGiaoVienLogIn(){
        for(GiaoVien val : GiaoVien.gvs){
            if(val.getMa().equals(username)){
                return val;
            }
        }
        return null;
    }
     public void addImageToFolder(String linkImage) {

        String newPath = "./src/File/Image/Avatar";
        File directory = new File(newPath);

        File sourceFile = null;
        File destinationFile = null;

        if (directory.exists()) {
            try {
                String extension = linkImage.substring(linkImage.lastIndexOf('.') + 1);
                sourceFile = new File(linkImage);
                String subLink = link.substring(0, link.lastIndexOf("."));
                destinationFile = new File(newPath + "/" + subLink + "." + extension);
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        } else {
            System.err.println("NOT FOUND FOLDER");
        }
    }
    
    public void showAnh(String linkImage) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(linkImage));
            Image img1 = img.getScaledInstance(jAnh.getWidth(), jAnh.getHeight(), Image.SCALE_SMOOTH);
            jAnh.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
     public void selectFileImage() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        
        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            linkAbsolute = selectedFile.getAbsolutePath();
            link = selectedFile.getName();
            try {
                BufferedImage img = null;
                img = ImageIO.read(new File(linkAbsolute));
                Image img1 = img.getScaledInstance(jAnh.getWidth(), jAnh.getHeight(), Image.SCALE_SMOOTH);
                jAnh.setIcon(new ImageIcon(img1));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }

            tfLink.setText(linkAbsolute + "");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAnh = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        tfHoTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfLink = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSoDienThoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        tfTenTaiKhoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAnh.setText("Ảnh");

        jLabel3.setText("Họ Tên:");

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã quản trị:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Số điện thoại:");

        jLabel7.setText("Ảnh:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SỬA THÔNG TIN QUẢN TRỊ");

        jLabel2.setText("Tên tài khoản:");

        btnChonAnh.setText("Chọn file ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        tfTenTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenTaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTenTaiKhoan)
                    .addComponent(tfHoTen)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(tfDiaChi)
                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfMa)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChonAnh)
                            .addComponent(tfLink)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(btnChonAnh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCapNhat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if(tfHoTen.getText() == "" || tfDiaChi.getText() == "" || tfNgaySinh.getText() == "" || tfSoDienThoai.getText() == "")
        JOptionPane.showMessageDialog(this, "Phải nhập thông tin đầy đủ", "Thông báo", WIDTH);
        else
        {
            GiaoVien user = getGiaoVienLogIn();
            user.setHoTen(tfHoTen.getText());
            user.setDiaChi(tfDiaChi.getText());
            user.setNgaySinh(tfNgaySinh.getText());
            user.setSdt(tfSoDienThoai.getText());
            addImageToFolder(linkAbsolute);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        // TODO add your handling code here:
        selectFileImage();
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void tfTenTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenTaiKhoanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JLabel jAnh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfMa;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSoDienThoai;
    private javax.swing.JTextField tfTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
