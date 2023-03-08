public class frmMenuUtama extends javax.swing.JFrame {

    public frmMenuUtama() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Data = new javax.swing.JMenu();
        Data_Staff = new javax.swing.JMenuItem();
        Data_Mahasiswa = new javax.swing.JMenuItem();
        Data_Buku = new javax.swing.JMenuItem();
        Data_RakBuku = new javax.swing.JMenuItem();
        Status = new javax.swing.JMenu();
        Status_Peminjaman = new javax.swing.JMenuItem();
        Status_Pengembalian = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Data.setText("Data");

        Data_Staff.setText("Data Staff Perpustakaan");
        Data_Staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_StaffMouseClicked(evt);
            }
        });
        Data_Staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_StaffActionPerformed(evt);
            }
        });
        Data.add(Data_Staff);

        Data_Mahasiswa.setText("Data Mahasiswa");
        Data_Mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_MahasiswaMouseClicked(evt);
            }
        });
        Data_Mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_MahasiswaActionPerformed(evt);
            }
        });
        Data.add(Data_Mahasiswa);

        Data_Buku.setText("Data Buku");
        Data_Buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_BukuMouseClicked(evt);
            }
        });
        Data_Buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_BukuActionPerformed(evt);
            }
        });
        Data.add(Data_Buku);

        Data_RakBuku.setText("Data Rak Buku");
        Data_RakBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Data_RakBukuMouseClicked(evt);
            }
        });
        Data_RakBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_RakBukuActionPerformed(evt);
            }
        });
        Data.add(Data_RakBuku);

        jMenuBar1.add(Data);

        Status.setText("Status Transaksi");

        Status_Peminjaman.setText("Status Peminjaman");
        Status_Peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Status_PeminjamanMouseClicked(evt);
            }
        });
        Status_Peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Status_PeminjamanActionPerformed(evt);
            }
        });
        Status.add(Status_Peminjaman);

        Status_Pengembalian.setText("Status Pengembalian");
        Status_Pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Status_PengembalianActionPerformed(evt);
            }
        });
        Status.add(Status_Pengembalian);

        jMenuBar1.add(Status);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Data_StaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_StaffMouseClicked

    }//GEN-LAST:event_Data_StaffMouseClicked

    private void Data_MahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_MahasiswaMouseClicked
        
    }//GEN-LAST:event_Data_MahasiswaMouseClicked

    private void Data_BukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_BukuMouseClicked
        
    }//GEN-LAST:event_Data_BukuMouseClicked

    private void Data_RakBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Data_RakBukuMouseClicked
        
    }//GEN-LAST:event_Data_RakBukuMouseClicked

    private void Data_StaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_StaffActionPerformed
        frmDataStaff objDataStaff = new frmDataStaff();
        objDataStaff.show();
    }//GEN-LAST:event_Data_StaffActionPerformed

    private void Data_MahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_MahasiswaActionPerformed
        frmDataMhs objDataMhs = new frmDataMhs();
        objDataMhs.show();
    }//GEN-LAST:event_Data_MahasiswaActionPerformed

    private void Data_BukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_BukuActionPerformed
        frmDataBuku objDataBuku = new frmDataBuku();
        objDataBuku.show();
    }//GEN-LAST:event_Data_BukuActionPerformed

    private void Data_RakBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_RakBukuActionPerformed
        frmRakBuku objRakBuku = new frmRakBuku();
        objRakBuku.show();
    }//GEN-LAST:event_Data_RakBukuActionPerformed

    private void Status_PengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Status_PengembalianActionPerformed
        frmPengembalian objPengembalian = new frmPengembalian();
        objPengembalian.show();
    }//GEN-LAST:event_Status_PengembalianActionPerformed

    private void Status_PeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Status_PeminjamanActionPerformed
        frmPeminjaman objPeminjaman = new frmPeminjaman();
        objPeminjaman.show();
    }//GEN-LAST:event_Status_PeminjamanActionPerformed

    private void Status_PeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_PeminjamanMouseClicked
       
    }//GEN-LAST:event_Status_PeminjamanMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Data;
    private javax.swing.JMenuItem Data_Buku;
    private javax.swing.JMenuItem Data_Mahasiswa;
    private javax.swing.JMenuItem Data_RakBuku;
    private javax.swing.JMenuItem Data_Staff;
    private javax.swing.JMenu Status;
    private javax.swing.JMenuItem Status_Peminjaman;
    private javax.swing.JMenuItem Status_Pengembalian;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
