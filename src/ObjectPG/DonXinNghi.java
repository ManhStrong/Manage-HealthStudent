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
import java.time.LocalDate;
import java.util.TreeSet;

/**
 *
 * @author trqhu
 */
public class DonXinNghi implements Serializable {


    private String maDon;
    private String lyDo;
    private String anh;
    private String tTSK;
    private String ngayNop;
    private String ngayBatDauNghi;
    private String ngayKetThucNghi;
    private boolean ttDon;

    public DonXinNghi() {
    }

    public DonXinNghi(String maDon, String lyDo, String anh, String tTSK, String ngayNop, String ngayBatDauNghi, String ngayKetThucNghi, boolean ttDon) {
        this.maDon = maDon;
        this.lyDo = lyDo;
        this.anh = anh;
        this.tTSK = tTSK;
        this.ngayNop = ngayNop;
        this.ngayBatDauNghi = ngayBatDauNghi;
        this.ngayKetThucNghi = ngayKetThucNghi;
        this.ttDon = ttDon;
    }


    public String getMaDon() {
        return maDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }


    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String gettTSK() {
        return tTSK;
    }

    public void settTSK(String tTSK) {
        this.tTSK = tTSK;
    }

    public String getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(String ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getNgayBatDauNghi() {
        return ngayBatDauNghi;
    }

    public void setNgayBatDauNghi(String ngayBatDauNghi) {
        this.ngayBatDauNghi = ngayBatDauNghi;
    }

    public String getNgayKetThucNghi() {
        return ngayKetThucNghi;
    }

    public void setNgayKetThucNghi(String ngayKetThucNghi) {
        this.ngayKetThucNghi = ngayKetThucNghi;
    }

    public boolean isTtDon() {
        return ttDon;
    }

    public void setTtDon(boolean ttDon) {
        this.ttDon = ttDon;
    }


    
}
