class Student{
//made two varibles    
String name;
int stdID;
public void setValues(String name,int stdID) { 
    this.name=name;
    this.stdID=stdID;
}
public void getName() {
    System.out.println(name);
}    
public void getstdID() {
    System.out.println(stdID);
}     
// Whatever is in the () needs a data type!!
// this. shows the varible belongs to the obj    
 }


public class Main
{
    public static void main(String[] args) {
        //creating object
        Student S1=new Student();
        Student S2=new Student();
        S1.setValues("Lee",1);
        S2.setValues("Hector",2);
        S1.getName();
        S2.getName();
        
    
        //System.out.println();
    }
}
