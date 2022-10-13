/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.TrangChuSinhVien.LOGO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import ObjectPG.TableDonXinNghiSV;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import ObjectPG.DonXinNghi;
import ObjectPG.DonXinNghiSV;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trqhu
 */
public class NopDonXinNghi extends javax.swing.JFrame {

    static ButtonGroup newBtnG = new ButtonGroup();
    private String maSV;
    //yyyy-mm-d
    private Pattern formatDate = Pattern.compile("^(?:(?:1[6-9]|[2-9]\\d)?\\d{2})(?:(?:(|-|)(?:0?[13578]|1[02])"
            + "\\1(?:31))|(?:(|-|)(?:0?[13-9]|1[0-2])"
            + "\\2(?:29|30)))$|^(?:(?:(?:1[6-9]|[2-9]"
            + "\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00)))(|-|)0?2"
            + "\\3(?:29)$|^(?:(?:1[6-9]|[2-9]"
            + "\\d)?\\d{2})(|-|)(?:(?:0?[1-9])|(?:1[0-2]))"
            + "\\4(?:0?[1-9]|1\\d|2[0-8])$");

    private String linkAbsolute;
    private String link;
    private String oldLink;

    int dongchon = -1;
    DonXinNghiSV dxn = new DonXinNghiSV();

    /**
     * Creates new form NopDonXinNghi
     */
    public void LoadTableDXN(TreeSet<DonXinNghiSV> a) {
        for (DonXinNghiSV val : DonXinNghiSV.dxnsvs) {
            if (val.getMaSV().compareTo(maSV) == 0) {
                a.add(val);
            }
        }
        tableDXN.setModel(new TableDonXinNghiSV(a));
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

    public void formatHeader() {
        showLogo(LOGO);
        tNameUniversity.setText("Trường Đại Học Công Nghiệp Hà Nội");
        tName.setText("Nộp đơn xin nghỉ");
    }

    public void formatInput(String maSV) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        newBtnG.add(rdBinhThuong);
        newBtnG.add(rdBiBenh);
        tfMaDon.setText(DonXinNghiSV.dxnsvs.size() + formatter.format(now) + "");
        tfMaSV.setText(maSV + "");
        LocalDate today = LocalDate.now();
        tfNgayNop.setText(today + "");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
    }

    public void selectFileImage() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            linkAbsolute = selectedFile.getAbsolutePath();
            link = selectedFile.getName();

            //Hien thi anh duoc chon
            try {
                BufferedImage img = null;
                img = ImageIO.read(new File(linkAbsolute));
                Image img1 = img.getScaledInstance(displayImage.getWidth(), displayImage.getHeight(), Image.SCALE_SMOOTH);
                displayImage.setIcon(new ImageIcon(img1));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }

