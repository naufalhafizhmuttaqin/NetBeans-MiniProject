package oop;

//class
class Karyawan{
    String nama;
    int IDK;
    String jabatan;
    double Score;
    
    //constructor with parameter
    Karyawan(String nama, int IDK, String jabatan, double Score){
        this.nama = nama;
        this.IDK = IDK;
        this.jabatan = jabatan;
        this.Score = Score;
    }
    
    //method tanpa return & parameter
    void tampil(){
        System.out.println("Nama    = "+this.nama);   
        System.out.println("IDK     = "+this.IDK);
        System.out.println("Jabatan = "+this.jabatan);
        System.out.println("Score   = "+this.Score);
    }
    
    //method tanpa return dengan parameter
    void gantiData(String nama, int IDK, String jabatan, double score){
        this.nama = nama;
        this.IDK = IDK;
        this.jabatan = jabatan;
        this.Score = score;
    }
    
    //method dengan return tanpa parameter
    String getData(){
        return this.nama;
    }
    int getIDK(){
        return this.IDK;
    }
    
    //contoh penggunaan metode overloading
    public static String kar(String nama, String jabatan){
        return nama+" adalah "+jabatan;
    }
}

public class OOP {

    public static void main(String[] args) {
        //object
        Karyawan karyawan1 = new Karyawan("Ucok",12345,"CEO",4.8);
        
        //pemanggilan atribut dan metode-metode dari objek
        karyawan1.tampil();
        System.out.println("");
        
        //menampilkan dan mengganti data awal
        karyawan1.gantiData("Asep", 54321, "HRD", 3.8);
        karyawan1.tampil();
        System.out.println("");
        
        //menampilkan 1 data saja
        System.out.println(karyawan1.getData());
        System.out.println(karyawan1.getIDK());
        
        //pemanggilan metode overloading
        System.out.println("");
        String a = Karyawan.kar("Ucok", "CEO");
        System.out.println(a);
    }
}
