package Assignment_Inheritance;

public class Program10 
{
    public static void main(String[] args) 
    {
        Banana b=new Banana();
        b.show();//displays values of number of items of both super and subclass here
    }
    
}
class Apple
{
    int number_of_items=10;
}
class Banana extends Apple
{
    int number_of_items;
    Banana()
    {
        number_of_items=5;
        
    }
    void show()
    {
        System.out.println("bananas : "+number_of_items);
        System.out.println("Apples : "+super.number_of_items);//super class numberofitems called by super.
    }
}
