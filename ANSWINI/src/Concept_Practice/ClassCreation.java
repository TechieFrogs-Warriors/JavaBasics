public class ClassCreation 
{
    public static void main(String[] args) 
    {
        Student obj=new Student();
        obj.name="John";
        obj.roll_no=2;
        System.out.println(obj.name+" "+obj.roll_no); 
    }
    
}
class Student
{
    String name;
    int roll_no;
}
