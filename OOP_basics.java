class Student{
//made two varibles    
String name;
int stdID;
public void getName() { 
 System.out.println(name);
 }
}

public class Main
{
    public static void main(String[] args) {
        //creating object
        Student S1=new Student();
        S1.name="Rob";
        S1.stdID=1;
        Student S2=new Student();
        S2.name="Mary";
        S2.stdID=2;
        S2.getName();
        //System.out.println();
    }
}
