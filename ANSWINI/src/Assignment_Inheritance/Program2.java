package Assignment_Inheritance;

public class Program2 
{
    
    public static void main(String[] args) 
    {
        Program2 p=new Program2();
        p.display();
        Child ch=new Child();
        ch.displayChild();
       // ch.display();//cant access by parent method because its private
    }
    private void display()
    {
        System.out.println("THIS IS PARENT CLASS");
    }
    
}
class Child2 extends Program2
{
    void displayChild()
    {
        System.out.println("THIS IS CHILD CLASS");
    }

}
    

