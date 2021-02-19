package TypeCating_Concept;

public class Upcasting_Practice 
{
    public static void main(String[] args) 
    {
        //general creation of subclass object
        Apple ap=new Apple();//Here 'ap' is an object referencing to subclass Apple 
        //upcasting(creating reference by casting subclass object to superclass) 
        Mobile m=(Mobile)ap;
        m.calling();//calls subclass method because its overriding
        m.messaging();//calls superclass method beacause its not overridden
        //Mobile m=new Apple();
        //m.calling();//calls subclass method because overrided
        //remaining subclass cant be seen here with upcasting itself with super class reference 

        
        //Another way of upcasting
        Features feat=new Features();
        feat.tecnology(ap);
        
        
    }
    
}
//superclass
class Mobile
{
    public static int value=100;
    public String name="Aswini";

    void calling()
    {
        System.out.println("Iam superclass calling method");
    }
    void messaging()
    {
        System.out.println("Iam superclass messaging method");
    }
}
//subclass
class Apple extends Mobile
{
    void calling()
    {
        System.out.println("Iam subclass calling method");
    } 
    void camera()
    {
        System.out.println("Apple phone camera is good");
    }
    void security()
    {
        System.out.println("Apple phone security is ultimate");
    }
    
}
//Another way of Upcasting and Downcasting
//passing a class and its object as a parameter to a method,so that this class can call that class methods
class Features 
{
    //first upcasting is done here
    void tecnology(Mobile m)
    {
        m.calling();//mobile (super) class method
        m.messaging();//mobile (super) class method

        //Next downcasting process is done here
        if(m instanceof Apple)
        {
            Apple a=(Apple)m;
            a.security();//Apple (child) class method
            a.camera();//Apple (child) class method
        
        }
       
    }
    
}
