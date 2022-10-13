/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapPG;

import GUI.QuanLyDonXinNghiCuaGV;
import GUI.SuaThongTinQT;
import GUI.TrungTamYTe;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import ObjectPG.GiaoVien;
import ObjectPG.SinhVien;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author trqhu
 */
public class TrangChuQuanTri extends javax.swing.JFrame {

    private String username;
    static final String LOGO = "./src/File/Image/logo.jpg";
    DefaultTableModel modelTK;
    DefaultTableModel modelGV;
    static String tenTKUpdate = "";
    static int countGV = GiaoVien.gvs.size();

    /**
     * Creates new form TrangChu
     */
    public void formatButton() {

        //QLDon
        Icon iconQLDon = new ImageIcon("./src/File/Image/Buttons/QLDon.png");
        btnQLDon.setIcon(iconQLDon);
        btnQLDon.setText("Quản lý đơn");
        btnQLDon.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnQLDon.setHorizontalTextPosition(SwingConstants.CENTER);

        //QLGV
        Icon iconQLSV = new ImageIcon("./src/File/Image/Buttons/danhsach.png");
        btnQLGV.setIcon(iconQLSV);
        btnQLGV.setText("Quản lý giáo viên");
        btnQLGV.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnQLGV.setHorizontalTextPosition(SwingConstants.CENTER);

        //Sua thong tin
        Icon iconSuaTT = new ImageIcon("./src/File/Image/Buttons/suatt.png");
        btnSuaTT.setIcon(iconSuaTT);
        btnSuaTT.setText("Quản lý thông tin cá nhân");
        btnSuaTT.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnSuaTT.setHorizontalTextPosition(SwingConstants.CENTER);

        //QL Tai Khoan
        Icon iconTK = new ImageIcon("./src/File/Image/Buttons/QLTK.png");
        btnQLTK.setIcon(iconTK);
        btnQLTK.setText("Quản lý tài khoản");
        btnQLTK.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnQLTK.setHorizontalTextPosition(SwingConstants.CENTER);

        //Trung tam y te
        Icon tTYT = new ImageIcon("./src/File/Image/Buttons/ttyt.png");
        btnTTYT.setIcon(tTYT);
        btnTTYT.setText("Trung tâm y tế");
        btnTTYT.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnTTYT.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public GiaoVien getQuanTriLogin() {
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
        GiaoVien userLogin = getQuanTriLogin();
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

    public TrangChuQuanTri() {
        initComponents();
        setLocationRelativeTo(null);
        formatHeader();
        formatInfor();
        formatButton();

    }

    public TrangChuQuanTri(String username) {
        this.username = username;
        initComponents();
        setLocationRelativeTo(null);
        formatHeader();
        formatInfor();
        formatButton();
        modelTK = (DefaultTableModel) jTableTaiKhoan.getModel();
        modelGV = (DefaultTableModel) jTableGV.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameQuanLyTK = new javax.swing.JFrame();
        jTextFieldTenTaiKhoan = new javax.swing.JTextField();
        jPasswordFieldMK = new javax.swing.JPasswordField();
        jPasswordFieldLapLaiMK = new javax.swing.JPasswordField();
        jComboBoxQuyen = new javax.swing.JComboBox<>();
        jButtonThemTaiKhoan = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonLamMoi = new javax.swing.JButton();
        jButtonQuayLaiAdmin = new javax.swing.JButton();
        jScrollPaneTaiKhoan = new javax.swing.JScrollPane();
        jTableTaiKhoan = new javax.swing.JTable();
        jLabelQuanLyTaiKhoan = new javax.swing.JLabel();
        jButtonXemTaiKhoanSinhVien = new javax.swing.JButton();
        jButtonXemTaiKhoanGiaoVien = new javax.swing.JButton();
        jButtonTimKiem = new javax.swing.JButton();
        jTextFieldTimKiemTK = new javax.swing.JTextField();
        jLabelTenTaiKhoan = new javax.swing.JLabel();
        jLabelMatKhau = new javax.swing.JLabel();
        jLabelLapLaiMatKhau = new javax.swing.JLabel();
        jQuyen = new javax.swing.JLabel();
        jFrameQuanLyGiaoVien = new javax.swing.JFrame();
        jScrollPaneGiaoVien = new javax.swing.JScrollPane();
        jTableGV = new javax.swing.JTable();
        jButtonQuayLaiAdmin1 = new javax.swing.JButton();
        jButtonThemGV = new javax.swing.JButton();
        jLabelNgaySinhGV1 = new javax.swing.JLabel();
        jComboBoxKhoaGV = new javax.swing.JComboBox<>();
        jLabelTinhTrangSucKhoeGV1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxTenTK = new javax.swing.JComboBox<>();
        jLabelKhoaGiangDayGV1 = new javax.swing.JLabel();
        jTextFieldHoTenGV = new javax.swing.JTextField();
        jTextFieldDiaChiGV = new javax.swing.JTextField();
        jTextFieldSoDienThoaiGV = new javax.swing.JTextField();
        jTextFieldNgaySinhGV = new javax.swing.JTextField();
        jLabelHoTenGV1 = new javax.swing.JLabel();
        jComboBoxSucKhoeGV = new javax.swing.JComboBox<>();
        jLabelDiaChiGV1 = new javax.swing.JLabel();
        jLabelSoDienThoaiGV1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonSuaGV = new javax.swing.JButton();
        jButtonXoaGV = new javax.swing.JButton();
        jButtonLamMoiGV = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelMaGV = new javax.swing.JLabel();
        jTextFieldTimKiemGV = new javax.swing.JTextField();
        jButtonTimKiemGV = new javax.swing.JButton();
        jComboBoxLocGV = new javax.swing.JComboBox<>();
        jButtonLocGV = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        btnQLDon = new javax.swing.JButton();
        btnQLGV = new javax.swing.JButton();
        btnQLTK = new javax.swing.JButton();
        btnSuaTT = new javax.swing.JButton();
        btnTTYT = new javax.swing.JButton();

        jFrameQuanLyTK.setTitle("Quản lý tài khoản");
        jFrameQuanLyTK.setSize(new java.awt.Dimension(800, 600));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrameQuanLyTK.setLocation(dim.width/2-jFrameQuanLyTK.getSize().width/2, dim.height/2-jFrameQuanLyTK.getSize().height/2);

        jTextFieldTenTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTenTaiKhoanActionPerformed(evt);
            }
        });

        jPasswordFieldMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldMKActionPerformed(evt);
            }
        });

        jComboBoxQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinh viên", "Giáo viên" }));
        jComboBoxQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQuyenActionPerformed(evt);
            }
        });

        jButtonThemTaiKhoan.setText("Thêm");
        jButtonThemTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemTaiKhoanActionPerformed(evt);
            }
        });

        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setText("Xoá");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonLamMoi.setText("Làm mới");
        jButtonLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLamMoiActionPerformed(evt);
            }
        });

        jButtonQuayLaiAdmin.setText("Quay lại");
        jButtonQuayLaiAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiAdminActionPerformed(evt);
            }
        });

        jTableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã tài khoản", "Mật khẩu", "Quyền"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    jTableTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jTableTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableTaiKhoanMouseClicked(evt);
        }
    });
    jScrollPaneTaiKhoan.setViewportView(jTableTaiKhoan);

    jLabelQuanLyTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
    jLabelQuanLyTaiKhoan.setText("Quản lý tài khoản");

    jButtonXemTaiKhoanSinhVien.setText("Xem tài khoản sinh viên");
    jButtonXemTaiKhoanSinhVien.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonXemTaiKhoanSinhVienActionPerformed(evt);
        }
    });

    jButtonXemTaiKhoanGiaoVien.setText("Xem tài khoản giáo viên");
    jButtonXemTaiKhoanGiaoVien.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonXemTaiKhoanGiaoVienActionPerformed(evt);
        }
    });

    jButtonTimKiem.setText("Tìm kiếm");
    jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonTimKiemActionPerformed(evt);
        }
    });

    jLabelTenTaiKhoan.setText("Tên tài khoản:");

    jLabelMatKhau.setText("Mật khẩu:");

    jLabelLapLaiMatKhau.setText("Lặp lại mật khẩu:");

    jQuyen.setText("Quyền: ");

    javax.swing.GroupLayout jFrameQuanLyTKLayout = new javax.swing.GroupLayout(jFrameQuanLyTK.getContentPane());
    jFrameQuanLyTK.getContentPane().setLayout(jFrameQuanLyTKLayout);
    jFrameQuanLyTKLayout.setHorizontalGroup(
        jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
            .addGap(280, 280, 280)
            .addComponent(jLabelQuanLyTaiKhoan)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameQuanLyTKLayout.createSequentialGroup()
            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQuayLaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrameQuanLyTKLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                            .addComponent(jButtonThemTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addComponent(jButtonLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrameQuanLyTKLayout.createSequentialGroup()
                                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                                            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelLapLaiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(31, 31, 31)
                                            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jPasswordFieldLapLaiMK)
                                                .addComponent(jTextFieldTenTaiKhoan)
                                                .addComponent(jPasswordFieldMK)
                                                .addComponent(jComboBoxQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                                    .addComponent(jButtonXemTaiKhoanGiaoVien)
                                    .addGap(33, 33, 33)
                                    .addComponent(jButtonXemTaiKhoanSinhVien))
                                .addComponent(jScrollPaneTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGap(58, 58, 58))
    );
    jFrameQuanLyTKLayout.setVerticalGroup(
        jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameQuanLyTKLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabelQuanLyTaiKhoan)
            .addGap(18, 18, 18)
            .addComponent(jButtonQuayLaiAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonXemTaiKhoanSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonXemTaiKhoanGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)
            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameQuanLyTKLayout.createSequentialGroup()
                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTenTaiKhoan)
                        .addComponent(jTextFieldTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordFieldMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMatKhau))
                    .addGap(27, 27, 27)
                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordFieldLapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelLapLaiMatKhau))
                    .addGap(30, 30, 30)
                    .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBoxQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jQuyen)))
                .addComponent(jScrollPaneTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(57, 57, 57)
            .addGroup(jFrameQuanLyTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonThemTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(58, Short.MAX_VALUE))
    );

    jTableGV.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "STT", "Mã giáo viên", "Họ tên", "Địa chỉ ", "Số điện thoại", "Ngày sinh", "Sức khoẻ", "Khoa", "Tên tài khoản"
        }
    )
    {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    );
    jTableGV.getColumnModel().getColumn(0).setPreferredWidth(25);
    jTableGV.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableGVMouseClicked(evt);
        }
    });
    jScrollPaneGiaoVien.setViewportView(jTableGV);

    jButtonQuayLaiAdmin1.setText("Quay lại");
    jButtonQuayLaiAdmin1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonQuayLaiAdmin1ActionPerformed(evt);
        }
    });

    jButtonThemGV.setText("Thêm");
    jButtonThemGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonThemGVActionPerformed(evt);
        }
    });

    jLabelNgaySinhGV1.setText("Ngày sinh: ");

    jComboBoxKhoaGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "Quản lý kinh doanh", "Du lịch", "May", "Điện", "Điện tử", "Cơ khí", "Nhiệt", "Hoá", "Ngôn ngữ Trung", "Ngôn ngữ Hàn", "Ngôn ngữ Anh", " " }));
    jComboBoxKhoaGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxKhoaGVActionPerformed(evt);
        }
    });

    jLabelTinhTrangSucKhoeGV1.setText("Tình trạng sức khoẻ: ");

    jLabel17.setText("Tên tài khoản: ");

    ArrayList<String> boxTK = new ArrayList<String>();
    for (TaiKhoan tk : TaiKhoan.tks) {
        boolean check = true;
        for (GiaoVien gv : GiaoVien.gvs) {
            if(tk.getUsername().equals(gv.getTenTaiKhoan())) {
                check = false;
            }
        }
        if(check && tk.getRole() == 1) {
            boxTK.add(tk.getUsername());
        }

    }
    for(String s : boxTK) {
        jComboBoxTenTK.addItem(s);
    }

    jLabelKhoaGiangDayGV1.setText("Khoa giảng dạy:");

    jTextFieldDiaChiGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextFieldDiaChiGVActionPerformed(evt);
        }
    });

    jTextFieldNgaySinhGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextFieldNgaySinhGVActionPerformed(evt);
        }
    });

    jLabelHoTenGV1.setText("Họ tên: ");

    jComboBoxSucKhoeGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình thường", "Bị bệnh" }));

    jLabelDiaChiGV1.setText("Địa chỉ: ");

    jLabelSoDienThoaiGV1.setText("Số điện thoại: ");

    jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
    jLabel12.setText("Quản lý giáo viên");

    jButtonSuaGV.setText("Sửa");
    jButtonSuaGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSuaGVActionPerformed(evt);
        }
    });

    jButtonXoaGV.setText("Xoá");
    jButtonXoaGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonXoaGVActionPerformed(evt);
        }
    });

    jButtonLamMoiGV.setText("Làm mới");
    jButtonLamMoiGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonLamMoiGVActionPerformed(evt);
        }
    });

    jLabel6.setText("Mã giáo viên:");

    jLabelMaGV.setText("GV**");

    jButtonTimKiemGV.setText("Tìm kiếm");
    jButtonTimKiemGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonTimKiemGVActionPerformed(evt);
        }
    });

    jComboBoxLocGV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Bình thường", "Bị bệnh" }));

    jButtonLocGV.setText("Lọc");
    jButtonLocGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonLocGVActionPerformed(evt);
        }
    });

    jFrameQuanLyGiaoVien.setSize(800, 600);
    Dimension dimQLGV = Toolkit.getDefaultToolkit().getScreenSize();
    jFrameQuanLyGiaoVien.setLocation(dimQLGV.width/2-jFrameQuanLyGiaoVien.getSize().width/2, dimQLGV.height/2-jFrameQuanLyGiaoVien.getSize().height/2);

    javax.swing.GroupLayout jFrameQuanLyGiaoVienLayout = new javax.swing.GroupLayout(jFrameQuanLyGiaoVien.getContentPane());
    jFrameQuanLyGiaoVien.getContentPane().setLayout(jFrameQuanLyGiaoVienLayout);
    jFrameQuanLyGiaoVienLayout.setHorizontalGroup(
        jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDiaChiGV1)
                            .addComponent(jLabelHoTenGV1)
                            .addComponent(jLabelNgaySinhGV1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSoDienThoaiGV1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabelTinhTrangSucKhoeGV1)
                        .addComponent(jLabelKhoaGiangDayGV1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxTenTK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDiaChiGV)
                        .addComponent(jTextFieldHoTenGV)
                        .addComponent(jTextFieldSoDienThoaiGV)
                        .addComponent(jTextFieldNgaySinhGV)
                        .addComponent(jComboBoxSucKhoeGV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxKhoaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabelMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(69, 69, 69)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                                .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonXoaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonThemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))
                            .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                                .addComponent(jTextFieldTimKiemGV)
                                .addGap(25, 25, 25)))
                        .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                            .addComponent(jComboBoxLocGV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)))
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonSuaGV, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jButtonLamMoiGV, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jButtonTimKiemGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLocGV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(135, 135, 135)
                            .addComponent(jButtonQuayLaiAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPaneGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 97, Short.MAX_VALUE))))
    );
    jFrameQuanLyGiaoVienLayout.setVerticalGroup(
        jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameQuanLyGiaoVienLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jButtonQuayLaiAdmin1))
            .addGap(11, 11, 11)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabelMaGV))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButtonTimKiemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHoTenGV1)
                    .addComponent(jTextFieldHoTenGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTimKiemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldDiaChiGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelDiaChiGV1))
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSoDienThoaiGV1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSoDienThoaiGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonThemGV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSuaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelNgaySinhGV1)
                        .addComponent(jTextFieldNgaySinhGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxSucKhoeGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTinhTrangSucKhoeGV1)))
                .addGroup(jFrameQuanLyGiaoVienLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonXoaGV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonLamMoiGV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(16, 16, 16)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelKhoaGiangDayGV1)
                .addComponent(jComboBoxKhoaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxLocGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonLocGV))
            .addGap(17, 17, 17)
            .addGroup(jFrameQuanLyGiaoVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBoxTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
            .addComponent(jScrollPaneGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(77, 77, 77))
    );

    jButton1.setText("jButton1");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Quản trị");

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    jPanel2.setBackground(new java.awt.Color(250, 250, 250));
    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
    jPanel2.setPreferredSize(new java.awt.Dimension(870, 221));

    jAvatar.setText("Avatar");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    jLabel2.setText("Mã quản trị:");

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
                    .addGap(12, 12, 12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(js6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGap(14, 14, 14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPhone)
                        .addComponent(jLabel5)))
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
            .addComponent(tNameUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(212, Short.MAX_VALUE))
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

    btnQLDon.setText("QLDon");
    btnQLDon.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQLDonActionPerformed(evt);
        }
    });

    btnQLGV.setText("QLGV");
    btnQLGV.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQLGVActionPerformed(evt);
        }
    });

    btnQLTK.setText("QLTK");
    btnQLTK.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQLTKActionPerformed(evt);
        }
    });

    btnSuaTT.setText("Sua TT");
    btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSuaTTActionPerformed(evt);
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
            .addGap(37, 37, 37)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(btnTTYT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQLDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(62, 62, 62)
            .addComponent(btnQLGV)
            .addGap(59, 59, 59)
            .addComponent(btnQLTK)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSuaTT)
            .addGap(47, 47, 47))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnQLDon)
                .addComponent(btnQLGV)
                .addComponent(btnQLTK)
                .addComponent(btnSuaTT))
            .addGap(35, 35, 35)
            .addComponent(btnTTYT)
            .addContainerGap(228, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        new TrungTamYTe().setVisible(true);
    }//GEN-LAST:event_btnTTYTActionPerformed

    private void btnQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        jFrameQuanLyTK.setVisible(true);
        jTextFieldTenTaiKhoan.requestFocus();
        showResultTK();
    }//GEN-LAST:event_btnQLTKActionPerformed

    private void jButtonQuayLaiAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiAdminActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        jFrameQuanLyTK.setVisible(false);


    }//GEN-LAST:event_jButtonQuayLaiAdminActionPerformed

    private void jButtonXemTaiKhoanGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXemTaiKhoanGiaoVienActionPerformed
        // TODO add your handling code here:
        resetTableTK();
        int i = 1;
        for (TaiKhoan tk : TaiKhoan.tks) {
            if (tk.getRole() == 2) {

            } else {
                String role = null;
                if (tk.getRole() == 0) {
                    role = "Sinh viên";
                } else if (tk.getRole() == 1) {
                    role = "Giáo viên";
                }
                if (tk.getRole() == 1) {
                    modelTK.addRow(new Object[]{
                        i++, tk.getUsername(), "*************", role
                    });
                }

            }

        }
    }//GEN-LAST:event_jButtonXemTaiKhoanGiaoVienActionPerformed


    private void jButtonThemTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemTaiKhoanActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        this.CheckFieldTK(sb);
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
        } else {
            boolean check = false;
            for (TaiKhoan tmp : TaiKhoan.tks) {
                if (tmp.getUsername().equals(jTextFieldTenTaiKhoan.getText().trim())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
            } else {
                String password = new String(jPasswordFieldMK.getPassword());
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                AddTK(jTextFieldTenTaiKhoan.getText(), password, jComboBoxQuyen.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_jButtonThemTaiKhoanActionPerformed

    private void btnQLGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLGVActionPerformed
        // TODO add your handling code here:
        jFrameQuanLyGiaoVien.setVisible(true);
        this.setVisible(false);
        showResultGV();
        jLabelMaGV.setText("GV0" + countGV);
        UpdateComboBoxTKGV();

    }//GEN-LAST:event_btnQLGVActionPerformed

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        // TODO add your handling code here:
        resetTableTK();
        int i = 1;
        for (TaiKhoan tk : TaiKhoan.tks) {
            if (tk.getRole() == 2) {

            } else {
                String role = null;
                if (tk.getRole() == 0) {
                    role = "Sinh viên";
                } else if (tk.getRole() == 1) {
                    role = "Giáo viên";
                }
                if (tk.getUsername().equals(jTextFieldTimKiemTK.getText())) {
                    modelTK.addRow(new Object[]{
                        i++, tk.getUsername(), "*************", role
                    });
                }

            }

        }

    }//GEN-LAST:event_jButtonTimKiemActionPerformed

    private void jTableTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaiKhoanMouseClicked
        // TODO add your handling code here:
        int index = jTableTaiKhoan.getSelectedRow();
        jTextFieldTenTaiKhoan.setBackground(Color.white);
        jPasswordFieldMK.setBackground(Color.white);
        jPasswordFieldLapLaiMK.setBackground(Color.white);

        TableModel model = jTableTaiKhoan.getModel();

        String maTK = model.getValueAt(index, 1).toString();
        String quyen = model.getValueAt(index, 3).toString();

        jTextFieldTenTaiKhoan.setText(maTK + "");
        if (quyen.equals("Giáo viên")) {
            jComboBoxQuyen.setSelectedIndex(1);
        } else {
            jComboBoxQuyen.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTableTaiKhoanMouseClicked

    private void jComboBoxQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxQuyenActionPerformed

    private void jTextFieldTenTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTenTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTenTaiKhoanActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        // TODO add your handling code here:
        boolean skip = false;
        StringBuilder sb = new StringBuilder();
        TaiKhoan tmp = new TaiKhoan();
        this.CheckFieldTK(sb);

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
        } else {
            String password = new String(jPasswordFieldMK.getPassword());

            for (TaiKhoan tk : TaiKhoan.tks) {
                if (tk.getUsername().trim().equals(jTextFieldTenTaiKhoan.getText())) {
                    tmp = tk;
                    skip = true;
                }
            }

            if (skip) {
                TaiKhoan.tks.remove(tmp);
                AddTK(jTextFieldTenTaiKhoan.getText(), password, jComboBoxQuyen.getSelectedIndex());
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Tài khoản chưa tồn tại!");

            }
        }

    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        boolean check = true;
        TaiKhoan tmp = new TaiKhoan();

        for (TaiKhoan tk : TaiKhoan.tks) {
            if (tk.getUsername().equals(jTextFieldTenTaiKhoan.getText())) {
                tmp = tk;
                check = false;
            }
        }

        if (check) {
            JOptionPane.showMessageDialog(this, "Tài khoản chưa tồn tài!");
        } else {
            TaiKhoan.tks.remove(tmp);
            JOptionPane.showMessageDialog(this, "Xoá thành công!");
            TaiKhoan.writeData();
            showResultTK();
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jPasswordFieldMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldMKActionPerformed

    private void jButtonLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLamMoiActionPerformed
        // TODO add your handling code here:
        jTextFieldTenTaiKhoan.setText("");
        jPasswordFieldMK.setText("");
        jPasswordFieldLapLaiMK.setText("");
        jTextFieldTenTaiKhoan.setBackground(Color.white);
        jPasswordFieldMK.setBackground(Color.white);
        jPasswordFieldLapLaiMK.setBackground(Color.white);
        jTextFieldTenTaiKhoan.requestFocus();

        showResultTK();
    }//GEN-LAST:event_jButtonLamMoiActionPerformed

    private void jComboBoxKhoaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKhoaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKhoaGVActionPerformed

    private void jTextFieldDiaChiGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaChiGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaChiGVActionPerformed

    private void jTextFieldNgaySinhGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNgaySinhGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNgaySinhGVActionPerformed

    private void jButtonQuayLaiAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiAdmin1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        jFrameQuanLyGiaoVien.setVisible(false);
    }//GEN-LAST:event_jButtonQuayLaiAdmin1ActionPerformed

    private void jButtonThemGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemGVActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        this.CheckFieldGV(sb);

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
        } else {
            Object tenTK = jComboBoxTenTK.getSelectedItem();
            Object sucKhoe = jComboBoxSucKhoeGV.getSelectedItem();
            Object khoa = jComboBoxKhoaGV.getSelectedItem();
            String GV = jLabelMaGV.getText() + "";
            String hoTen = jTextFieldHoTenGV.getText().trim();
            String diaChi = jTextFieldDiaChiGV.getText().trim();
            String ngaySinh = jTextFieldNgaySinhGV.getText().trim();
            String sdt = jTextFieldSoDienThoaiGV.getText().trim();
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            AddGV(khoa.toString(), GV, hoTen, diaChi, sdt, ngaySinh, sucKhoe.toString(), tenTK.toString());

            jLabelMaGV.setText("GV0" + (++countGV));
        }

    }//GEN-LAST:event_jButtonThemGVActionPerformed

    private void jTableGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGVMouseClicked
        // TODO add your handling code here:
        int index = jTableGV.getSelectedRow();
        jTextFieldHoTenGV.setBackground(Color.white);
        jTextFieldDiaChiGV.setBackground(Color.white);
        jTextFieldSoDienThoaiGV.setBackground(Color.white);
        jTextFieldNgaySinhGV.setBackground(Color.white);
        jComboBoxTenTK.setBackground(Color.white);

        TableModel model = jTableGV.getModel();

        String maGV = model.getValueAt(index, 1).toString();
        String hoTen = model.getValueAt(index, 2).toString();
        String diaChi = model.getValueAt(index, 3).toString();
        String soDienThoai = model.getValueAt(index, 4).toString();
        String ngaySinh = model.getValueAt(index, 5).toString();
        String sucKhoe = model.getValueAt(index, 6).toString();
        String khoa = model.getValueAt(index, 7).toString();
        tenTKUpdate = model.getValueAt(index, 8).toString();

        jLabelMaGV.setText(maGV);
        jTextFieldHoTenGV.setText(hoTen);
        jTextFieldDiaChiGV.setText(diaChi);
        jTextFieldNgaySinhGV.setText(ngaySinh);
        jTextFieldSoDienThoaiGV.setText(soDienThoai);
        jComboBoxSucKhoeGV.setSelectedItem(sucKhoe);
        jComboBoxKhoaGV.setSelectedItem(khoa);
    }//GEN-LAST:event_jTableGVMouseClicked

    private void jButtonSuaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaGVActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        CheckFieldGVSua(sb);

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString());
        } else {

            Object tenTK = jComboBoxTenTK.getSelectedItem();
            Object sucKhoe = jComboBoxSucKhoeGV.getSelectedItem();
            Object khoa = jComboBoxKhoaGV.getSelectedItem();
            String GV = jLabelMaGV.getText();
            String hoTen = jTextFieldHoTenGV.getText().trim();
            String diaChi = jTextFieldDiaChiGV.getText().trim();
            String ngaySinh = jTextFieldNgaySinhGV.getText().trim();
            String sdt = jTextFieldSoDienThoaiGV.getText().trim();

            GiaoVien tmp = new GiaoVien("", GV, "", "", "", "", "", "", "");
            GiaoVien.gvs.remove(tmp);
            if (tenTK == null) {
                AddGV(khoa.toString(), GV, hoTen, diaChi, sdt, ngaySinh, sucKhoe.toString(), tenTKUpdate);
            } else {
                AddGV(khoa.toString(), GV, hoTen, diaChi, sdt, ngaySinh, sucKhoe.toString(), tenTK.toString());
            }
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        }

    }//GEN-LAST:event_jButtonSuaGVActionPerformed

    private void jButtonXoaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaGVActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        for (GiaoVien gv : GiaoVien.gvs) {
            if (gv.getMa().equals(jLabelMaGV.getText())) {
                check = true;
            }
        }

        if (check == false) {
            JOptionPane.showMessageDialog(this, "Tài khoản chưa tồn tại!");
        } else {
            GiaoVien tmp = new GiaoVien("", jLabelMaGV.getText(), "", "", "", "", "", "", "");
            GiaoVien.gvs.remove(tmp);
            JOptionPane.showMessageDialog(this, "Xoá thành công!");
            GiaoVien.writeData();
            UpdateComboBoxTKGV();
            showResultGV();
            jLabelMaGV.setText("GV0" + countGV);
        }


    }//GEN-LAST:event_jButtonXoaGVActionPerformed

    private void jButtonXemTaiKhoanSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXemTaiKhoanSinhVienActionPerformed
        // TODO add your handling code here:
        resetTableTK();
        int i = 1;
        for (TaiKhoan tk : TaiKhoan.tks) {
            if (tk.getRole() == 2) {

            } else {
                String role = null;
                if (tk.getRole() == 0) {
                    role = "Sinh viên";
                } else if (tk.getRole() == 1) {
                    role = "Giáo viên";
                }
                if (tk.getRole() == 0) {
                    modelTK.addRow(new Object[]{
                        i++, tk.getUsername(), "*************", role
                    });
                }

            }

        }
    }//GEN-LAST:event_jButtonXemTaiKhoanSinhVienActionPerformed

    private void jButtonLamMoiGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLamMoiGVActionPerformed
        // TODO add your handling code here:
        jTextFieldHoTenGV.setText("");
        jTextFieldDiaChiGV.setText("");
        jTextFieldNgaySinhGV.setText("");
        jTextFieldSoDienThoaiGV.setText("");
        jComboBoxSucKhoeGV.setSelectedIndex(0);
        jComboBoxKhoaGV.setSelectedIndex(0);
        jLabelMaGV.setText("GV0" + countGV);
        jTextFieldHoTenGV.setBackground(Color.white);
        jTextFieldDiaChiGV.setBackground(Color.white);
        jTextFieldNgaySinhGV.setBackground(Color.white);
        jTextFieldSoDienThoaiGV.setBackground(Color.white);
        jTextFieldHoTenGV.requestFocus();
        showResultGV();
    }//GEN-LAST:event_jButtonLamMoiGVActionPerformed

    private void jButtonLocGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLocGVActionPerformed
        // TODO add your handling code here:
        Object loc = jComboBoxLocGV.getSelectedItem();
        if (loc.toString().equals("Tất cả")) {
            showResultGV();
        } else {
            resetTableGV();
            int i = 1;
            for (GiaoVien gv : ObjectPG.GiaoVien.gvs) {
                if (!gv.getMa().equals("QT01") && loc.toString().equals(gv.getTtsk())) {
                    modelGV.addRow(new Object[]{
                        i++, gv.getMa(), gv.getHoTen(), gv.getDiaChi(), gv.getSdt(), gv.getNgaySinh(), gv.getTtsk(), gv.getKhoaGiangDay(), gv.getTenTaiKhoan()
                    });
                }
            }
        }

    }//GEN-LAST:event_jButtonLocGVActionPerformed

    private void jButtonTimKiemGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemGVActionPerformed
        // TODO add your handling code here:
        resetTableGV();
        int i = 1;
        for (GiaoVien gv : ObjectPG.GiaoVien.gvs) {
            if (!gv.getMa().equals("QT01") && gv.getHoTen().equals(jTextFieldTimKiemGV.getText())) {
                modelGV.addRow(new Object[]{
                    i++, gv.getMa(), gv.getHoTen(), gv.getDiaChi(), gv.getSdt(), gv.getNgaySinh(), gv.getTtsk(), gv.getKhoaGiangDay(), gv.getTenTaiKhoan()
                });
            }
        }
    }//GEN-LAST:event_jButtonTimKiemGVActionPerformed

    private void btnQLDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDonActionPerformed
        // TODO add your handling code here:
        new QuanLyDonXinNghiCuaGV().setVisible(true);
    }//GEN-LAST:event_btnQLDonActionPerformed

    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
        // TODO add your handling code here:
        GiaoVien userLogin = getQuanTriLogin();
        new SuaThongTinQT(userLogin.getMa()).setVisible(true);
    }//GEN-LAST:event_btnSuaTTActionPerformed

