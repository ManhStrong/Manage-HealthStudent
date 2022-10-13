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
public class GiaoVien extends Nguoi implements Comparable<GiaoVien>, Serializable {

    public static TreeSet<GiaoVien> gvs = new TreeSet<GiaoVien>();
    static final String GIAOVIEN = "./src/File/CSDL/GIAOVIEN.txt";

    private String khoaGiangDay;

    public GiaoVien() {
    }

    public GiaoVien(String khoaGiangDay, String ma, String hoTen, String diaChi, String sdt, String ngaySinh, String ttsk, String anh, String tenTaiKhoan) {
        super(ma, hoTen, diaChi, sdt, ngaySinh, ttsk, anh, tenTaiKhoan);
        this.khoaGiangDay = khoaGiangDay;
    }

    public String getKhoaGiangDay() {
        return khoaGiangDay;
    }

    public void setKhoaGiangDay(String khoaGiangDay) {
        this.khoaGiangDay = khoaGiangDay;
    }

    public static void writeData() {
        Path path = Paths.get(GIAOVIEN);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(GIAOVIEN);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(gvs);
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
        Path path = Paths.get(GIAOVIEN);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(GIAOVIEN);
                ObjectInputStream ois = new ObjectInputStream(fin);

                gvs = (TreeSet<GiaoVien>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(GiaoVien o) {
        return this.getMa().compareTo(o.getMa());
    }

}
