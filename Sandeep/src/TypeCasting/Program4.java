package TypeCasting;
/*Child class is the smaller type we are assigning
 it to Parent class type which is a larger type hence
  no casting is required.*/
class Parent
{
    void display()
    {
        System.out.println("Parent display method");
    }
}
public class Program4 extends Parent{
    public static void main(String[] args) {
        
        Parent obj=new Program4();
        obj.display();
    }
    
}
