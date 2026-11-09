package pkg14_switchcase;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("===Menu===");
        System.out.println("1. Male\n2. Female");
        System.out.print("Choose = ");
        int pil = masuk.nextInt();
        
        switch(pil){
            case 1:
                System.out.println("Male");
                break;
            case 2:
                System.out.println("Female");
                break;
            default:
                System.out.println("Wrong answer");
        }
    }
    
}
