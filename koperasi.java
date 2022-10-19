import java.util.*;

class anggota{
    //menggunakan access modifier public
    public int no_anggota;
    public String nama,bagian;
    public double jumlah_pinjaman,gettotal_pinjaman;
    
    //method tanpa void
    double gettotal_pinjaman(){
        return (jumlah_pinjaman+(jumlah_pinjaman*0.05));
    }
    
    //konstruktor tanpa parameter
    //method dengan void
    void tampil(){
        System.out.println();
        System.out.println("----Koperasi Perusahaan XYZ----");
        System.out.println("No Anggota = "+this.no_anggota);
        System.out.println("Nama = "+this.nama);
        System.out.println("Bagian = "+this.bagian);
        System.out.println("Jumlah Pinjaman = "+ this.jumlah_pinjaman);
            System.out.println("Total Pinjaman (dengan bunga 5% ) = "+ gettotal_pinjaman());
    }
}

public class koperasi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        anggota a = new anggota();
        
        System.out.println("----Koperasi Perusahaan XYZ----");
        System.out.print("No Anggota = ");
        a.no_anggota = sc.nextInt();
        System.out.print("Nama = ");
        a.nama = sc.next();
        System.out.print("Bagian = ");
        a.bagian = sc.next();
        System.out.print("Jumlah Pinjaman = ");
        a.jumlah_pinjaman = sc.nextDouble();
        
        a.tampil();
    }
}

        
