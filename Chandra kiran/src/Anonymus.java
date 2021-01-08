abstract class G
{
   abstract void run();
}
public class Anonymus 
{
    public static void main(String[] args) 
    {
       G Obj= new G()
       {
           void run()
           {
            System.out.println("Print the class");
           }
       };
       Obj.run();
    }
}
