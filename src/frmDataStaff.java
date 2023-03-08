import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmDataStaff extends javax.swing.JFrame {
    
    clsDataStaff objDataStaff = new clsDataStaff();
    
     private TableColumn column;

    public frmDataStaff() {
        initComponents();
        setDefaultCloseOperation(frmDataStaff.DO_NOTHING_ON_CLOSE);
        objDataStaff.Access();
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
        txtIDStaff = new javax.swing.JTextField();
        txtNamaStaff = new javax.swing.JTextField();
        txtNoTelpon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("FORM DATA STAFF PERPUSTAKAAN");

        jLabel2.setText("Id Staff :");

        jLabel3.setText("Nama Staff :");

        jLabel4.setText("No Telpon :");

        jLabel5.setText("Email :");

        txtIDStaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDStaffKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDStaffKeyTyped(evt);
            }
        });

        txtNamaStaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaStaffKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaStaffKeyTyped(evt);
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Staff", "Nama Staff", "No Telpon", "Email", "Password"
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

        jLabel6.setText("Password :");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNamaStaff)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void BersihIsian()
    {
        txtIDStaff.setText("");
        txtIDStaff.requestFocus();
        txtNamaStaff.setText("");
        txtNoTelpon.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
    }
    
    private void AturKolom()
    {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(150);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(90);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(200);
        column = jTabel.getColumnModel().getColumn(4);
        column.setPreferredWidth(80);
    }
    
    private void IsiTabel()
    {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        
        tabelmapel.addColumn("Id Staff");
        tabelmapel.addColumn("Nama Staff");
        tabelmapel.addColumn("No Telpon");
        tabelmapel.addColumn("Email");
        tabelmapel.addColumn("Password");
        try
        {
            objDataStaff.Access();
            objDataStaff.TampilData();
            
            Statement stat1 = objDataStaff.conn.createStatement();
            ResultSet res1 = stat1.executeQuery(objDataStaff.sql);
            while(res1.next())
            {
                tabelmapel.addRow(new Object[] {res1.getString(1), res1.getString(2), res1.getString(3), res1.getString(4), res1.getString(5)});
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
        if(txtIDStaff.getText().equals("")||txtNamaStaff.getText().equals("")||txtNoTelpon.getText().equals("")||txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Data harus diisi semua");
        }
        else
        {
            try
            {
                objDataStaff.Access();
                objDataStaff.idStaff = txtIDStaff.getText();
                objDataStaff.nama_Staff = txtNamaStaff.getText();
                objDataStaff.no_Telpon = txtNoTelpon.getText();
                objDataStaff.email = txtEmail.getText();
                objDataStaff.password = txtPassword.getText();
                objDataStaff.Simpan();
                objDataStaff.res.executeUpdate(objDataStaff.sql);
                objDataStaff.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Staff berhasil disimpan");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Proses penyimpanan gagal / koneksi bermasalah !!!");
                System.out.println(e.getMessage());
            }
        }
    }
    private void txtIDStaffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDStaffKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtIDStaff.getText().length() < 4 || txtIDStaff.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Panjang Id Staff minimal harus 4 digit !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtIDStaff.requestFocus();
            }
            else
            {
                txtNamaStaff.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIDStaffKeyPressed

    private void txtIDStaffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDStaffKeyTyped
        if(txtIDStaff.getText().length() > 4)
            evt.consume();
    }//GEN-LAST:event_txtIDStaffKeyTyped

    private void txtNamaStaffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaStaffKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtNamaStaff.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Nama harus diisi !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtNamaStaff.requestFocus();
            }
            else
            {
                txtNoTelpon.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamaStaffKeyPressed

    private void txtNamaStaffKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaStaffKeyTyped
        if(txtNamaStaff.getText().length() > 45)
            evt.consume();
    }//GEN-LAST:event_txtNamaStaffKeyTyped

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

    private void txtNoTelponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelponKeyTyped
        if(txtNoTelpon.getText().length() > 12)
            evt.consume();
    }//GEN-LAST:event_txtNoTelponKeyTyped

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
                txtPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if(txtNoTelpon.getText().length() > 18)
            evt.consume();
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        try
        {
            BersihIsian();
            IsiTabel();
            txtIDStaff.requestFocus();
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtIDStaff.getText().equals("")||txtNamaStaff.getText().equals("") || txtNoTelpon.getText().equals("")||txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Masukkan Informasi yang tepat !!!");
        }
        else
        {
            try
            {
                objDataStaff.Access();
                objDataStaff.idStaff= txtIDStaff.getText();
                objDataStaff.nama_Staff = txtNamaStaff.getText();
                objDataStaff.no_Telpon = txtNoTelpon.getText();
                objDataStaff.email = txtEmail.getText();
                objDataStaff.password = txtPassword.getText();
                objDataStaff.Edit();
                objDataStaff.res.executeUpdate(objDataStaff.sql);
                objDataStaff.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null, "Data Staff berhasil diupdate");
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
            objDataStaff.Access();
            objDataStaff.idStaff = txtIDStaff.getText();
            objDataStaff.Hapus();
            objDataStaff.res.executeUpdate(objDataStaff.sql);
            objDataStaff.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null, "Data Staff berhasil di hapus");
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
            objDataStaff.Keluar();
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
        String kolom5 = jTabel.getValueAt(baris, 4).toString();
        
        txtIDStaff.setText(kolom1);
        txtNamaStaff.setText(kolom2);
        txtNoTelpon.setText(kolom3);
        txtEmail.setText(kolom4);
        txtPassword.setText(kolom5);
    }//GEN-LAST:event_jTabelMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            if(txtPassword.getText().length() < 6 || txtPassword.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Panjang Password minimal harus 6 digit !!!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtPassword.requestFocus();
            }
            else
            {
                btnSimpan.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDataStaff().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDStaff;
    private javax.swing.JTextField txtNamaStaff;
    private javax.swing.JTextField txtNoTelpon;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}