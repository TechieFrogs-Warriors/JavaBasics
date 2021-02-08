package Interface_Concept;

public class Program_8 
{
    //step4
    public static void main(String[] args) 
    {
        Program_8 p=new Program_8();
        Phone p1=p.getPhone();
        p1.call();
        
    }

    
    //step3
    //Defining innerclass within a method returning reference to interface
    public Phone getPhone() 
    {
        Z z=new Z();
        return z;
    }  
}
//step1
//creating interface
interface Phone
{
    void call();
}
//step2
//creating innerclass which implements interface
class Z  implements Phone
{
    public void call()
    {
        System.out.println("Iam calling on phone");
    }

}
