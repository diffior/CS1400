import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int x;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Number of Strokes" );
    x = obj.nextInt();
    
    if (x <= 0)
    System.out.println("Your Stroke is invaild " + x);
    
    else if (x == 1)
    System.out.println("Your Stroke is Hole in 1 " );
    
    else if (x == 2)
    System.out.println("Your Stroke is Eagle " );
    
    else if (x == 3)
    System.out.println("Your Stroke is Bogey"  );
    
    
    
    }
}