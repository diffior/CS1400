class Flowers{
//made two varibles    
String name, color;
int amount;
public void setValues(String name,int amount,String color) { 
    this.name=name;
    this.amount=amount;
    this.color=color;
}
public void getName() {
    System.out.println("Name of the flower are " + name);
}    
public void getamount() {
    System.out.println("Amount ordered "+ amount);
} 
public void getcolor() {
    System.out.println("Color is " + color);
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
        C1.setValues("Roses",12,"Red");
        C2.setValues("Bluebells",30,"Blue");
        C1.getName();
        C1.getamount();
        C1.getcolor();
        C2.getName();
        C2.getamount();
        C2.getcolor();
        
        
        
    
        //System.out.println();
    }
}