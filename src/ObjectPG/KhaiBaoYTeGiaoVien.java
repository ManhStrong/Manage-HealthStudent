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
 * @author HQuan
 */
public class KhaiBaoYTeGiaoVien extends KhaiBaoYTe implements Serializable, Comparable<KhaiBaoYTeGiaoVien> {

    public static TreeSet<KhaiBaoYTeGiaoVien> kbytgvs = new TreeSet<KhaiBaoYTeGiaoVien>();
    static final String KHAIBAOYTE = "./src/File/CSDL/KHAIBAOYTEGV.txt";

    private String maGV;

    public KhaiBaoYTeGiaoVien() {
    }

    public KhaiBaoYTeGiaoVien(String maKB, String maGV, String lyDo, String ngayNop, String thuocDien, String trangThai) {
        super(maKB, lyDo, ngayNop, thuocDien, trangThai);
        this.maGV = maGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public static void writeData() {
        Path path = Paths.get(KHAIBAOYTE);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(KHAIBAOYTE);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(kbytgvs);
                oos.flush();

                System.out.println("GHI FILE THANH CONG !--Cho nay ok");
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
                kbytgvs = (TreeSet<KhaiBaoYTeGiaoVien>) ois.readObject();
                System.out.println("DOC FILE THANH CONG --Cho nay okk");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(KhaiBaoYTeGiaoVien o) {
        return this.getMaKB().compareTo(o.getMaKB());
    }
}
