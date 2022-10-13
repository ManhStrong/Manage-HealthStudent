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
public class KhaiBaoYTe implements Serializable {

    private String maKB;
    private String lyDo;
    private String ngayNop;
    private String thuocDien;
    private String trangThai;

    public KhaiBaoYTe() {
    }

    public KhaiBaoYTe(String maKB, String lyDo, String ngayNop, String thuocDien, String trangThai) {
        this.maKB = maKB;
        this.lyDo = lyDo;
        this.ngayNop = ngayNop;
        this.thuocDien = thuocDien;
        this.trangThai = trangThai;
    }

    public String getMaKB() {
        return maKB;
    }

    public void setMaKB(String maKB) {
        this.maKB = maKB;
    }


    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(String ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getThuocDien() {
        return thuocDien;
    }

    public void setThuocDien(String thuocDien) {
        this.thuocDien = thuocDien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
