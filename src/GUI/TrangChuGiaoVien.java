/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import ObjectPG.GiaoVien;
import ObjectPG.SinhVien;
import javax.swing.Icon;
import javax.swing.SwingConstants;

/**
 *
 * @author trqhu
 */
public class TrangChuGiaoVien extends javax.swing.JFrame {

    private String username;
    static final String LOGO = "./src/File/Image/logo.jpg";

    /**
     * Creates new form TrangChu
     */
    public void formatButtons() {
        //khai bao
        Icon iconKhaiBao = new ImageIcon("./src/File/Image/Buttons/khaibao.png");
        btnKhaiBao.setIcon(iconKhaiBao);
        btnKhaiBao.setText("Khai báo y tế");
        btnKhaiBao.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnKhaiBao.setHorizontalTextPosition(SwingConstants.CENTER);

        //sua thong tin
        Icon iconSuaTT = new ImageIcon("./src/File/Image/Buttons/suatt.png");
        btnSuaTT.setIcon(iconSuaTT);
        btnSuaTT.setText("Quản lý thông tin cá nhân");
        btnSuaTT.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnSuaTT.setHorizontalTextPosition(SwingConstants.CENTER);

        //Nop Don
        Icon iconNopDon = new ImageIcon("./src/File/Image/Buttons/nopdon.png");
        btnNopDon.setIcon(iconNopDon);
        btnNopDon.setText("Nộp đơn xin nghỉ");
        btnNopDon.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnNopDon.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //QLSV
        Icon iconQLSV = new ImageIcon("./src/File/Image/Buttons/danhsach.png");
        btnQLSV.setIcon(iconQLSV);
        btnQLSV.setText("Quản lý sinh viên");
        btnQLSV.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnQLSV.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //QLDon
        Icon iconQLDon = new ImageIcon("./src/File/Image/Buttons/QLDon.png");
        btnQLDon.setIcon(iconQLDon);
        btnQLDon.setText("Quản lý đơn");
        btnQLDon.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnQLDon.setHorizontalTextPosition(SwingConstants.CENTER);
        
        //Trung tam y te
        Icon tTYT = new ImageIcon("./src/File/Image/Buttons/ttyt.png");
        btnTTYT.setIcon(tTYT);
        btnTTYT.setText("Trung tâm y tế");
        btnTTYT.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnTTYT.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    public GiaoVien getGiaoVienLogin() {
        for (GiaoVien value : GiaoVien.gvs) {
            if (value.getTenTaiKhoan().equals(username)) {
                return value;
            }
        }
        return null;
    }

    public void showLogo(String linkImage) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(linkImage));
            Image img1 = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
            jLabel1.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void showAvatar(String linkImage) {
        try {
            BufferedImage img = null;
            img = ImageIO.read(new File(linkImage));
            Image img1 = img.getScaledInstance(jAvatar.getWidth(), jAvatar.getHeight(), Image.SCALE_SMOOTH);
            jAvatar.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void formatHeader() {
        showLogo(LOGO);
        tNameUniversity.setText("Trường Đại Học Công Nghiệp Hà Nội");
        tName.setText("Quản lý sức khỏe");
    }

    public void formatInfor() {
        GiaoVien userLogin = getGiaoVienLogin();
        showAvatar(userLogin.getAnh());
        jCode.setText(userLogin.getMa());
        jName.setText(userLogin.getHoTen());
        jAddress.setText(userLogin.getDiaChi());
        jPhone.setText(userLogin.getSdt());
        jBirth.setText(userLogin.getNgaySinh());
        jMajor.setText(userLogin.getKhoaGiangDay());
        jUser.setText(userLogin.getTenTaiKhoan());
        jStatus.setText(userLogin.getTtsk());
    }

    public TrangChuGiaoVien() {
        initComponents();
        setLocationRelativeTo(null);
        formatHeader();
        formatInfor();
        formatButtons();
    }

    public TrangChuGiaoVien(String username) {
        this.username = username;
        initComponents();
        setLocationRelativeTo(null);
        formatHeader();
        formatInfor();
        formatButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jAvatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jPhone = new javax.swing.JLabel();
        js1 = new javax.swing.JLabel();
        js3 = new javax.swing.JLabel();
        js6 = new javax.swing.JLabel();
        jBirth = new javax.swing.JLabel();
        jMajor = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        js4 = new javax.swing.JLabel();
        jStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tNameUniversity = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        btnKhaiBao = new javax.swing.JButton();
        btnSuaTT = new javax.swing.JButton();
        btnNopDon = new javax.swing.JButton();
        btnQLSV = new javax.swing.JButton();
        btnQLDon = new javax.swing.JButton();
        btnTTYT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel2.setPreferredSize(new java.awt.Dimension(870, 221));

        jAvatar.setText("Avatar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã giáo viên:");

        jCode.setText("Code");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Số điện thoại:");

        jAddress.setText("Address");

        jName.setText("Name");

        jPhone.setText("Phone number");

        js1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        js1.setText("Ngày sinh:");

        js3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        js3.setText("Chuyên ngành:");

        js6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        js6.setText("Tài khoản:");

        jBirth.setText("Birthday");

        jMajor.setText("Major");

        jUser.setText("user");

        js4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        js4.setText("Tình trạng:");

        jStatus.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(js3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(js1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(js4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(js6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCode)
                            .addComponent(js1)
                            .addComponent(jBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jName)
                            .addComponent(js3)
                            .addComponent(jMajor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jAddress)
                            .addComponent(js4)
                            .addComponent(jStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUser)
                    .addComponent(js6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Logo");

        tNameUniversity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNameUniversity.setText("Name University");

        tName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tName.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNameUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNameUniversity)
                    .addComponent(tName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        btnKhaiBao.setText("Khai bao");
        btnKhaiBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhaiBaoActionPerformed(evt);
            }
        });

        btnSuaTT.setText("Sua TT");
        btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTTActionPerformed(evt);
            }
        });

        btnNopDon.setText("Nộp đơn xin nghỉ");
        btnNopDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopDonActionPerformed(evt);
            }
        });

        btnQLSV.setText("QuanLySV");
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });

        btnQLDon.setText("Quản lý đơn");
        btnQLDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDonActionPerformed(evt);
            }
        });

        btnTTYT.setText("TTYT");
        btnTTYT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTYTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhaiBao)
                    .addComponent(btnQLDon))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSuaTT)
                        .addGap(74, 74, 74)
                        .addComponent(btnNopDon))
                    .addComponent(btnTTYT))
                .addGap(78, 78, 78)
                .addComponent(btnQLSV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhaiBao)
                    .addComponent(btnSuaTT)
                    .addComponent(btnNopDon)
                    .addComponent(btnQLSV))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLDon)
                    .addComponent(btnTTYT))
                .addGap(0, 229, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnTTYTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTYTActionPerformed
        new TrungTamYTe().setVisible(true);
    }//GEN-LAST:event_btnTTYTActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        // TODO add your handling code here:
        new QuanLySinhVien().setVisible(true);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnNopDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopDonActionPerformed
        GiaoVien userLogin = getGiaoVienLogin();
        new NopDonXinNghiGV(userLogin.getMa()).setVisible(true);
    }//GEN-LAST:event_btnNopDonActionPerformed

    private void btnKhaiBaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhaiBaoActionPerformed
        GiaoVien userLogin = getGiaoVienLogin();
        new KhaiBaoYTeGV(userLogin.getMa()).setVisible(true);
    }//GEN-LAST:event_btnKhaiBaoActionPerformed

    private void btnQLDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDonActionPerformed
        // TODO add your handling code here:
        new QuanLyDonXinNghiHocSinh().setVisible(true);
    }//GEN-LAST:event_btnQLDonActionPerformed

    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
        // TODO add your handling code here:
        GiaoVien userLogin = getGiaoVienLogin();
        new SuaThongTinGV(userLogin.getMa()).setVisible(true);
    }//GEN-LAST:event_btnSuaTTActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKhaiBao;
    private javax.swing.JButton btnNopDon;
    private javax.swing.JButton btnQLDon;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton btnSuaTT;
    private javax.swing.JButton btnTTYT;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAvatar;
    private javax.swing.JLabel jBirth;
    private javax.swing.JLabel jCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jMajor;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPhone;
    private javax.swing.JLabel jStatus;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js3;
    private javax.swing.JLabel js4;
    private javax.swing.JLabel js6;
    private javax.swing.JLabel tName;
    private javax.swing.JLabel tNameUniversity;
    // End of variables declaration//GEN-END:variables
}
