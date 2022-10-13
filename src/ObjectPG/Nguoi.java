/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPG;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author trqhu
 */
public class Nguoi implements Serializable{
    protected String ma;
    protected String hoTen;
    protected String diaChi;
    protected String sdt;
    protected String ngaySinh;
    protected String ttsk;
    protected String anh;

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    protected String tenTaiKhoan;

    public Nguoi() {
    }

    public Nguoi(String ma, String hoTen, String diaChi, String sdt, String ngaySinh, String ttsk, String anh, String tenTaiKhoan) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.ngaySinh = ngaySinh;
        this.ttsk = ttsk;
        this.anh = anh;
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getTtsk() {
        return ttsk;
    }

    public void setTtsk(String ttsk) {
        this.ttsk = ttsk;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.ma);
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
        final Nguoi other = (Nguoi) obj;
        if (!Objects.equals(this.ma, other.ma)) {
            return false;
        }
        return true;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    
    
}