//  Begin: Quản lý Tài Khoản
    public void AddTK(String tenTK, String pass, int role) {
        TaiKhoan tk = new TaiKhoan();
        tk.setUsername(tenTK);
        tk.setPassword(pass);
        tk.setRole(role);
        TaiKhoan.tks.add(tk);

        TaiKhoan.writeData();
        showResultTK();
        UpdateComboBoxTKGV();
    }

    public void resetTableTK() {
        for (int row = jTableTaiKhoan.getRowCount() - 1; row >= 0; row--) {
            modelTK.removeRow(row);
        }
    }

    public void showResultTK() {
        resetTableTK();
        int i = 1;
        for (TaiKhoan tk : TaiKhoan.tks) {
            if (tk.getRole() == 2) {

            } else {
                String role = null;
                if (tk.getRole() == 0) {
                    role = "Sinh viên";
                } else if (tk.getRole() == 1) {
                    role = "Giáo viên";
                }
                modelTK.addRow(new Object[]{
                    i++, tk.getUsername(), "*************", role
                });
            }

        }
    }

    public void CheckFieldTK(StringBuilder sb) {
        if (jTextFieldTenTaiKhoan.getText().trim().equals("")) {
            sb.append("Tên tài khoản không được để trống\n");
            jTextFieldTenTaiKhoan.setBackground(Color.red);
        } else {
            jTextFieldTenTaiKhoan.setBackground(Color.white);
        }

        String password = new String(jPasswordFieldMK.getPassword());
        if (password.trim().equals("")) {
            sb.append("Mật khẩu không được để trống\n");
            jPasswordFieldMK.setBackground(Color.red);
        } else {
            jPasswordFieldMK.setBackground(Color.white);
        }

        String confirmPassword = new String(jPasswordFieldLapLaiMK.getPassword());
        if (!password.equals(confirmPassword)) {
            sb.append("Xác nhận mật khẩu không thành công");
            jPasswordFieldLapLaiMK.setBackground(Color.red);
        } else {
            jPasswordFieldLapLaiMK.setBackground(Color.white);

        }
    }
