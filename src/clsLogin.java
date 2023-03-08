import javax.swing.JOptionPane;

public class clsLogin extends clsKoneksi {
    String mId;
    String mPassword;
    
    public void Login()
    {
        try
        {
            sql = "select * from staff_perpus where Id_Staff = '" + mId + "'and Password = '" + mPassword + "'";     
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan, Harap Coba Lagi !!!");
            System.out.println(e.getMessage());
        }
    }
    
    public void Logout()
    {
        try
        {
            JOptionPane.showMessageDialog(null, "Anda akan keluar !!!"); 
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan !!!");
            System.out.println(e.getMessage());
        }
    }
}
