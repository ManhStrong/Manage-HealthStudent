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
public class TableDonXinNghiSV extends AbstractTableModel {

    private String Name[] = {"Mã đơn", "Mã sinh viên", "Lý do", "Ảnh", "TTSK", "Ngày nộp", "Ngày bắt đầu", "Ngày kết thúc", "Trạng thái"};
    private Class classess[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class};

    TreeSet<DonXinNghiSV> dxns = new TreeSet<DonXinNghiSV>();

    public TableDonXinNghiSV(TreeSet<DonXinNghiSV> dxns) {
        this.dxns = dxns;
    }

    @Override
    public int getRowCount() {
        return this.dxns.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ArrayList<DonXinNghiSV> newDxns = new ArrayList<DonXinNghiSV>(dxns);
        switch (columnIndex) {
            case 0:
                return newDxns.get(rowIndex).getMaDon();

            case 1:
                return newDxns.get(rowIndex).getMaSV();

            case 2:
                return newDxns.get(rowIndex).getLyDo();

            case 3:
                return newDxns.get(rowIndex).getAnh();

            case 4:
                return newDxns.get(rowIndex).gettTSK();

            case 5:
                return newDxns.get(rowIndex).getNgayNop();

            case 6:
                return newDxns.get(rowIndex).getNgayBatDauNghi();

            case 7:
                return newDxns.get(rowIndex).getNgayKetThucNghi();

            case 8:
                return newDxns.get(rowIndex).isTtDon();

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
