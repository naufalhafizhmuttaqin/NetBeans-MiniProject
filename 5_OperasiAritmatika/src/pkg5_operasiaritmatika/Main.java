package pkg5_operasiaritmatika;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a, b, c;
       
       System.out.print("Masukkan Nilai a = ");
       a = input.nextInt();
       System.out.print("Masukkan Nilai b = ");
       b = input.nextInt();
       
       c = a + b;
       System.out.print(a+" + "+b+" = ");
       System.out.println(c);
       
       c = a - b;
       System.out.print(a+" - "+b+" = ");
       System.out.println(c);
       
       c = a * b;
       System.out.print(a+" x "+b+" = ");
       System.out.println(c);
       
       c = a / b;
       System.out.print(a+" / "+b+" = ");
       System.out.println(c);
       
       c = a % b;
       System.out.print(a+" % "+b+" = ");
       System.out.println(c);
    }
    
}
