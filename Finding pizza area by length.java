import java.util.Scanner;

public class Main
{
    public static double calcPArea(double size) {
        double pArea;
        final double PI=3.14;
        double pDiameter=size;
        double pRadius=pDiameter/2;
        pArea=PI*pRadius*pRadius;
      
         return pArea;
  
    }
     public static void main(String[] args) {
         
  
         double sz;
         sz=12.0;
         
         System.out.println("Area of a 12 inch pizza is "+calcPArea(sz));
} }
