import javax.swing.JOptionPane;

public class clsDataStaff extends clsKoneksi{
    String idStaff;
    String nama_Staff;
    String no_Telpon;
    String email;
    String password;
    
    public void TampilData()
    {
        sql = "select * from staff_perpus";
    }
    
    public void Baru()
    {
        try
        {
            idStaff = "";
            nama_Staff = "";
            no_Telpon = "";
            email = "";
            password = "";
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
            sql = "insert into staff_perpus value ('" + idStaff + "', '" + nama_Staff + "', '" + no_Telpon + "', '" + email +  "', '" + password + "')";
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
            sql = "update staff_perpus set Nama_Staff = '" + nama_Staff + "', No_Telpon = '" + no_Telpon + "', Email = '" + email + "', Password = '" + password + "' where Id_Staff = '" + idStaff + "'";
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
            sql = "delete from staff_perpus where Id_Staff = '" + idStaff + "'";
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
            JOptionPane.showMessageDialog(null, "Keluar dari aplikasi data staff");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
