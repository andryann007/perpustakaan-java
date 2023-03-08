import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmRakBuku extends javax.swing.JFrame {

    clsRakBuku objJenisBuku = new clsRakBuku();
    
    private TableColumn column;
    
    public frmRakBuku() {
        initComponents();
        setDefaultCloseOperation(frmRakBuku.DO_NOTHING_ON_CLOSE);
        objJenisBuku.Access();
        IsiComboIdBuku();
        IsiTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKodeRak = new javax.swing.JTextField();
        txtJenisBuku = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboIdBuku = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM RAK BUKU");

        jLabel2.setText("Kode Rak :");

        jLabel3.setText("Jenis Buku :");

        txtKodeRak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeRakKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKodeRakKeyTyped(evt);
            }
        });

        txtJenisBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJenisBukuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJenisBukuKeyTyped(evt);
            }
        });

        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Buku", "Judul Buku", "Kode Rak", "Jenis Buku"
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

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Exit");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel4.setText("Id Buku :");

        cboIdBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboIdBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboIdBukuMouseClicked(evt);
            }
        });
        cboIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboIdBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboIdBuku, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKodeRak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJenisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKodeRak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJenisBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void txtKodeRakKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeRakKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if((txtKodeRak.getText().length() < 3) || (txtKodeRak.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "Panjang kode rak harus minimal 2 digit !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtKodeRak.requestFocus();
            }
            else
            {
                txtJenisBuku.requestFocus();
            }
        }
    }//GEN-LAST:event_txtKodeRakKeyPressed

    private void txtJenisBukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJenisBukuKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if((txtJenisBuku.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "Jenis Buku harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtJenisBuku.requestFocus();
            }
            else
            {
                btnSimpan.requestFocus();
            }
        }
    }//GEN-LAST:event_txtJenisBukuKeyPressed

    private void txtKodeRakKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeRakKeyTyped
        if(txtKodeRak.getText().length() > 2)
        evt.consume();
    }//GEN-LAST:event_txtKodeRakKeyTyped

    private void txtJenisBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJenisBukuKeyTyped
        if(txtJenisBuku.getText().length() > 20)
        evt.consume();
    }//GEN-LAST:event_txtJenisBukuKeyTyped

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        int baris = jTabel.getSelectedRow();
        String kolom1 = jTabel.getValueAt(baris, 0).toString();
        String kolom2 = jTabel.getValueAt(baris, 2).toString();
        String kolom3 = jTabel.getValueAt(baris, 3).toString();
        
        cboIdBuku.removeAllItems();
        cboIdBuku.addItem(kolom1);
        txtKodeRak.setText(kolom2);
        txtJenisBuku.setText(kolom3);
    }//GEN-LAST:event_jTabelMouseClicked

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            txtKodeRak.requestFocus();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtKodeRak.getText().equals("")|| txtJenisBuku.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukkan Data !!!");
        }
        else
        {
            try
            {
                objJenisBuku.Access();
                objJenisBuku.idBuku = cboIdBuku.getSelectedItem().toString().substring(0,3);
                objJenisBuku.KodeRak = txtKodeRak.getText();
                objJenisBuku.JenisBuku = txtJenisBuku.getText();
                objJenisBuku.Edit(objJenisBuku.idBuku, objJenisBuku.KodeRak, objJenisBuku.JenisBuku);
                objJenisBuku.res.executeUpdate(objJenisBuku.sql);
                objJenisBuku.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil diupdate");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi gagal");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try
        {
            objJenisBuku.Access();
            objJenisBuku.KodeRak = txtKodeRak.getText();
            objJenisBuku.Hapus(objJenisBuku.KodeRak);
            objJenisBuku.res.executeUpdate(objJenisBuku.sql);
            objJenisBuku.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil di hapus");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Proses penghapusan gagal / koneksi gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        try
        {
            objJenisBuku.Keluar();
            dispose();
            JOptionPane.showMessageDialog(null, "Berhasil Keluar !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cboIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboIdBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboIdBukuActionPerformed

    private void cboIdBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboIdBukuMouseClicked
        IsiComboIdBuku();
    }//GEN-LAST:event_cboIdBukuMouseClicked

    public void BersihIsian()
    {
        IsiComboIdBuku();
        txtKodeRak.setText("");
        txtKodeRak.requestFocus();
        txtJenisBuku.setText("");
    }
    private void IsiTabel()
    {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("Id Buku");
        tabelmapel.addColumn("Judul Buku");
        tabelmapel.addColumn("Kode Rak Buku");
        tabelmapel.addColumn("Jenis Buku");
        
        try
        {
            objJenisBuku.Access();
            objJenisBuku.TampilData();
            
            Statement stat1 = objJenisBuku.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objJenisBuku.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[]{res1.getString(1),res1.getString(2), res1.getString(3), res1.getString(4)});
            }
            jTabel.setModel(tabelmapel);
            AturKolom();
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
            objJenisBuku.Access();
            String sql1 = "select Id_Buku, Judul_Buku from buku";
            Statement stat1 = objJenisBuku.conn.createStatement();
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
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(350);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(150);
    }
        
    private void SimpanData()
    {
        if(txtKodeRak.getText().equals("")||txtJenisBuku.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else
        {
            try
            {
                objJenisBuku.Access();
                objJenisBuku.idBuku = cboIdBuku.getSelectedItem().toString().substring(0,3);
                objJenisBuku.KodeRak = txtKodeRak.getText();
                objJenisBuku.JenisBuku = txtJenisBuku.getText();
                objJenisBuku.Simpan(objJenisBuku.idBuku,objJenisBuku.KodeRak, objJenisBuku.JenisBuku);
                objJenisBuku.res.executeUpdate(objJenisBuku.sql);
                objJenisBuku.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Jenis Buku berhasil disimpan");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi gagal");
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRakBuku().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JTextField txtJenisBuku;
    private javax.swing.JTextField txtKodeRak;
    // End of variables declaration//GEN-END:variables
}
