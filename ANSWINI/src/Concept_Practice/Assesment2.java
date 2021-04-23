public class Assesment2 
{
    //static subclass of Assesment2
    
    public static void main(String[] args) 
    {
        A10.print();//parent method
        B10.print();//child method
        A10 obj=new B10();//parent class object is reffering to child class
        obj.print();//prints parent class method
    }
    //parent class
    static class A10
    {
        //static method of class A
        static void print()
        {
            System.out.println("this is parent");
        }

    }
    //subclass of class A
    static class B10 extends A10
    {
        //static method of class B
        static void print()
        {
            System.out.println("this is child");
        }
    }
    
}




