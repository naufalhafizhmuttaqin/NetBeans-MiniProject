package pkg11_ifelse;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Total Belanja = ");
         float total = input.nextInt();
         
         if(total >= 100000){
             System.out.println("Diskon 10%");
             float diskon = 10 * total / 100;
             total -= diskon;
             System.out.println("Setelah Diskon = "+total);
         } else{
             System.out.println("Tidak Diskon");
         }
    }
    
}
