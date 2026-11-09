package pkg15_loopfor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int awal, akhir;
        System.out.print("Awal  = ");
        awal = input.nextInt();
        System.out.print("Akhir = ");
        akhir = input.nextInt();
        
        for(int a = 0; a <= akhir; a++){
            System.out.println(a+". Hacking NASA with HTML...");
        }
    }
}
