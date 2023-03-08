import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmPeminjaman extends javax.swing.JFrame {

    clsPeminjaman objPeminjaman = new clsPeminjaman();
    private TableColumn column;
    
    public frmPeminjaman() {
        initComponents();
        setDefaultCloseOperation(frmPeminjaman.DO_NOTHING_ON_CLOSE);
        objPeminjaman.Access();
        IsiTabel();
        IsiComboNIM();
        IsiComboIdBuku();
        IsiComboIdStaff();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdTransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboNIM = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboIdBuku = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboIdStaff = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        tglPeminjaman = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA PEMINJAMAN BUKU");

        jLabel2.setText("Id Transaksi :");

        txtIdTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdTransaksiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdTransaksiKeyTyped(evt);
            }
        });

        jLabel3.setText("NIM Mahasiswa :");

        cboNIM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNIM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboNIMMouseClicked(evt);
            }
        });

        jLabel4.setText("Id Buku :");

        cboIdBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboIdBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboIdBukuMouseClicked(evt);
            }
        });

        jLabel5.setText("Id Staff :");

        cboIdStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboIdStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboIdStaffMouseClicked(evt);
            }
        });

        jLabel6.setText("Tanggal Peminjaman :");

        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Transaksi", "Tanggal Peminjaman", "NIM Mahasiswa", "Nama Mahasiswa", "Id Buku", "Judul Buku", "Id Staff", "Nama Staff"
            }
        ));
        jTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabel);

        btnBaru.setText("New");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnKeluar.setText("Exit");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdTransaksi)
                                    .addComponent(cboNIM, 0, 100, Short.MAX_VALUE))
                                .addGap(176, 176, 176)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboIdStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cboIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboIdStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cboNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(tglPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnKeluar)
                    .addComponent(btnHapus))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        int baris = jTabel.getSelectedRow();
        String kolom1 = jTabel.getValueAt(baris, 0).toString();
        String kolom2 = jTabel.getValueAt(baris, 1).toString();
        String kolom3 = jTabel.getValueAt(baris, 2).toString();
        String kolom4 = jTabel.getValueAt(baris, 4).toString();
        String kolom5 = jTabel.getValueAt(baris, 6).toString();
        
        txtIdTransaksi.setText(kolom1);
        tglPeminjaman.setDateFormatString(kolom2);
        cboNIM.removeAllItems();
        cboNIM.addItem(kolom3);
        cboIdBuku.removeAllItems();
        cboIdBuku.addItem(kolom4);
        cboIdStaff.removeAllItems();
        cboIdStaff.addItem(kolom5);
    }//GEN-LAST:event_jTabelMouseClicked

    private void txtIdTransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdTransaksiKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(((txtIdTransaksi.getText().isEmpty())))
            {
                JOptionPane.showMessageDialog(this, "Id Transaksi Harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdTransaksi.requestFocus();
            }
            else
            {
            } 
        }
    }//GEN-LAST:event_txtIdTransaksiKeyPressed

    private void txtIdTransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdTransaksiKeyTyped
        if(txtIdTransaksi.getText().length() > 3)
            evt.consume();
    }//GEN-LAST:event_txtIdTransaksiKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void cboNIMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboNIMMouseClicked
        IsiComboNIM();
    }//GEN-LAST:event_cboNIMMouseClicked

    private void cboIdBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboIdBukuMouseClicked
        IsiComboIdBuku();
    }//GEN-LAST:event_cboIdBukuMouseClicked

    private void cboIdStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboIdStaffMouseClicked
        IsiComboIdStaff();
    }//GEN-LAST:event_cboIdStaffMouseClicked

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            txtIdTransaksi.requestFocus();
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
            objPeminjaman.Access();
            objPeminjaman.idTransaksi = txtIdTransaksi.getText();
            objPeminjaman.nimMhs = cboNIM.getSelectedItem().toString().substring(0,8);
            objPeminjaman.idBuku = cboIdBuku.getSelectedItem().toString().substring(0,3);
            objPeminjaman.idStaff = cboIdStaff.getSelectedItem().toString().substring(0,4);
                
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            objPeminjaman.tglPeminjaman = date.format(tglPeminjaman.getDate());
                
            objPeminjaman.Edit();
            objPeminjaman.res.executeUpdate(objPeminjaman.sql);
            objPeminjaman.conn.close();
            BersihIsian();
            IsiTabel();
            JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Proses pengeditan gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try
        {
            objPeminjaman.Access();
            objPeminjaman.idTransaksi = txtIdTransaksi.getText();
            objPeminjaman.Hapus(objPeminjaman.idTransaksi);
            objPeminjaman.res.executeUpdate(objPeminjaman.sql);
            objPeminjaman.conn.close();
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
            objPeminjaman.Keluar();
            dispose();
            JOptionPane.showMessageDialog(null, "Berhasil keluar !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKeluarActionPerformed
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
        column = jTabel.getColumnModel().getColumn(5);
        column.setPreferredWidth(300);
        column = jTabel.getColumnModel().getColumn(6);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(7);
        column.setPreferredWidth(120);
    }
    
    public void BersihIsian()
    {
        txtIdTransaksi.setText("");
        IsiComboNIM();
        IsiComboIdBuku();
        IsiComboIdStaff();
        tglPeminjaman.setDateFormatString("yyyy-MM-dd");
    }
    
    private void SimpanData()
    {
        if(txtIdTransaksi.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else
        {
            try
            {
                objPeminjaman.Access();
                objPeminjaman.idTransaksi = txtIdTransaksi.getText();
                objPeminjaman.nimMhs = cboNIM.getSelectedItem().toString().substring(0,8);
                objPeminjaman.idBuku = cboIdBuku.getSelectedItem().toString().substring(0,3);
                objPeminjaman.idStaff = cboIdStaff.getSelectedItem().toString().substring(0,4);
                
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                objPeminjaman.tglPeminjaman = date.format(tglPeminjaman.getDate());
                
                objPeminjaman.Simpan();
                objPeminjaman.res.executeUpdate(objPeminjaman.sql);
                objPeminjaman.conn.close();
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
    }
    
    public void IsiComboNIM()
    {
        try
        {
            cboNIM.removeAllItems();
            objPeminjaman.Access();
            String sql1 = "select NIM_Mahasiswa, Nama_Mahasiswa from mahasiswa";
            Statement stat1 = objPeminjaman.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(sql1);
            cboNIM.addItem("NIM Mahasiswa");
            while(res1.next())
            {
                cboNIM.addItem(res1.getString("NIM_Mahasiswa") + " : " + res1.getString("Nama_Mahasiswa"));
            }
        }
        catch(Exception e)
        {
        }
    }
    
    public void IsiComboIdBuku()
    {
        try
        {
            cboIdBuku.removeAllItems();
            objPeminjaman.Access();
            String sql1 = "select Id_Buku, Judul_Buku from buku";
            Statement stat1 = objPeminjaman.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(sql1);
            cboIdBuku.addItem("Id Buku");
            while(res1.next())
            {
                cboIdBuku.addItem(res1.getString("Id_Buku") + " : " + res1.getString("Judul_Buku"));
            }
        }
        catch(Exception e)
        {
        }
    }
    
    public void IsiComboIdStaff()
    {
        try
        {
            cboIdStaff.removeAllItems();
            objPeminjaman.Access();
            String sql1 = "select Id_Staff, Nama_Staff from staff_perpus";
            Statement stat1 = objPeminjaman.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(sql1);
            cboIdStaff.addItem("Id Staff");
            
            while(res1.next())
            {
                cboIdStaff.addItem(res1.getString("Id_Staff") + " : " + res1.getString("Nama_Staff"));
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
        tabelmapel.addColumn("Tanggal Peminjaman");
        tabelmapel.addColumn("NIM Mahasiswa");
        tabelmapel.addColumn("Nama Mahasiswa");
        tabelmapel.addColumn("Id Buku");
        tabelmapel.addColumn("Judul Buku");
        tabelmapel.addColumn("Id Petugas");
        tabelmapel.addColumn("Nama Petugas");
        
        try
        {
            objPeminjaman.Access();
            objPeminjaman.TampilData();
            
            Statement stat1 = objPeminjaman.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objPeminjaman.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[] {res1.getString(1), res1.getString(2), res1.getString(3), res1.getString(4), res1.getString(5)
                , res1.getString(6), res1.getString(7), res1.getString(8)});
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cboIdBuku;
    private javax.swing.JComboBox<String> cboIdStaff;
    private javax.swing.JComboBox<String> cboNIM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private com.toedter.calendar.JDateChooser tglPeminjaman;
    private javax.swing.JTextField txtIdTransaksi;
    // End of variables declaration//GEN-END:variables
}