import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
    Scanner obj =new Scanner (System.in);
    

    int usrInput= 1;
    
    while(!(usrInput>=5 && usrInput<=15))
    {
        System.out.println("Enter Number");
        usrInput=obj.nextInt();
    }
    
    System.out.println("Value is " +usrInput);
    
    }
}
