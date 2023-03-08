import javax.swing.JOptionPane;

public class clsPengembalian extends clsKoneksi{
    String idTransaksi;
    String tglPeminjaman;
    String tglPengembalian;
    int hari;
    int denda;
    
    public void TampilData()
    {
        sql = "SELECT peminjaman.Id_Transaksi, peminjaman.NIM_Mahasiswa, mahasiswa.Nama_Mahasiswa, peminjaman.Id_Buku, buku.Judul_Buku, peminjaman.Tanggal_Peminjaman, pengembalian.Tanggal_Pengembalian, pengembalian.Hari_Kembali, pengembalian.Jumlah_Denda\n" +
        "FROM (peminjaman JOIN pengembalian ON peminjaman.Id_Transaksi = pengembalian.Id_Transaksi JOIN mahasiswa ON peminjaman.NIM_Mahasiswa = mahasiswa.NIM_Mahasiswa JOIN buku ON peminjaman.Id_Buku = buku.Id_Buku) ORDER BY pengembalian.Id_Transaksi";
    }
    
    public void Baru()
    {
        try
        {
            idTransaksi = "";
            tglPeminjaman = "";
            tglPengembalian = "";
            hari = 0;
            denda = 0;
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
            sql = "insert into pengembalian value ('" + idTransaksi + "', '" + tglPeminjaman +  
                    "', '" + tglPengembalian + "', '" + hari + "', '" + denda + "')";
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
            sql = "update pengembalian set Tanggal_Peminjaman = '" + tglPeminjaman 
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
            sql = "delete from pengembalian where Id_Transaksi = '" + idTransaksi + "'";
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
            JOptionPane.showMessageDialog(null, "Keluar dari aplikasi data pengembalian buku");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}