package pkg13_ifelsebersarang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int pil, pair;
        String menu = null;
        double price = 0, diskon = 0;
        
        System.out.println("---Sepatu---");
        System.out.println("1. Lokal\n2. Import");
        System.out.print("Pilihan\t= ");
        pil = masuk.nextInt();
        System.out.print("Pair\t= ");
        pair = masuk.nextInt();
        
        if(pil == 1){
            menu = "Sepatu Lokal";
            price = 125000;
        } else if(pil == 2){
            menu = "Sepatu Import";
            price = 200000;
        } 
        if(pair >= 10){
            diskon = 10 * (price * pair)/100;
            System.out.println("diskon 10% Rp. "+diskon);
        } else{
            System.out.println("Pembelian minimal 10 pairs");
        }
        
        System.out.println("========================");
        System.out.println("Menu Terpilih = ");
        System.out.println(menu+" - Rp."+price+" /pair");
        price = (price * pair) - diskon;
        System.out.println("Total = Rp."+price);
    }
    
}
