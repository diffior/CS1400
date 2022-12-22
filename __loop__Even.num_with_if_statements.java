public class Main
{
    public static void main(String[] args) {
    int count = 2;
    
    while(count<= 50)
    {
        if((count%2)==0)
        System.out.println(count);
        count++;
    }
    
    System.out.println("Outside the loop");
    }
}
