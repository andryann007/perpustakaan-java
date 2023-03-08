import javax.swing.JOptionPane;

public class clsPeminjaman extends clsKoneksi{
    
    String idTransaksi;
    String tglPeminjaman;
    String nimMhs;
    String idBuku;
    String idStaff;

    public void TampilData()
    {
        sql = "SELECT peminjaman.Id_Transaksi, peminjaman.Tanggal_Peminjaman, peminjaman.NIM_Mahasiswa, mahasiswa.Nama_Mahasiswa, peminjaman.Id_Buku, buku.Judul_Buku, peminjaman.Id_Staff, staff_perpus.Nama_Staff \n" +
                "FROM (peminjaman JOIN mahasiswa ON peminjaman.NIM_Mahasiswa = mahasiswa.NIM_Mahasiswa JOIN buku ON peminjaman.Id_Buku = buku.Id_Buku JOIN staff_perpus ON peminjaman.Id_Staff = staff_perpus.Id_Staff) ORDER BY peminjaman.Id_Transaksi";

    }
    
    public void Baru()
    {
        try
        {
            nimMhs = "";
            idBuku = "";
            idStaff = "";
            idTransaksi = "";
            tglPeminjaman = "";
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
            sql = "insert into peminjaman value ('" + idTransaksi + "', '" + tglPeminjaman +  
                    "', '" + nimMhs + "', '" + idBuku + "', '" + idStaff + "')";
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
            sql = "update peminjaman set Tanggal_Peminjaman = '" + tglPeminjaman 
                    + "'where Id_Transaksi= '" + idTransaksi + "'";
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Hapus(String midTransaksi)
    {
        try
        {
            sql = "delete from peminjaman where Id_Transaksi = '" + idTransaksi + "'";
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
            JOptionPane.showMessageDialog(null, "Keluar dari aplikasi data peminjaman buku");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}