//  End:  Quản lý Tài Khoản

//  Begin: Quản lý giáo viên
    public void CheckFieldGV(StringBuilder sb) {
        if (jTextFieldHoTenGV.getText().trim().equals("")) {
            sb.append("Họ tên không được để trống\n");
            jTextFieldHoTenGV.setBackground(Color.red);
        } else {
            jTextFieldHoTenGV.setBackground(Color.white);
        }

        if (jTextFieldDiaChiGV.getText().trim().equals("")) {
            sb.append("Địa chỉ không được để trống\n");
            jTextFieldDiaChiGV.setBackground(Color.red);
        } else {
            jTextFieldDiaChiGV.setBackground(Color.white);
        }

        if (jTextFieldSoDienThoaiGV.getText().trim().equals("")) {
            sb.append("Điện thoại không được để trống\n");
            jTextFieldSoDienThoaiGV.setBackground(Color.red);
        } else {
            jTextFieldSoDienThoaiGV.setBackground(Color.white);
        }

        if (jTextFieldNgaySinhGV.getText().trim().equals("")) {
            sb.append("Ngày sinh không được để trống\n");
            jTextFieldNgaySinhGV.setBackground(Color.red);
        } else {
            jTextFieldNgaySinhGV.setBackground(Color.white);
        }

        Object tenTK = jComboBoxTenTK.getSelectedItem();
        if (tenTK == null) {
            sb.append("Hết tài khoản\n");
            jComboBoxTenTK.setBackground(Color.red);
        } else {
            jComboBoxTenTK.setBackground(Color.white);
        }
    }

    public void CheckFieldGVSua(StringBuilder sb) {
        boolean check = false;
        for (GiaoVien gv : GiaoVien.gvs) {
            if (gv.getMa().equals(jLabelMaGV.getText())) {
                check = true;
            }
        }

        if (check == false) {
            sb.append("Mã tài khoản chưa tồn tại!!!\n");
        }
        if (jTextFieldHoTenGV.getText().trim().equals("")) {
            sb.append("Họ tên không được để trống\n");
            jTextFieldHoTenGV.setBackground(Color.red);
        } else {
            jTextFieldHoTenGV.setBackground(Color.white);
        }

        if (jTextFieldDiaChiGV.getText().trim().equals("")) {
            sb.append("Địa chỉ không được để trống\n");
            jTextFieldDiaChiGV.setBackground(Color.red);
        } else {
            jTextFieldDiaChiGV.setBackground(Color.white);
        }

        if (jTextFieldSoDienThoaiGV.getText().trim().equals("")) {
            sb.append("Điện thoại không được để trống\n");
            jTextFieldSoDienThoaiGV.setBackground(Color.red);
        } else {
            jTextFieldSoDienThoaiGV.setBackground(Color.white);
        }

        if (jTextFieldNgaySinhGV.getText().trim().equals("")) {
            sb.append("Ngày sinh không được để trống\n");
            jTextFieldNgaySinhGV.setBackground(Color.red);
        } else {
            jTextFieldNgaySinhGV.setBackground(Color.white);
        }

    }

    public void UpdateComboBoxTKGV() {
        ArrayList<String> boxTK = new ArrayList<String>();
        jComboBoxTenTK.setBackground(Color.white);
        jComboBoxTenTK.removeAllItems();

        for (TaiKhoan tk : TaiKhoan.tks) {
            boolean check = true;
            for (GiaoVien gv : GiaoVien.gvs) {
                if (tk.getUsername().equals(gv.getTenTaiKhoan())) {
                    check = false;
                }
            }
            if (check && tk.getRole() == 1) {
                boxTK.add(tk.getUsername());
            }

        }
        for (String s : boxTK) {
            jComboBoxTenTK.addItem(s);
        }
    }

    public void AddGV(String khoa, String maGV, String hoTen, String diaChi, String sdt, String ngaySinh, String sucKhoe, String tenTK) {
        GiaoVien tmp = new GiaoVien(khoa, maGV, hoTen, diaChi, sdt, ngaySinh, sucKhoe, "", tenTK);
        ObjectPG.GiaoVien.gvs.add(tmp);

        GiaoVien.writeData();
        UpdateComboBoxTKGV();
        showResultGV();
    }

    public void resetTableGV() {
        for (int row = jTableGV.getRowCount() - 1; row >= 0; row--) {
            modelGV.removeRow(row);
        }
    }

    public void showResultGV() {
        resetTableGV();
        int i = 1;
        for (GiaoVien gv : ObjectPG.GiaoVien.gvs) {
            if (!gv.getMa().equals("QT01")) {
                modelGV.addRow(new Object[]{
                    i++, gv.getMa(), gv.getHoTen(), gv.getDiaChi(), gv.getSdt(), gv.getNgaySinh(), gv.getTtsk(), gv.getKhoaGiangDay(), gv.getTenTaiKhoan()
                });
            }
        }

    }
