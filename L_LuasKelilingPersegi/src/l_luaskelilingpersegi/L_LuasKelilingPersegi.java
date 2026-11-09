package l_luaskelilingpersegi;
import java.util.Scanner;
public class L_LuasKelilingPersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, L, K;
        System.out.print("Masukkan sisi = ");
        s = input.nextInt();
        L = s * s;
        K = 4 * s;
        
        System.out.println("Luas = "+L);
        System.out.println("Keliling = "+K);
       
    }
    
}
