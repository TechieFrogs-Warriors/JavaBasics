/*final class E
{
   void num()
    {
        System.out.println("print the class");
     }
}*/
 class Concrete
{
  static int addition(int a, int b )
 {
    return a+b;
 }
}

class Pojo 
{
    private int f=5000;
    public int getf()
    {
        return f;

    }
    public int setf(int f)
    {
        
        return f;
    }

}
public class Classes
{
public static void main(String[] args) 
{
       //  E Obj1 = new E();
      //  Obj1.num();;
       // int c=addition(30,70);
       // System.out.println(c);
        Pojo Obj2 = new Pojo();
        System.out.println(Obj2.getf());
        
    
    }
}
