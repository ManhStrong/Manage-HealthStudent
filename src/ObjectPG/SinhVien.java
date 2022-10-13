/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeSet;

/**
 *
 * @author trqhu
 */
public class SinhVien extends Nguoi implements Comparable<SinhVien>, Serializable {

    public static TreeSet<SinhVien> svs = new TreeSet<SinhVien>();
    static final String SINHVIEN = "./src/File/CSDL/SINHVIEN.txt";

    private String khoa;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String khoa, String lop, String ma, String hoTen, String diaChi, String sdt, String ngaySinh, String ttsk, String anh, String tenTaiKhoan) {
        super(ma, hoTen, diaChi, sdt, ngaySinh, ttsk, anh, tenTaiKhoan);
        this.khoa = khoa;
        this.lop = lop;
    }

    

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public static void writeData() {
        Path path = Paths.get(SINHVIEN);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(SINHVIEN);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(svs);
                oos.flush();

                System.out.println("GHI FILE THANH CONG !");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.out.println("FILE KHONG TON TAI !!!");
        }
    }

    public static void readData() {
        Path path = Paths.get(SINHVIEN);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(SINHVIEN);
                ObjectInputStream ois = new ObjectInputStream(fin);

                svs = (TreeSet<SinhVien>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getMa().compareTo(o.getMa());
    }

}
