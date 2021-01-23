class Even 
{
   void even(int t) 
   {
      while (t < 10) 
      {
          if (t % 2 == 0) 
          {
              System.out.println("Even " + t);

          }

          t++;
      }

  }
}

class Odd extends Even 
{
  void odd(int s) 
  {
      while (s < 10) 
      {
          if (s % 2 == 1) 
          {
              System.out.println("Odd " + s);

          }
          s++;
      }
  }
}

class Numeric extends Even 
{
  void num(int w) 
  {
      while (w > 10 && w < 20) 
      {
          System.out.println("Number " + w);
          w++;
      }
  }
}

public class HierarchicalInheritence 
{
  public static void main(String[] args) 
  {
      Numeric Obj = new Numeric();
      // Odd Obj1 = new Odd();
      Obj.even(2);
        Obj.num(11);
       // Obj.Division(4000, 200);
        //Obj.Subtract(2000, 500);
      //  Obj1.odd(1);
      //  Obj1.even(2);

    }
}
