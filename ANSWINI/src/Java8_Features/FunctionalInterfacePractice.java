package Java8_Features;

public class FunctionalInterfacePractice 
{
    public static void main(String[] args) 
    {
        //Normal way of creating an anonymous object for functional interface
        Calcy cobj = new Calcy()
        {
            //implementing abstract method of functional interface here
            public int sum(int a,int b)
            {
                return a+b;
            }
        };
        
        System.out.println(cobj.sum(10, 20));
        
    }
    
}


//An interface with only one abstract method is called functional interface
@FunctionalInterface //saying that this interface is functional by using annotation
interface  Calcy
{
    int sum(int a,int b); //abstract method
   // int sub(int a,int b); //throws error saying 'calcy' is not a functional interface
     
}


