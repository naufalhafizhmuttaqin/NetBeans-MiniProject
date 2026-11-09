package pkg3_escapesquences;

public class Main {

    public static void main(String[] args) {
        String nama = "Ucok";
        int umur = 19;
        double bb = 60.5;
        
        /*
        
         \t -> tab
         \n -> enter
         \b -> backspace
        
        */
        System.out.println("skjdfjhsfs\b");
        
        System.out.println("Nama \t\t= "+nama);
        System.out.println("Umur \t\t= "+umur);
        System.out.println("Berat Badan \t= "+bb);
        
        System.out.print("\n");
        
        System.out.println("Nama \t\t= "+nama+"\nUmur \t\t= "+umur);
        System.out.println("Berat Badan \t= "+bb);
    }
    
}
