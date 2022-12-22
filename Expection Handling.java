//Exception Handling
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        int[] ar ={2,4,5};
        int i, a, b, diff;
        a=10;
        b=20;
        try {
        
        //ar[5]=6;
       // i=0/0;
        diff=a-b;
        if(diff<0) {
            throw new Exception("negative number");
         }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Accessing index out of range");
            }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic issues");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        
        
    }
}
