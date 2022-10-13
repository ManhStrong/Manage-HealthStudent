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
 * @author HQuan
 */
public class TableKhaiBaoYTeGV extends AbstractTableModel{
    private final String Name[] = {"Mã khai báo", "Mã sinh viên", "Thuộc đối tượng", "Nêu rõ(Khác)", "Ngày nộp", "Triệu chứng"};
    private final Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class};
    
    TreeSet<KhaiBaoYTeGiaoVien> kbytgvs = new TreeSet<>();
    public TableKhaiBaoYTeGV(TreeSet<KhaiBaoYTeGiaoVien> kbytgvs) {
        this.kbytgvs = kbytgvs;
    }

    @Override
    public int getRowCount() {
        return this.kbytgvs.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<KhaiBaoYTeGiaoVien> newKbyts = new ArrayList<>(kbytgvs);
        switch (columnIndex) {
            case 0:
                return newKbyts.get(rowIndex).getMaKB();

            case 1:
                return newKbyts.get(rowIndex).getMaGV();

            case 2:
                return newKbyts.get(rowIndex).getThuocDien();

            case 3:
                return newKbyts.get(rowIndex).getLyDo();

            case 4:
                return newKbyts.get(rowIndex).getNgayNop();

            case 5:
                return newKbyts.get(rowIndex).getTrangThai();

            default:
                return null;
        }
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return classess[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return Name[column];
    }
    
}