            tfLink.setText(linkAbsolute + "");
        }
    }

    public NopDonXinNghi() {
        TreeSet<DonXinNghiSV> temp = new TreeSet<DonXinNghiSV>();
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        formatHeader();
        formatInput("");
        DonXinNghiSV.readData();
        LoadTableDXN(temp);
    }

    public NopDonXinNghi(String maSV) {
        this.maSV = maSV;
        TreeSet<DonXinNghiSV> temp = new TreeSet<DonXinNghiSV>();
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        formatHeader();
        formatInput(maSV);
        DonXinNghiSV.readData();
        LoadTableDXN(temp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tNameUniversity = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDXN = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnNewDon = new javax.swing.JButton();
        btnSuaDon = new javax.swing.JButton();
        btnXoaDon = new javax.swing.JButton();
        tMaDon = new javax.swing.JLabel();
        tMaSV = new javax.swing.JLabel();
        tMaSV1 = new javax.swing.JLabel();
        tMaSV2 = new javax.swing.JLabel();
        tMaSV3 = new javax.swing.JLabel();
        tMaSV4 = new javax.swing.JLabel();
        tMaSV5 = new javax.swing.JLabel();
        tMaSV6 = new javax.swing.JLabel();
        tfMaDon = new javax.swing.JTextField();
        tfMaSV = new javax.swing.JTextField();
        tfLyDo = new javax.swing.JTextField();
        tfNgayNop = new javax.swing.JTextField();
        displayImage = new javax.swing.JLabel();
        tfLink = new javax.swing.JTextField();
        btnSelectFile = new javax.swing.JButton();
        rdBinhThuong = new javax.swing.JRadioButton();
        rdBiBenh = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 850));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 800));

        jLabel1.setText("Logo");

        tNameUniversity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tNameUniversity.setText("Name University");

        tName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tName.setText("Name");

        tableDXN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDXNMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableDXN);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Danh sách đơn đã nộp");

        btnNewDon.setText("Nộp đơn mới");
        btnNewDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDonActionPerformed(evt);
            }
        });

        btnSuaDon.setText("Sửa đơn");
        btnSuaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDonActionPerformed(evt);
            }
        });

        btnXoaDon.setText("Xóa đơn");
        btnXoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDonActionPerformed(evt);
            }
        });

        tMaDon.setText("Mã đơn:");

        tMaSV.setText("Mã sinh viên:");

        tMaSV1.setText("Lý do:");

        tMaSV2.setText("Ảnh:");

        tMaSV3.setText("Tình trạng sức khỏe:");

        tMaSV4.setText("Ngày nộp:");

        tMaSV5.setText("Ngày bắt đầu nghỉ:");

        tMaSV6.setText("Ngày kết thúc nghỉ:");

        tfMaDon.setEnabled(false);

        tfMaSV.setEnabled(false);

        tfNgayNop.setEnabled(false);

        displayImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfLink.setEnabled(false);
        tfLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLinkActionPerformed(evt);
            }
        });

        btnSelectFile.setText("Chọn file ảnh");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        rdBinhThuong.setText("Bình thường");

        rdBiBenh.setText("Bị bệnh");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setText("Sắp xếp");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        jDateChooser2.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNameUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnNewDon)
                        .addGap(91, 91, 91)
                        .addComponent(btnSuaDon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                        .addComponent(btnXoaDon)
                        .addGap(266, 266, 266))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tMaSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaSV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaSV3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaSV4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaSV5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tMaSV6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdBinhThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(rdBiBenh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfMaDon)
                                .addComponent(tfMaSV)
                                .addComponent(tfLyDo)
                                .addComponent(tfNgayNop)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(displayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfLink)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btnSelectFile)
                                            .addGap(0, 168, Short.MAX_VALUE)))))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))
                            .addComponent(jScrollPane3))
                        .addGap(95, 95, 95))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNameUniversity)
                    .addComponent(tName))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMaDon)
                    .addComponent(tfMaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMaSV)
                    .addComponent(tfMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMaSV1)
                    .addComponent(tfLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMaSV3)
                    .addComponent(rdBinhThuong)
                    .addComponent(rdBiBenh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMaSV4)
                    .addComponent(tfNgayNop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tMaSV5)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tMaSV6))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(tfLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectFile))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tMaSV2)
                        .addComponent(displayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnClear)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewDon)
                    .addComponent(btnSuaDon)
                    .addComponent(btnXoaDon))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Boolean checkInput() throws ParseException {
        Date today = new SimpleDateFormat("yyyy-MM-dd").parse(tfNgayNop.getText());

        if (tfLyDo.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Lý do không được để trống");
            return false;
        } else if (rdBinhThuong.isSelected() == false && rdBiBenh.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
            return false;
        } else if (tfLink.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Ảnh không được để trống");
            return false;
        } else if (jDateChooser1.getDate() == null || jDateChooser1.getDate().before(today)) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu nghỉ không đúng");
            return false;
        } else if (jDateChooser2.getDate() == null || jDateChooser2.getDate().before(jDateChooser1.getDate())) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc nghỉ không đúng");
            return false;
        }
        return true;
    }

    public void addImageToFolder(String linkImage) {

        String newPath = "./src/File/Image/DonXinNghi";
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

    private void tableDXNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDXNMouseClicked
        // TODO add your handling code here:
        dongchon = tableDXN.getSelectedRow();
        if (dongchon != -1) {
            ArrayList<DonXinNghiSV> newDxns = new ArrayList<DonXinNghiSV>(DonXinNghiSV.dxnsvs);
            dxn = newDxns.get(dongchon);
            tfMaDon.setText(dxn.getMaDon() + "");
            tfMaSV.setText(dxn.getMaSV() + "");
            tfLyDo.setText(dxn.getLyDo());
            if (dxn.gettTSK().compareTo("Bình thường") == 0) {
                rdBinhThuong.setSelected(true);
            }
            if (dxn.gettTSK().compareTo("Bị bệnh") == 0) {
                rdBiBenh.setSelected(true);
            }

            tfNgayNop.setText(dxn.getNgayNop());
            Date ngayBDNghi, ngayKTNghi;
            try {
                ngayBDNghi = new SimpleDateFormat("yyyy-MM-dd").parse(dxn.getNgayBatDauNghi());
                ngayKTNghi = new SimpleDateFormat("yyyy-MM-dd").parse(dxn.getNgayKetThucNghi());
                jDateChooser1.setDate(ngayBDNghi);
                jDateChooser2.setDate(ngayKTNghi);
            } catch (ParseException ex) {
                System.out.println(ex.toString());
            }
            tfLink.setText(dxn.getAnh());

            String subLink = dxn.getAnh().substring(dxn.getAnh().lastIndexOf("\\") + 1);

            try {
                BufferedImage img = null;
                img = ImageIO.read(new File("./src/File/Image/DonXinNghi/" + subLink));
                Image img1 = img.getScaledInstance(displayImage.getWidth(), displayImage.getHeight(), Image.SCALE_SMOOTH);
                displayImage.setIcon(new ImageIcon(img1));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_tableDXNMouseClicked

    private void tfLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLinkActionPerformed

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        // TODO add your handling code here:
        selectFileImage();
    }//GEN-LAST:event_btnSelectFileActionPerformed

    public Boolean checkNewInsert() {
        LocalDate today = LocalDate.now();
        for (DonXinNghiSV val : DonXinNghiSV.dxnsvs) {
            if (val.getMaSV().compareTo(maSV) == 0 && val.getNgayNop().compareTo(today.toString()) == 0) {
                return false;
            }
        }
        return true;
    }
    private void btnNewDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDonActionPerformed
        // TODO add your handling code here:
        try {
            if (checkInput()) {
                TreeSet<DonXinNghiSV> temp = new TreeSet<DonXinNghiSV>();
                int sizeBeforeAdd = DonXinNghiSV.dxnsvs.size();
                String status = "";
                if (rdBiBenh.isSelected()) {
                    status = "Bị bệnh";
                }
                if (rdBinhThuong.isSelected()) {
                    status = "Bình thường";
                }
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String ngayBDNghi = dateFormat.format(jDateChooser1.getDate());
                String ngayKTNghi = dateFormat.format(jDateChooser2.getDate());
                dxn = new DonXinNghiSV(tfMaDon.getText(),
                        tfMaSV.getText(), tfLyDo.getText(),
                        tfLink.getText(),
                        status, tfNgayNop.getText(),
                        ngayBDNghi, ngayKTNghi, false);

                DonXinNghiSV.dxnsvs.add(dxn);
                if (sizeBeforeAdd == DonXinNghiSV.dxnsvs.size()) {
                    JOptionPane.showMessageDialog(this,
                            "Thêm mới không thành công! Vui lòng nhấn Clear trước khi nhập dữ liệu", "Thông báo", WIDTH);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Thêm thành công", "Xác nhận", WIDTH);
                    addImageToFolder(linkAbsolute);
                }
                LoadTableDXN(temp);
                DonXinNghiSV.writeData();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnNewDonActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        tfMaDon.setText(DonXinNghiSV.dxnsvs.size() + formatter.format(now) + "");
        tfMaSV.setText(maSV + "");
        tfLyDo.setText("");
        newBtnG.clearSelection();
        LocalDate today = LocalDate.now();
        tfNgayNop.setText(today + "");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        tfLink.setText("");

        try {
            BufferedImage img = null;
            img = ImageIO.read(new File("./src/File/Image/white.png"));
            Image img1 = img.getScaledInstance(displayImage.getWidth(), displayImage.getHeight(), Image.SCALE_SMOOTH);
            displayImage.setIcon(new ImageIcon(img1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSuaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDonActionPerformed
        // TODO add your handling code here:
        dongchon = tableDXN.getSelectedRow();
        if (dongchon != -1) {

            //
            TreeSet<DonXinNghiSV> temp = new TreeSet<DonXinNghiSV>();
            ArrayList<DonXinNghiSV> newDxns = new ArrayList<DonXinNghiSV>(DonXinNghiSV.dxnsvs);
            try {
                if (checkInput()) {
                    int select = JOptionPane.showConfirmDialog(this, "Xác nhận sửa bản ghi", "Xác nhận", WIDTH);
                    if (select == 0) {
                        String status = "";
                        if (rdBiBenh.isSelected()) {
                            status = "Bị bệnh";
                        }
                        if (rdBinhThuong.isSelected()) {
                            status = "Bình thường";
                        }
                        
                        dxn = new DonXinNghiSV(tfMaDon.getText(),
                                tfMaSV.getText(), tfLyDo.getText(),
                                tfLink.getText(),
                                status, tfNgayNop.getText(),
                                jDateChooser1.getDate().toString(), jDateChooser2.getDate().toString(), false);

                        newDxns.set(dongchon, dxn);
                        addImageToFolder(linkAbsolute);
                        DonXinNghiSV.dxnsvs = new TreeSet<DonXinNghiSV>(newDxns);
                        LoadTableDXN(temp);
                        JOptionPane.showMessageDialog(this,
                                "Sửa thành công", "Xác nhận", WIDTH);
                        DonXinNghiSV.writeData();
                    }

                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng sửa", "Thông báo", WIDTH);
        }
    }//GEN-LAST:event_btnSuaDonActionPerformed

    private void btnXoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDonActionPerformed
        // TODO add your handling code here:
        dongchon = tableDXN.getSelectedRow();
        if (dongchon != -1) {
            TreeSet<DonXinNghiSV> temp = new TreeSet<DonXinNghiSV>();
            int select = JOptionPane.showConfirmDialog(this, "Xác nhận xóa bản ghi", "Xác nhận", WIDTH);
            if (select == 0) {
                ArrayList<DonXinNghiSV> newDxns = new ArrayList<DonXinNghiSV>(DonXinNghiSV.dxnsvs);
                DonXinNghiSV.dxnsvs.remove(newDxns.get(dongchon));
                LoadTableDXN(temp);
                JOptionPane.showMessageDialog(this,
                        "Xóa thành công", "Xác nhận", WIDTH);
                DonXinNghiSV.writeData();
            }

        } else
            JOptionPane.showMessageDialog(this,
                    "Chưa chọn dòng xóa", "Thông báo", WIDTH);
    }//GEN-LAST:event_btnXoaDonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DonXinNghiSort(maSV).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnNewDon;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnSuaDon;
    private javax.swing.JButton btnXoaDon;
    private javax.swing.JLabel displayImage;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdBiBenh;
    private javax.swing.JRadioButton rdBinhThuong;
    private javax.swing.JLabel tMaDon;
    private javax.swing.JLabel tMaSV;
    private javax.swing.JLabel tMaSV1;
    private javax.swing.JLabel tMaSV2;
    private javax.swing.JLabel tMaSV3;
    private javax.swing.JLabel tMaSV4;
    private javax.swing.JLabel tMaSV5;
    private javax.swing.JLabel tMaSV6;
    private javax.swing.JLabel tName;
    private javax.swing.JLabel tNameUniversity;
    private javax.swing.JTable tableDXN;
    private javax.swing.JTextField tfLink;
    private javax.swing.JTextField tfLyDo;
    private javax.swing.JTextField tfMaDon;
    private javax.swing.JTextField tfMaSV;
    private javax.swing.JTextField tfNgayNop;
    // End of variables declaration//GEN-END:variables
}
