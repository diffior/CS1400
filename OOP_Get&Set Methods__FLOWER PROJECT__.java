class Flowers{
//made two varibles    
String name;
int amount;
String color;
public void setValues(String name,int amount,String color) { 
    this.name=name;
    this.amount=amount;
    this.color=color;
}
public void getName() {
    System.out.println(name);
}    
public void getamount() {
    System.out.println(amount);
} 
public void getcolor() {
    System.out.println(color);
}
// Whatever is in the () needs a data type!!
// this. shows the varible belongs to the obj    
 }


public class Main
{
    public static void main(String[] args) {
        //creating object
        Flowers C1=new Flowers();
        Flowers C2=new Flowers();
        C1.setValues("Rose",12,"Red");
        C2.setValues("Bluebell",30,"Blue");
        C1.getName();
        C1.getamount();
        C1.getcolor();
        
        
    
        //System.out.println();
    }
}