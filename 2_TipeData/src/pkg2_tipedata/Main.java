package pkg2_tipedata;

public class Main {

    public static void main(String[] args) {
         /*
        Tipe Data
        Angka
            integer        -> int    = bilsngsn bulat 
            floating point -> float  = bilangan koma
            double         -> double = bilangan koma (lebih banyak)
        Teks
            string         -> kata/kalimat (saya sedang makan)
            char           -> karakter (A,B,-,+)
        Boolean
            bool           -> true/false (1/0)
        
        Variabel
        */
        
        //TIPE DATA
        int umur = 19;
        System.out.println("Umur = "+umur+" tahun");
        
        float berat = (float) 65.5;
        System.out.println("Berat badan = "+berat+" kg");
        
        double tinggi = 167.511285963;
        System.out.println("Tinggi badan = "+tinggi+" cm");
        
        //TEKS
        String nama = "Ucok";
        System.out.println("Nama = "+nama);
        
        char gender = 'L';
        System.out.println("Gender = "+gender);
        
        boolean sehat = true;
        System.out.println("Kesehatan = "+sehat);
    }
    
}
