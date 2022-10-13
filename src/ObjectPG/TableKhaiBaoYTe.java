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
 * @author trqhu
 */
public class TableKhaiBaoYTe extends AbstractTableModel{
    private String Name[] = {"Mã khai báo", "Mã sinh viên", "Lý do", "Thuộc diện", "Ngày nộp", "Triệu chứng"};
    private Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class};
    
    TreeSet<KhaiBaoYTeSinhVien> kbyts = new TreeSet<KhaiBaoYTeSinhVien>();
    public TableKhaiBaoYTe(TreeSet<KhaiBaoYTeSinhVien> kbyts) {
        this.kbyts = kbyts;
    }

    @Override
    public int getRowCount() {
        return this.kbyts.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<KhaiBaoYTeSinhVien> newKbyts = new ArrayList<KhaiBaoYTeSinhVien>(kbyts);
        switch (columnIndex) {
            case 0:
                return newKbyts.get(rowIndex).getMaKB();

            case 1:
                return newKbyts.get(rowIndex).getMaSV();

            case 2:
                return newKbyts.get(rowIndex).getLyDo();

            case 3:
                return newKbyts.get(rowIndex).getThuocDien();

            case 4:
                return newKbyts.get(rowIndex).getNgayNop();

            case 5:
                return newKbyts.get(rowIndex).getTrangThai();

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
