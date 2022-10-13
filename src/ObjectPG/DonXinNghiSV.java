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
public class DonXinNghiSV extends DonXinNghi implements Comparable<DonXinNghiSV>, Serializable {
    private String maSV;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public static TreeSet<DonXinNghiSV> dxnsvs = new TreeSet<DonXinNghiSV>();
    static final String DONXINNGHISV = "./src/File/CSDL/DONXINNGHISV.txt";

    public DonXinNghiSV() {
    }

    public DonXinNghiSV(String maDon, String maSV, String lyDo, String anh, String tTSK, String ngayNop, String ngayBatDauNghi, String ngayKetThucNghi, boolean ttDon) {
        super(maDon, lyDo, anh, tTSK, ngayNop, ngayBatDauNghi, ngayKetThucNghi, ttDon);
        this.maSV = maSV;
    }
    
    
    public static void writeData() {
        Path path = Paths.get(DONXINNGHISV);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(DONXINNGHISV);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(dxnsvs);
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
        Path path = Paths.get(DONXINNGHISV);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(DONXINNGHISV);
                ObjectInputStream ois = new ObjectInputStream(fin);

                dxnsvs = (TreeSet<DonXinNghiSV>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(DonXinNghiSV o) {
        if(this.getMaDon().compareTo(o.getMaDon()) == 0){
            return this.getMaSV().compareTo(o.getMaSV());
        }
        return this.getMaDon().compareTo(o.getMaDon());
    }
}
