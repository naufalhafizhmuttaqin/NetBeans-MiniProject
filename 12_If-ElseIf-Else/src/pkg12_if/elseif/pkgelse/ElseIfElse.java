package pkg12_if.elseif.pkgelse;
import java.util.Scanner;
public class ElseIfElse {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Total Belanja = ");
         float total = input.nextInt();
         
         if(total >= 500000){
            System.out.println("Diskon 20%");
            float diskon = 20 * total / 100;
            total -= diskon;
            System.out.println("Setelah Diskon = "+total);
         } else if(total >= 300000){
            System.out.println("Diskon 15%");
            float diskon = 15 * total / 100;
            total -= diskon;
            System.out.println("Setelah Diskon = "+total);
         } else{
            System.out.println("Tidak Diskon");
         }
    }
    
}
