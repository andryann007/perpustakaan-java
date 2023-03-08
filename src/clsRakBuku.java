import javax.swing.JOptionPane;

public class clsRakBuku extends clsKoneksi{
    String idBuku;
    String KodeRak;
    String JenisBuku;
    
    public void TampilData()
    {
        sql = "SELECT rak_buku.Id_Buku, buku.Judul_Buku, rak_buku.Kode_Rak, rak_buku.Jenis_Buku \n"
                + "FROM(rak_buku join buku ON rak_buku.Id_Buku = buku.Id_Buku) ORDER BY rak_buku.Kode_Rak";
    }
    
    public void Baru(String mKodeRak, String mJenisBuku)
    {
        try
        {
            mKodeRak = "";
            mJenisBuku = "";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan(String mIdBuku, String mKodeRak, String mJenisBuku)
    {
        try
        {
            sql = "insert into rak_buku values ('" + mIdBuku + "', '" + mKodeRak + "', '" + mJenisBuku + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Edit(String mIdBuku, String mKodeRak, String mJenisBuku)
    {
        try
        {
            sql = "update rak_buku set Jenis_Buku = '" + mJenisBuku + "', Kode_Rak = '" + mKodeRak  + "' where Id_Buku = '" + mIdBuku + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus(String mIdBuku)
    {
        try
        {
            sql = "delete from rak_buku where Id_Buku = '" + mIdBuku + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar()
    {
        try
        {
            JOptionPane.showMessageDialog(null, "Keluar dari form rak buku");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
