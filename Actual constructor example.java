//Constructors examples
class Date {
    public int day;
    public int month;
    public int year;
  
    public Date() {// Constructors 1
        this.day=16;
        this.month=3;
        this.year=2022;
        
    }
    public void dispValues() {
        System.out.println("Date "+month+ "-"+day+"-" +year);
    }

}
public class Main
{
    public static void main(String[] args) {
        Date d1=new Date();
        d1.dispValues();
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
