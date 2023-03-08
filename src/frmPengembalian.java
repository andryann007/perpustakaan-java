import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmPengembalian extends javax.swing.JFrame {
    clsPengembalian objPengembalian = new clsPengembalian();
    private TableColumn column;
    
    public frmPengembalian() {
        initComponents();
        setDefaultCloseOperation(frmPengembalian.DO_NOTHING_ON_CLOSE);
        objPengembalian.Access();
        IsiTabel();
        IsiComboIdTransaksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboIdTransaksi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tglPengembalian = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtHari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tglPeminjaman = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA PENGEMBALIAN BUKU");

        jLabel2.setText("Id Transaksi :");

        cboIdTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboIdTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboIdTransaksiMouseClicked(evt);
            }
        });

        jLabel3.setText("Tanggal Kembali :");

        jLabel4.setText("Hari Pengembalian :");

        jLabel5.setText("Jumlah Denda :");

        jLabel6.setText("Tanggal Pinjam :");

        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Transaksi", "Tanggal Pinjam", "Tanggal Kembali", "NIM Mahasiswa", "Nama Mahasiswa", "Id Buku", "Judul Buku", "Hari Pengembalian", "Jumlah Denda"
            }
        ));
        jTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabel);
        if (jTabel.getColumnModel().getColumnCount() > 0) {
            jTabel.getColumnModel().getColumn(2).setHeaderValue("Tanggal Kembali");
        }

        btnBaru.setText("New");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnKeluar.setText("Exit");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Apabila Hari Pengembalian Lebih dari 3 hari maka akan dikenakan denda Rp. 5000 per hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tglPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(185, 185, 185))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(tglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnKeluar)
                    .addComponent(btnEdit)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void cboIdTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboIdTransaksiMouseClicked
        IsiComboIdTransaksi();
    }//GEN-LAST:event_cboIdTransaksiMouseClicked

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        int baris = jTabel.getSelectedRow();
        String kolom1 = jTabel.getValueAt(baris, 0).toString();
        String kolom2 = jTabel.getValueAt(baris, 1).toString();
        String kolom3 = jTabel.getValueAt(baris, 6).toString();
        String kolom4 = jTabel.getValueAt(baris, 7).toString();
        String kolom5 = jTabel.getValueAt(baris, 8).toString();

        cboIdTransaksi.removeAllItems();
        cboIdTransaksi.addItem(kolom1);
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        tglPeminjaman.setDateFormatString(kolom2);
        tglPeminjaman.setDateFormatString(kolom3);
        txtHari.setText(kolom4);
        txtDenda.setText(kolom5);
    }//GEN-LAST:event_jTabelMouseClicked

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            cboIdTransaksi.requestFocus();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

            try
            {
                objPengembalian.Access();
                objPengembalian.idTransaksi = cboIdTransaksi.getSelectedItem().toString().substring(0, 1);
                
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                objPengembalian.tglPeminjaman = date.format(tglPeminjaman.getDate());
                objPengembalian.tglPengembalian = date.format(tglPengembalian.getDate());
                
                Date tanggalPinjam = date.parse(objPengembalian.tglPeminjaman);
                Date tanggalKembali = date.parse(objPengembalian.tglPengembalian);
                long tglPinjam = tanggalPinjam.getTime();
                long tglKembali = tanggalKembali.getTime();
                long diff = tglKembali - tglPinjam;
                long lama = diff / (24 * 60 * 60 * 1000);
                txtHari.setText(Long.toString(lama) + " Hari");
                objPengembalian.hari = (int)(long) lama;
                long hargaDenda;
                
                if(lama > 3)
                {
                    hargaDenda = (lama - 3) * 5000;
                    txtDenda.setText(Long.toString(hargaDenda));
                    
                }
                else
                {
                    hargaDenda = 0;
                    txtDenda.setText(Long.toString(hargaDenda));
                }
                
                objPengembalian.denda = (int)(long)hargaDenda;
                
                objPengembalian.Edit();
                objPengembalian.res.executeUpdate(objPengembalian.sql);
                objPengembalian.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses pengupdatean gagal !!!");
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try
        {
            objPengembalian.Access();
            objPengembalian.idTransaksi = cboIdTransaksi.getSelectedItem().toString().substring(0,1);
            objPengembalian.Hapus(objPengembalian.idTransaksi);
            objPengembalian.res.executeUpdate(objPengembalian.sql);
            objPengembalian.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Proses penghapusan gagal / koneksi bermasalah !!!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        try
        {
            objPengembalian.Keluar();
            dispose();
            JOptionPane.showMessageDialog(null, "Berhasil keluar !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    public void BersihIsian()
    {
        IsiComboIdTransaksi();
        tglPeminjaman.setDateFormatString("yyyy-MM-dd");
        tglPengembalian.setDateFormatString("yyyy-MM-dd");
        txtHari.setText("");
        txtDenda.setText("");
    }
    
    public void IsiComboIdTransaksi()
    {
        try
        {
            cboIdTransaksi.removeAllItems();
            objPengembalian.Access();
            String sql1 = "SELECT peminjaman.Id_Transaksi, peminjaman.Tanggal_Peminjaman, peminjaman.NIM_Mahasiswa, mahasiswa.Nama_Mahasiswa, peminjaman.Id_Buku, buku.Judul_Buku FROM (peminjaman JOIN mahasiswa ON peminjaman.NIM_Mahasiswa = mahasiswa.NIM_Mahasiswa JOIN buku ON peminjaman.Id_Buku = buku.Id_Buku) ORDER BY peminjaman.Id_Transaksi";
            Statement stat1 = objPengembalian.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(sql1);
            cboIdTransaksi.addItem("Id Transaksi");
            while(res1.next())
            {
                cboIdTransaksi.addItem( "Id Transaksi : " + res1.getString("Id_Transaksi") + " | Tanggal Peminjaman : " + res1.getString("Tanggal_Peminjaman") + " | NIM : " + res1.getString("NIM_Mahasiswa") + " | Nama : " + res1.getString("Nama_Mahasiswa"));
            }
        }
        catch(Exception e)
        {
        }
    }
    
    private void IsiTabel()
    {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("Id Transaksi");
        tabelmapel.addColumn("NIM Mahasiswa");
        tabelmapel.addColumn("Nama Mahasiswa");
        tabelmapel.addColumn("Id Buku");
        tabelmapel.addColumn("Judul Buku");
        tabelmapel.addColumn("Tanggal Pinjam");
        tabelmapel.addColumn("Tanggal Kembali");
        tabelmapel.addColumn("Hari Kembali");
        tabelmapel.addColumn("Jumlah Denda");
        
        try
        {
            objPengembalian.Access();
            objPengembalian.TampilData();
            
            Statement stat1 = objPengembalian.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objPengembalian.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[] {res1.getString(1), res1.getString(2), res1.getString(3), res1.getString(4), res1.getString(5)
                , res1.getString(6), res1.getString(7), res1.getString(8), res1.getString(9)});
            }
            jTabel.setModel(tabelmapel);
            AturKolom();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan pada penampilan data !!!");
            System.out.println(e.getMessage());
        }
    }
    
    private void SimpanData()
    {
            try
            {
                objPengembalian.Access();
                objPengembalian.idTransaksi = cboIdTransaksi.getSelectedItem().toString().substring(0,1);
                
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                objPengembalian.tglPeminjaman = date.format(tglPeminjaman.getDate());
                objPengembalian.tglPengembalian = date.format(tglPengembalian.getDate());
                
                Date tanggalPinjam = date.parse(objPengembalian.tglPeminjaman);
                Date tanggalKembali = date.parse(objPengembalian.tglPengembalian);
                long tglPinjam = tanggalPinjam.getTime();
                long tglKembali = tanggalKembali.getTime();
                long diff = tglKembali - tglPinjam;
                long lama = diff / (24 * 60 * 60 * 1000);
                txtHari.setText(Long.toString(lama) + " Hari");
                objPengembalian.hari = (int)(long) lama;
                long hargaDenda;
                
                if(lama > 3)
                {
                    hargaDenda = (lama - 3) * 5000;
                    txtDenda.setText(Long.toString(hargaDenda));
                }
                else
                {
                    hargaDenda = 0;
                    txtDenda.setText(Long.toString(hargaDenda));
                }
                
                objPengembalian.denda = (int)(long)hargaDenda;
                
                objPengembalian.Simpan();
                objPengembalian.res.executeUpdate(objPengembalian.sql);
                objPengembalian.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal");
                System.out.println(e.getMessage());
            }

    }
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(4);
        column.setPreferredWidth(250);
        column = jTabel.getColumnModel().getColumn(5);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(6);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(7);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(8);
        column.setPreferredWidth(120);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cboIdTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private com.toedter.calendar.JDateChooser tglPeminjaman;
    private com.toedter.calendar.JDateChooser tglPengembalian;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtHari;
    // End of variables declaration//GEN-END:variables
}