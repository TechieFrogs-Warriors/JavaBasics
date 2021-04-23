public class ClassObject2 
{
    public static void main(String[] args) 
    {
        Studentx obj=new Studentx();
        obj.name="Sam";
        obj.roll_no=1;
        obj.phone_no=12345;
        obj.address="Vijayawada";
        System.out.println(obj.name+" "+obj.roll_no+" "+obj.phone_no+" "+ obj.address);
        Studentx obj1=new Studentx();
        obj1.name="John";
        obj1.roll_no=1;
        obj1.phone_no=21458;
        obj1.address="Hyderabad";
        System.out.println(obj1.name+" "+obj1.roll_no+" "+obj1.phone_no+" "+ obj1.address);
        
    }
    
}
class Studentx
{
    String name;
    int roll_no;
    int phone_no;
    String address;
}
