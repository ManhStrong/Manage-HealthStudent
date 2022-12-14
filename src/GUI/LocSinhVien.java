/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ObjectPG.GiaoVien;
import ObjectPG.SinhVien;
import ObjectPG.SinhVien;
import ObjectPG.TablelocSinhVien;
import ObjectPG.TablelocSinhVien;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hello
 */
public class LocSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form LocSinhVien
     */
    ArrayList<SinhVien> a;

    public LocSinhVien() {
        initComponents();
        SinhVien.readData();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
//    public void fillTable()
//    {
//        tblsinhvien.setModel(new TablelocSinhVien(a));
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblsinhvien = new javax.swing.JTable();
        cbott = new javax.swing.JComboBox<>();
        bttnLoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblsinhvien);

        cbott.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình Thường", "Bị Bệnh", "Tất Cả" }));

        bttnLoc.setText("Lọc");
        bttnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(bttnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnLoc))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLocActionPerformed
        // TODO add your handling code here:
        if(cbott.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Chưa chọn dòng để sắp xếp");
        }
        else if (cbott.getSelectedIndex() == 0) {
            ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
            for (SinhVien sv : SinhVien.svs) {
                if (sv.getTtsk().equals("Bình thường")) {
                    ds.add(sv);
                }
            }
            tblsinhvien.setModel(new TablelocSinhVien(ds));
        } else if (cbott.getSelectedIndex() == 1) {
            ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
            for (SinhVien sv : SinhVien.svs) {
                if (sv.getTtsk().equals("Bị Bệnh")) {
                    ds.add(sv);
                }
            }
            tblsinhvien.setModel(new TablelocSinhVien(ds));
        }
        else if(cbott.getSelectedIndex()==2)
        {
         ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
            for (SinhVien sv : SinhVien.svs) {
                ds.add(sv);
            }
            tblsinhvien.setModel(new TablelocSinhVien(ds));   
        }
    }//GEN-LAST:event_bttnLocActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnLoc;
    private javax.swing.JComboBox<String> cbott;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsinhvien;
    // End of variables declaration//GEN-END:variables
}
