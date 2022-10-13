/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DangNhapPG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author trqhu
 */
public class TaiKhoan implements Serializable, Comparable<TaiKhoan> {
    
    public static TreeSet<TaiKhoan> tks = new TreeSet<TaiKhoan>();
    static final String TAIKHOAN = "./src/File/CSDL/TAIKHOAN.txt";
    
    protected String username;
    protected String password;
    protected int role;

    public TaiKhoan() {
    }

    public TaiKhoan(String username) {
        this.username = username;
    }

    public TaiKhoan(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void writeData() {
        Path path = Paths.get(TAIKHOAN);
        if (Files.exists(path)) {
            try {
                FileOutputStream fout = new FileOutputStream(TAIKHOAN);
                ObjectOutputStream oos = new ObjectOutputStream(fout);

                oos.writeObject(tks);
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
        Path path = Paths.get(TAIKHOAN);
        if (Files.exists(path)) {
            try {
                FileInputStream fin = new FileInputStream(TAIKHOAN);
                ObjectInputStream ois = new ObjectInputStream(fin);

                tks = (TreeSet<TaiKhoan>) ois.readObject();
                System.out.println("DOC FILE THANH CONG");
            } catch (Exception e) {
                System.err.println("ERROR: " + e.toString());
            }
        } else {
            System.err.println("FILE KHONG TON TAI !!!");
        }

    }

    @Override
    public int compareTo(TaiKhoan o) {
        return this.getUsername().compareTo(o.getUsername());
    }
}
