/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPG;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hello
 */
public class TableQLSinhVien extends AbstractTableModel{
    private String Name[] = {"Mã sinh viên", "Tên SV", "Địa chỉ", "Ngày Sinh", "SDT", "TT Sức khỏe", "lớp", "khoa","Ảnh","Tài Khoản"};
    private Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    TreeSet<SinhVien> dssv = new TreeSet<SinhVien>();
    public TableQLSinhVien(TreeSet<SinhVien> ds) {
        this.dssv = ds;
    }

    
    public void removeRow(int row) {
    dssv.remove(row);
}
     
    @Override
    public int getRowCount() {
        return this.dssv.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<SinhVien> newDssv = new ArrayList<SinhVien>(dssv);
        switch (columnIndex) {
            case 0:
                return newDssv.get(rowIndex).getMa();

            case 1:
                return newDssv.get(rowIndex).getHoTen();

            case 2:
                return newDssv.get(rowIndex).getDiaChi();

            case 3:
                return newDssv.get(rowIndex).getNgaySinh();

            case 4:
                return newDssv.get(rowIndex).getSdt();

            case 5:
                return newDssv.get(rowIndex).getTtsk();

            case 6:
                return newDssv.get(rowIndex).getLop();

            case 7:
                return newDssv.get(rowIndex).getKhoa();

            case 8:
                return newDssv.get(rowIndex).getAnh();
             case 9:
                return newDssv.get(rowIndex).getTenTaiKhoan();
            
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
