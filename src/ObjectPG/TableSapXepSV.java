/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPG;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hello
 */
public class TableSapXepSV extends AbstractTableModel{

    private String Name[] = {"Mã sinh viên","Tên SV", "Địa chỉ","Ngày sinh", "SDT","TTSK","Lớp","Khoa","Ảnh","Tài Khoản"};
    private Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    public TableSapXepSV(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    @Override
    public int getRowCount() {
        return this.ds.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex) {
           case 0:
               return ds.get(rowIndex).getMa();
           case 1:
               return ds.get(rowIndex).getHoTen();
           case 2:
               return ds.get(rowIndex).getDiaChi();
           case 3:
               return ds.get(rowIndex).getNgaySinh();
           case 4:
               return ds.get(rowIndex).getSdt();
           case 5:
               return ds.get(rowIndex).getTtsk();
           case 6:
               return ds.get(rowIndex).getLop();
           case 7:
               return ds.get(rowIndex).getKhoa();
           case 8:
               return ds.get(rowIndex).getAnh();
           case 9:
               return ds.get(rowIndex).getTenTaiKhoan();
           default:
               return null;
       }
    }
    public Class getColumnClass(int columnIndex) {
        return classess[columnIndex];
    }

    public String getColumnName(int column) {
        return Name[column];
    }
    
}
