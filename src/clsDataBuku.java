import javax.swing.JOptionPane;

public class clsDataBuku extends clsKoneksi{
    String idBuku;
    String JudulBuku;
    String Penerbit;
    int TahunTerbit;
    String KodeRak;
    String JenisBuku;
    
    public void TampilData()
    {
        sql = "select * from buku";
    }
    
    public void Baru()
    {
        try
        {
            idBuku = "";
            JudulBuku = "";
            Penerbit = "";
            TahunTerbit = 0;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan()
    {
        try
        {
            sql = "insert into buku value ('" + idBuku + "', '" + JudulBuku + 
                    "', '" + Penerbit + "', '" + TahunTerbit + "')";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Edit()
    {
        try
        {
            sql = "update buku set Judul_Buku = '" + JudulBuku + "', Penerbit = '" + Penerbit 
                    +  "', Tahun_Terbit = '" + TahunTerbit + " 'where Id_Buku = '" + idBuku + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus()
    {
        try
        {
            sql = "delete from buku where Id_Buku = '" + idBuku + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar()
    {
        try
        {
            JOptionPane.showMessageDialog(null, "Keluar dari aplikasi data buku");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
}