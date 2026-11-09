package pkg10_operatorkondisional;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, hasil;
	System.out.print("Masukkan Angka = ");
	a = input.nextInt();
	
	hasil = a % 2;
	
	String kondisi = hasil == 1?"bilangan ganjil":"bilangan genap";
	System.out.println("Angka "+a+" adalah "+kondisi);
    }
    
}
