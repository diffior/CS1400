//Constructors examples
class Date {
    int day;
    int month;
    int year;
    
    public void setValues(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void disValues() {
        System.out.println("Date "+month+ "-"+day+"-" +year);
    }

}
public class Main
{
    public static void main(String[] args) {
        Date d1=new Date();
        d1.setValues(12, 3 ,2022);
        System.out.println("Date "+d1.month+ "-"+d1.day+"-" +d1.year);
        //System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
