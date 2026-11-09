package pkg7_incrementdecrement;

public class Main {

    public static void main(String[] args) {
        /*
        
            post increment a++ (same thing with decrement)
            pre increment ++a  (same thing with decrement)
    
        */
        int a;
        int i = 5;
        a = i++;
        
        /*
            post a = i; i = i +1;
            pre  i = i + 1; a = i;
        */
        
        System.out.println(a);
        System.out.println(i);
    }
    
}
