import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class frmDataMhs extends javax.swing.JFrame {

    clsDataMhs objDataMhs = new clsDataMhs();
    
    private TableColumn column;
    
    public frmDataMhs() {
        initComponents();
        setDefaultCloseOperation(frmDataMhs.DO_NOTHING_ON_CLOSE);
        objDataMhs.Access();
        IsiTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNamaMhs = new javax.swing.JTextField();
        txtNoTelpon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA MAHASISWA");

        jLabel2.setText("NIM :");

        jLabel3.setText("Nama :");

        jLabel4.setText("No Telpon :");

        jLabel5.setText("Email :");

        txtNIM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNIMKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNIMKeyTyped(evt);
            }
        });

        txtNamaMhs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaMhsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaMhsKeyTyped(evt);
            }
        });

        txtNoTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelponActionPerformed(evt);
            }
        });
        txtNoTelpon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoTelponKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelponKeyTyped(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
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
                "NIM", "Nama", "No_Telp", "Email"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNamaMhs, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNoTelpon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void BersihIsian()
    {
        txtNIM.setText("");
        txtNIM.requestFocus();
        txtNamaMhs.setText("");
        txtNoTelpon.setText("");
        txtEmail.setText("");
    }
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(200);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(200);
    }
    
    private void IsiTabel()
    {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("NIM");
        tabelmapel.addColumn("Nama Mahasiswa");
        tabelmapel.addColumn("No Telpon");
        tabelmapel.addColumn("Email");
        try
        {
            objDataMhs.Access();
            objDataMhs.TampilData();
            
            Statement stat1 = objDataMhs.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objDataMhs.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[] {res1.getString(1), res1.getString(2), res1.getString(3), res1.getString(4)});
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
        if(txtNIM.getText().equals("")||txtNamaMhs.getText().equals("")||txtNoTelpon.getText().equals("")||txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else
        {
            try
            {
                objDataMhs.Access();
                objDataMhs.nim = txtNIM.getText();
                objDataMhs.nama = txtNamaMhs.getText();
                objDataMhs.no_telp = txtNoTelpon.getText();
                objDataMhs.email = txtEmail.getText();
                objDataMhs.Simpan();
                objDataMhs.res.executeUpdate(objDataMhs.sql);
                objDataMhs.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Mahasiswa berhasil disimpan");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi bermasalah !!!");
                System.out.println(e.getMessage());
            }
        }
    }
    
    private void txtNoTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTelponActionPerformed

    private void txtNIMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIMKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtNIM.getText().length() < 8 || txtNIM.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Panjang NIM harus 8 digit !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNIM.requestFocus();
            }
            else
            {
                txtNamaMhs.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNIMKeyPressed

    private void txtNamaMhsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaMhsKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtNamaMhs.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Nama harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNamaMhs.requestFocus();
            }
            else
            {
                txtNoTelpon.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamaMhsKeyPressed

    private void txtNoTelponKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelponKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtNoTelpon.getText().length() < 11 ||txtNoTelpon.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Nomor telepon tidak valid !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNoTelpon.requestFocus();
            }
            else
            {
                txtEmail.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNoTelponKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtEmail.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Email belum dimasukkan !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtEmail.requestFocus();
            }
            else
            {
                btnSimpan.requestFocus();
            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtNIMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNIMKeyTyped
        if(txtNIM.getText().length() > 8)
            evt.consume();
    }//GEN-LAST:event_txtNIMKeyTyped

    private void txtNamaMhsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaMhsKeyTyped
        if(txtNamaMhs.getText().length() > 45)
            evt.consume();
    }//GEN-LAST:event_txtNamaMhsKeyTyped

    private void txtNoTelponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelponKeyTyped
        if(txtNoTelpon.getText().length() > 12)
            evt.consume();
    }//GEN-LAST:event_txtNoTelponKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if(txtNoTelpon.getText().length() > 18)
            evt.consume();
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            txtNIM.requestFocus();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtNIM.getText().equals("")||txtNamaMhs.getText().equals("") || txtNoTelpon.getText().equals("")||txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukkan Informasi yang tepat !!!");
        }
        else
        {
            try
            {
                objDataMhs.Access();
                objDataMhs.nim= txtNIM.getText();
                objDataMhs.nama = txtNamaMhs.getText();
                objDataMhs.no_telp = txtNoTelpon.getText();
                objDataMhs.email = txtEmail.getText();
                objDataMhs.Edit();
                objDataMhs.res.executeUpdate(objDataMhs.sql);
                objDataMhs.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Mahasiswa berhasil diupdate");
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
            objDataMhs.Access();
            objDataMhs.nim = txtNIM.getText();
            objDataMhs.Hapus();
            objDataMhs.res.executeUpdate(objDataMhs.sql);
            objDataMhs.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null, "Data Mahasiswa berhasil di hapus");
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
            objDataMhs.Keluar();
            dispose();
            JOptionPane.showMessageDialog(null, "Berhasil keluar !!!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
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
        
        txtNIM.setText(kolom1);
        txtNamaMhs.setText(kolom2);
        txtNoTelpon.setText(kolom3);
        txtEmail.setText(kolom4);
    }//GEN-LAST:event_jTabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDataMhs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNamaMhs;
    private javax.swing.JTextField txtNoTelpon;
    // End of variables declaration//GEN-END:variables
}