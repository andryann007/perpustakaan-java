import javax.swing.JOptionPane;

public class clsDataMhs extends clsKoneksi{
    String nim;
    String nama;
    String no_telp;
    String email;
    
    public void TampilData()
    {
        sql = "select * from mahasiswa";
    }
    
    public void Baru()
    {
        try
        {
            nim = "";
            nama = "";
            no_telp = "";
            email = "";
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
            sql = "insert into mahasiswa value ('" + nim + "', '" + nama + "', '" + no_telp + "', '" + email + "')";
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
            sql = "update mahasiswa set Nama_Mahasiswa = '" + nama + "', No_Telpon = '" + no_telp + "', Email = '" + email + "' where NIM_Mahasiswa = '" + nim + "'";
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
            sql = "delete from mahasiswa where NIM_Mahasiswa = '" + nim + "'";
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
            JOptionPane.showMessageDialog(null, "Keluar dari aplikasi data mahasiswa");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}