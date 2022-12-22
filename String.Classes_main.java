import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        
        String S1 = "MSU Denver";
        String S2 = "msu denver";
        
        char c = S1.charAt(5);
        int index= S1.indexOf('e',2);
        System.out.println(S1.equals(S2));
        System.out.println(S1.equalsIgnoreCase(S2));
        System.out.println(S1.substring(4)); // This based off the length so it goes 1,2,3,4 no 0,1,2,3
        System.out.println(S1.substring(0,3)); // Will find find letters 0 and 3 MSU
        System.out.println(c);
        
        
    
    }
}
