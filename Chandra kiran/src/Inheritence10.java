class Apple
{
    int number_of_items=300;
    void show()
    {
        System.out.println(number_of_items);
    }

}
class Banana extends Apple
{
    int number_of_items=700;
    Banana()
    {
          
    }
   void show()
   {
       super.show();
       
       System.out.println(number_of_items);
       
   }

}

public class Inheritence10 
{
    public static void main(String[] args) 
    {
        Banana obj = new Banana();
        obj.show();
        
    }

    
}
