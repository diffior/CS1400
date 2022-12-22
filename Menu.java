import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number 1-5");
        int UserInput = obj.nextInt();
        
        for(int i=0; i < UserInput; i++)
        
        switch(UserInput)
        {
            case 1:
                System.out.println("1 is Circle");
                break;
            case 2:
                System.out.println("2 is Sqaure");
                break;
            case 3:
                System.out.println("3 Rectangle");
                break;
            case 4:
                System.out.println("4 Triangle ");
                break;
            case 5:
                System.out.println("5 Exit");
                break;
            default:
                System.out.println("Not valid");
        }

    }
}

       