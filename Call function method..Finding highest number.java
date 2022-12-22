import java.util.Scanner;

public class Main
{
    public static double high(double x,double y) {
        double h;
        if(x>=y)
          h=x;
        else
         h=y;
         
         return h;
  
    }
     public static void main(String[] args) {
         double num1,num2;
         num1=5.5;
         num2=6.3;
         double h=high(num1,num2);
         
         System.out.println("Highest is"+h);
} }
