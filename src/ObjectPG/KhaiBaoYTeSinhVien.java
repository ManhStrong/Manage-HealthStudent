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
public class KhaiBaoYTeSinhVien extends KhaiBaoYTe implements Serializable, Comparable<KhaiBaoYTeSinhVien> {

    public static TreeSet<KhaiBaoYTeSinhVien> kbyts = new TreeSet<KhaiBaoYTeSinhVien>();
    static final String KHAIBAOYTE = "./src/File/CSDL/KHAIBAOYTE.txt";

    private String maSV;

    public KhaiBaoYTeSinhVien() {
    }

    public KhaiBaoYTeSinhVien(String maKB, String maSV, String lyDo, String ngayNop, String thuocDien, String trangThai) {
        super(maKB, lyDo, ngayNop, thuocDien, trangThai);
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public static void writeData() {
        Path path = Paths.get(KHAIBAOYTE);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(KHAIBAOYTE);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(kbyts);
                oos.flush();

                System.out.println("GHI FILE THANH CONG !");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }
    }

    public static void readData() {
        Path path = Paths.get(KHAIBAOYTE);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(KHAIBAOYTE);
                ObjectInputStream ois = new ObjectInputStream(fin);

                kbyts = (TreeSet<KhaiBaoYTeSinhVien>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(KhaiBaoYTeSinhVien o) {
        if (this.getMaKB().compareTo(o.getMaKB()) == 0) {
            return this.getMaSV().compareTo(o.getMaSV());
        }
        return this.getMaSV().compareTo(o.getMaKB());
    }
}
