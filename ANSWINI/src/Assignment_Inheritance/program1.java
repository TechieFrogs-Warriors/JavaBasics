package Assignment_Inheritance;

public class program1 
{
    public static void main(String[] args) 
    {
        Parent p=new Parent();
        p.display();
        Child ch=new Child();
        ch.displayChild();
        ch.display();
        
    }
    
}
class Parent
{
    void display()
    {
        System.out.println("THIS IS PARENT CLASS");
    }
}
class Child extends Parent
{
    void displayChild()
    {
        System.out.println("THIS IS CHILD CLASS");
    }

}
