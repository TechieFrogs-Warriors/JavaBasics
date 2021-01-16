class Student2
{
    String name,address;
    int rollno;
    long Phoneno;

}
public class ClassObj2 
{
    public static void main(String[] args) 
    {
        Student2 obj1= new Student2();
        obj1.name="Sam";
        obj1.rollno=7;
        obj1.address="Vizag";
        obj1.Phoneno=8669759595l;
        Student2 obj2= new Student2();
        obj2.name="John";
        obj2.rollno=8;
        obj2.address="Hyderabad";
        obj2.Phoneno=8797585848l;
        System.out.println("Name "+obj1.name + " rollno " + obj1.rollno + " address " + obj1.address + " Phoneno " + obj1.Phoneno );
        System.out.println("Name "+obj2.name + " rollno " + obj2.rollno + " address " + obj2.address + " Phoneno " + obj2.Phoneno ); 
        
        
    }
    
}
