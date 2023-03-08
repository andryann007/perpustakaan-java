import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class frmDataBuku extends javax.swing.JFrame {
    
    clsDataBuku objDataBuku = new clsDataBuku();
    
    private TableColumn column;

    public frmDataBuku() {
        initComponents();
        setDefaultCloseOperation(frmDataBuku.DO_NOTHING_ON_CLOSE);
        objDataBuku.Access();
        IsiTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdBuku = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tahun = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA BUKU");

        jLabel2.setText("Id Buku :");

        jLabel3.setText("Judul Buku :");

        jLabel4.setText("Penerbit :");

        txtIdBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBukuActionPerformed(evt);
            }
        });
        txtIdBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdBukuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdBukuKeyTyped(evt);
            }
        });

        txtJudul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJudulKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJudulKeyTyped(evt);
            }
        });

        txtPenerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPenerbitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPenerbitKeyTyped(evt);
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
                "Id Buku", "Judul Buku", "Penerbit", "Tahun Penerbit"
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

        jLabel5.setText("Tahun Terbit :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Tahun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPenerbit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void BersihIsian()
    {
        txtIdBuku.setText("");
        txtIdBuku.requestFocus();
        txtJudul.setText("");
        txtPenerbit.setText("");
        Tahun.setYear(2000);
    }
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(200);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(100);
    }
    
    private void IsiTabel()
    {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("Id Buku");
        tabelmapel.addColumn("Judul Buku");
        tabelmapel.addColumn("Penerbit");
        tabelmapel.addColumn("Tahun Terbit");
        
        try
        {
            objDataBuku.Access();
            objDataBuku.TampilData();
            
            Statement stat1 = objDataBuku.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objDataBuku.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[] {res1.getString(1), res1.getString(2), 
                    res1.getString(3), res1.getString(4)});
            }
            jTabel.setModel(tabelmapel);
            AturKolom();
        }
        
        catch(Exception e)
        {
        }
    }
    
    private void SimpanData()
    {
        if(txtIdBuku.getText().equals("")||txtJudul.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else
        {
            try
            {
                objDataBuku.Access();
                objDataBuku.idBuku = txtIdBuku.getText();
                objDataBuku.JudulBuku = txtJudul.getText();
                objDataBuku.Penerbit = txtPenerbit.getText();
                objDataBuku.TahunTerbit = Tahun.getYear();
                objDataBuku.Simpan();
                objDataBuku.res.executeUpdate(objDataBuku.sql);
                objDataBuku.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Buku berhasil disimpan");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi bermasalah !!!");
                System.out.println(e.getMessage());
            }
        }
    }

    private void txtIdBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBukuActionPerformed

    private void txtIdBukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBukuKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtIdBuku.getText().length() < 3 || txtIdBuku.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Panjang Id Buku minimal 3 digit !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdBuku.requestFocus();
            }
            else
            {
                txtJudul.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIdBukuKeyPressed

    private void txtJudulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJudulKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtJudul.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Judul buku harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIdBuku.requestFocus();
            }
            else
            {
                txtPenerbit.requestFocus();
            }
        }
    }//GEN-LAST:event_txtJudulKeyPressed

    private void txtPenerbitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPenerbitKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtPenerbit.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Nama Penerbit harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtPenerbit.requestFocus();
            }
            else
            {
                btnSimpan.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPenerbitKeyPressed

    private void txtIdBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBukuKeyTyped
        if(txtIdBuku.getText().length() > 10)
            evt.consume();
    }//GEN-LAST:event_txtIdBukuKeyTyped

    private void txtJudulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJudulKeyTyped
        if(txtJudul.getText().length() > 80)
            evt.consume();
    }//GEN-LAST:event_txtJudulKeyTyped

    private void txtPenerbitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPenerbitKeyTyped
        if(txtPenerbit.getText().length() > 45)
            evt.consume();
    }//GEN-LAST:event_txtPenerbitKeyTyped

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            txtIdBuku.requestFocus();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtIdBuku.getText().equals("")||txtJudul.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukkan Id Buku dan Judul Buku !!!");
        }
        else
        {
            try
            {
                objDataBuku.Access();
                objDataBuku.idBuku = txtIdBuku.getText();
                objDataBuku.JudulBuku = txtJudul.getText();
                objDataBuku.Penerbit= txtPenerbit.getText();
                objDataBuku.TahunTerbit = Tahun.getYear();
                objDataBuku.Edit();
                objDataBuku.res.executeUpdate(objDataBuku.sql);
                objDataBuku.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Buku berhasil diupdate");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi bermasalah !!!");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try
        {
            objDataBuku.Access();
            objDataBuku.idBuku = txtIdBuku.getText();
            objDataBuku.Hapus();
            objDataBuku.res.executeUpdate(objDataBuku.sql);
            objDataBuku.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null, "Data Buku berhasil di hapus");
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
            objDataBuku.Keluar();
            dispose();
            JOptionPane.showMessageDialog(null, "Berhasil keluar !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan !!!");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        int baris = jTabel.getSelectedRow();
        String kolom1 = jTabel.getValueAt(baris, 0).toString();
        String kolom2 = jTabel.getValueAt(baris, 1).toString();
        String kolom3 = jTabel.getValueAt(baris, 2).toString();
        String kolom4 = jTabel.getValueAt(baris, 3).toString();
        
        txtIdBuku.setText(kolom1);
        txtJudul.setText(kolom2);
        txtPenerbit.setText(kolom3);
    }//GEN-LAST:event_jTabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDataBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser Tahun;
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    // End of variables declaration//GEN-END:variables
}