//  End: Quản lý giáo viên

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLDon;
    private javax.swing.JButton btnQLGV;
    private javax.swing.JButton btnQLTK;
    private javax.swing.JButton btnSuaTT;
    private javax.swing.JButton btnTTYT;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAvatar;
    private javax.swing.JLabel jBirth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLamMoi;
    private javax.swing.JButton jButtonLamMoiGV;
    private javax.swing.JButton jButtonLocGV;
    private javax.swing.JButton jButtonQuayLaiAdmin;
    private javax.swing.JButton jButtonQuayLaiAdmin1;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonSuaGV;
    private javax.swing.JButton jButtonThemGV;
    private javax.swing.JButton jButtonThemTaiKhoan;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JButton jButtonTimKiemGV;
    private javax.swing.JButton jButtonXemTaiKhoanGiaoVien;
    private javax.swing.JButton jButtonXemTaiKhoanSinhVien;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JButton jButtonXoaGV;
    private javax.swing.JLabel jCode;
    private javax.swing.JComboBox<String> jComboBoxKhoaGV;
    private javax.swing.JComboBox<String> jComboBoxLocGV;
    private javax.swing.JComboBox<String> jComboBoxQuyen;
    private javax.swing.JComboBox<String> jComboBoxSucKhoeGV;
    private javax.swing.JComboBox<String> jComboBoxTenTK;
    private javax.swing.JFrame jFrameQuanLyGiaoVien;
    private javax.swing.JFrame jFrameQuanLyTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDiaChiGV1;
    private javax.swing.JLabel jLabelHoTenGV1;
    private javax.swing.JLabel jLabelKhoaGiangDayGV1;
    private javax.swing.JLabel jLabelLapLaiMatKhau;
    private javax.swing.JLabel jLabelMaGV;
    private javax.swing.JLabel jLabelMatKhau;
    private javax.swing.JLabel jLabelNgaySinhGV1;
    private javax.swing.JLabel jLabelQuanLyTaiKhoan;
    private javax.swing.JLabel jLabelSoDienThoaiGV1;
    private javax.swing.JLabel jLabelTenTaiKhoan;
    private javax.swing.JLabel jLabelTinhTrangSucKhoeGV1;
    private javax.swing.JLabel jMajor;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldLapLaiMK;
    private javax.swing.JPasswordField jPasswordFieldMK;
    private javax.swing.JLabel jPhone;
    private javax.swing.JLabel jQuyen;
    private javax.swing.JScrollPane jScrollPaneGiaoVien;
    private javax.swing.JScrollPane jScrollPaneTaiKhoan;
    private javax.swing.JLabel jStatus;
    private javax.swing.JTable jTableGV;
    private javax.swing.JTable jTableTaiKhoan;
    private javax.swing.JTextField jTextFieldDiaChiGV;
    private javax.swing.JTextField jTextFieldHoTenGV;
    private javax.swing.JTextField jTextFieldNgaySinhGV;
    private javax.swing.JTextField jTextFieldSoDienThoaiGV;
    private javax.swing.JTextField jTextFieldTenTaiKhoan;
    private javax.swing.JTextField jTextFieldTimKiemGV;
    private javax.swing.JTextField jTextFieldTimKiemTK;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js3;
    private javax.swing.JLabel js4;
    private javax.swing.JLabel js6;
    private javax.swing.JLabel tName;
    private javax.swing.JLabel tNameUniversity;
    // End of variables declaration//GEN-END:variables
}
