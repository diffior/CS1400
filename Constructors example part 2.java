//Constructors examples
class Date {
    static int day;
    public int month;
    public int year;
  
    public Date() {// Constructors 1
        this.day=16;
        this.month=3;
        this.year=2022;
    } 
    
    public Date(int day, int month, int year) { //Constructors 2022
        this.day=day;
        this.month=month;
        this.year=year;
    
        
    }
    public void dispValues() {
        System.out.println("Date "+month+ "-"+day+"-" +year);
    }

}
public class Main
{
    public static void main(String[] args) {
        Date d1=new Date(); //invoke Constructors 1
        System.out.println("Date from object 1");
        d1.dispValues();
        
        System.out.println("Date from object 2");
        Date d2=new Date(20,2,2022); //invoke Constructors 2
        d2.dispValues();
        
        //static varible it will make varible common for all the objects if the value changed it will be constant with every object in memory 
        System.out.println("Date from object 1");
        d1.dispValues();
        
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
