import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double v1;    
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter Ph level range 0.0 - 14.0 ");
    v1 = obj.nextDouble();
    
    if(v1>= 0.0 && v1<=2.9)
       System.out.println("Very Acidic");
     else if(v1>=3.0 && v1<=6.9)
       System.out.println("Acidic");
     else if(v1==7.0)
       System.out.println("Neutral");
     else if(v1>7.0 && v1<=11.9)
       System.out.println("Alkaline");
     else if(v1>=12.0 && v1<=14.0)
       System.out.println("Very Alkaline");
     else
       System.out.println("Number has to be 0.0 - 14.0 !!!! ");
      
    
    }
}
