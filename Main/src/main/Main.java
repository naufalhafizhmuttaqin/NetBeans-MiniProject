package main;

class Pegawai {
    String nama;
    int idPegawai;
    int gaji;

    public Pegawai(String nama, int idPegawai, int gaji) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gaji = gaji;
    }

    public void menampilkan() {
        System.out.println("Nama: " + this.nama);
        System.out.println("ID Pegawai: " + this.idPegawai);
        System.out.println("Gaji: " + this.gaji);
    }
}

class Manager extends Pegawai {
    public Manager(String nama, int idPegawai) {
        super(nama, idPegawai, 7000000);
    }

    public void tugas() {
        System.out.println("Melakukan manajemen untuk franchise");
        System.out.println("");
    }

 
    public void menampilkan() {
        super.menampilkan();
        System.out.println("Tugas: Manajer");
    }
}

class Kasir extends Pegawai {
    public Kasir(String nama, int idPegawai) {
        super(nama, idPegawai, 1000000);
    }

    public void tugas() {
        System.out.println("Melakukan transaksi dengan pembeli");
        System.out.println("");
    }

 
    public void menampilkan() {
        super.menampilkan();
        System.out.println("Tugas: Kasir");
    }
}

class Koki extends Pegawai {
    public Koki(String nama, int idPegawai) {
        super(nama, idPegawai, 2000000);
    }

    public void tugas() {
        System.out.println("Memasakkan makanan dan membuat minuman");
        System.out.println("");
    }


    public void menampilkan() {
        super.menampilkan();
        System.out.println("Tugas: Koki");
    }
}

class Pelayan extends Pegawai {
    public Pelayan(String nama, int idPegawai) {
        super(nama, idPegawai, 1000000);
    }

    public void tugas() {
        System.out.println("Melayani dan menyajikan pesanan dari pembeli");
        System.out.println("");
    }

 
    public void menampilkan() {
        super.menampilkan();
        System.out.println("Tugas: Pelayan");
    }
}

class Satpam extends Pegawai {
    public Satpam(String nama, int idPegawai) {
        super(nama, idPegawai, 1000000);
    }

public void tugas() {
    System.out.println("Menjaga keamanan didalam dan diluar franchise");
    System.out.println("");
}


public void menampilkan() {
    super.menampilkan();
    System.out.println("Tugas: Satpam");
}
}

public class Main {
public static void main(String[] args) {
    Manager man1 = new Manager("Hafizh", 01);
    man1.menampilkan();
    man1.tugas();

    Kasir kas1 = new Kasir("Ucok", 02);
    kas1.menampilkan();
    kas1.tugas();
    
    Koki kok1 = new Koki("Asep", 03);
    kok1.menampilkan();
    kok1.tugas();
    
    Pelayan pel1 = new Pelayan("Madun", 04);
    pel1.menampilkan();
    pel1.tugas();
    
    Satpam sat1 = new Satpam("Ucup", 05);
    sat1.menampilkan();
    sat1.tugas();
    }
}
