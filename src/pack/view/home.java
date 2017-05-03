/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author Asus
 */
public class home extends javax.swing.JFrame {

    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        
        ctoko = new controllerToko (this);
        ctoko.isiTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Admin = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        CariKategori = new javax.swing.JComboBox();
        Cari = new javax.swing.JButton();
        Nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        Jenis = new javax.swing.JComboBox();
        Kategori = new javax.swing.JComboBox();
        Kode = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Keluar = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Bersihkan = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DATA BARANG DI TOKO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 240, 30);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Admin Toko : ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);

        Admin.setEditable(false);
        Admin.setBackground(new java.awt.Color(204, 204, 255));
        Admin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel2.add(Admin);
        Admin.setBounds(100, 10, 90, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 740, 60);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Hargal"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 660, 200);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan Kategori Makanan");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(50, 240, 270, 30);

        CariKategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CariKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Makanan", "Minuman", "BarangLain" }));
        CariKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariKategoriActionPerformed(evt);
            }
        });
        jPanel3.add(CariKategori);
        CariKategori.setBounds(320, 240, 180, 30);

        Cari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        jPanel3.add(Cari);
        Cari.setBounds(560, 230, 130, 30);

        Nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel3.add(Nama);
        Nama.setBounds(180, 70, 320, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Kode Barang");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 30, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nama Barang");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 70, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Kategori Barang");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(50, 110, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Packaging");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(50, 150, 130, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Harga");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(50, 190, 130, 30);

        Harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(Harga);
        Harga.setBounds(180, 190, 320, 30);

        Jenis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Jenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Jenis Packaging --", "Pack" }));
        Jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisActionPerformed(evt);
            }
        });
        jPanel3.add(Jenis);
        Jenis.setBounds(180, 150, 320, 30);

        Kategori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Kategori --", "Makanan", "Minuman", "BarangLain" }));
        Kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategoriActionPerformed(evt);
            }
        });
        jPanel3.add(Kategori);
        Kategori.setBounds(180, 110, 320, 30);

        Kode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KodeActionPerformed(evt);
            }
        });
        jPanel3.add(Kode);
        Kode.setBounds(180, 30, 320, 30);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(null);

        Keluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar);
        Keluar.setBounds(20, 170, 130, 30);

        Hapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus);
        Hapus.setBounds(20, 130, 130, 30);

        Bersihkan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bersihkan.setText("Bersihkan");
        Bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BersihkanActionPerformed(evt);
            }
        });
        jPanel1.add(Bersihkan);
        Bersihkan.setBounds(20, 90, 130, 30);

        Simpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Simpan);
        Simpan.setBounds(20, 10, 130, 30);

        Ubah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        jPanel1.add(Ubah);
        Ubah.setBounds(20, 50, 130, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(540, 10, 170, 270);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 740, 500);

        setSize(new java.awt.Dimension(751, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminActionPerformed

    private void JenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JenisActionPerformed

    private void CariKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariKategoriActionPerformed

    private void KodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KodeActionPerformed

    private void KategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KategoriActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_KeluarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed

        ctoko.SimpanData();
        ctoko.isiTable();
        
// TODO add your handling code here:
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        
        ctoko.Ubah();
        ctoko.isiTable();
        
// TODO add your handling code here:
    }//GEN-LAST:event_UbahActionPerformed

    private void BersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BersihkanActionPerformed
        
        ctoko.Reset();
// TODO add your handling code here:
    }//GEN-LAST:event_BersihkanActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        
        ctoko.Hapus();
        ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        
        ctoko.CariKategori();
        ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_CariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        String user1 = login.user;
        Admin.setText(user1);
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        // TODO add your handling code here:
        ctoko.isiField(Tabel1.getSelectedRow());
    }//GEN-LAST:event_Tabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin;
    private javax.swing.JButton Bersihkan;
    private javax.swing.JButton Cari;
    private javax.swing.JComboBox CariKategori;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox Jenis;
    private javax.swing.JComboBox Kategori;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Kode;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel1;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


public JTextField getTxtKode(){
        return Kode;
    }
    public JTextField getTxtNama(){
        return Nama;
    }
    public JTextField getTxtHarga(){
    return Harga;
    }
    public JComboBox getCbKategori(){
    return Kategori;
    }
    public JComboBox getCbJenis(){
    return Jenis;
    }
    public JComboBox getCbCariKategori(){
    return CariKategori;
    }
    public JButton getButtonHapus(){
    return Hapus;
    }
    public JButton getButtonBersih(){
    return Bersihkan;
    }
    public JButton getButtonSimpan(){
    return Simpan;
    }
    public JButton getButtonUbah(){
    return Ubah;
    }
    public JButton getButtonKeluar(){
    return Keluar;
    }
    public JTable getTableData(){
    return Tabel1;
    }

}
