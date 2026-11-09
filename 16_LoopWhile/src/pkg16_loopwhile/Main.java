package pkg16_loopwhile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int awal, akhir;
        System.out.print("Awal  = ");
        awal = input.nextInt();
        System.out.print("Akhir = ");
        akhir = input.nextInt();
        
        while(awal <= akhir){
            System.out.println(awal+". Hacking NASA with HTML...");
            awal++;
        }
    }
}
