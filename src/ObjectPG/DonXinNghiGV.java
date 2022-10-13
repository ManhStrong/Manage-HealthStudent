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
public class DonXinNghiGV extends DonXinNghi implements Serializable, Comparable<DonXinNghiGV> {

    private String maGV;

    public static TreeSet<DonXinNghiGV> dxngvs = new TreeSet<DonXinNghiGV>();
    static final String DONXINNGHI = "./src/File/CSDL/DONXINNGHI.txt";

    public DonXinNghiGV() {
    }

    public DonXinNghiGV(String maDon, String maGV, String lyDo, String anh, String tTSK, String ngayNop, String ngayBatDauNghi, String ngayKetThucNghi, boolean ttDon) {
        super(maDon, lyDo, anh, tTSK, ngayNop, ngayBatDauNghi, ngayKetThucNghi, ttDon);
        this.maGV = maGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public static void writeData() {
        Path path = Paths.get(DONXINNGHI);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(DONXINNGHI);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(dxngvs);
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
        Path path = Paths.get(DONXINNGHI);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(DONXINNGHI);
                ObjectInputStream ois = new ObjectInputStream(fin);

                dxngvs = (TreeSet<DonXinNghiGV>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(DonXinNghiGV o) {
        return this.getMaDon().compareTo(o.getMaDon());
    }

}
