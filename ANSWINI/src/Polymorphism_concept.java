public class Polymorphism_concept 
{
    public static void main(String[] args) 
    {
        //METHOD OVERLOADING CONCEPT
       // No_Of_parameters n=new No_Of_parameters();
        No_Of_parameters.disp('a');
        No_Of_parameters.disp('b',15);
        Diff_Parameter_Datatypes d=new Diff_Parameter_Datatypes();
        d.disp('x');//private method 
        d.disp(185);//overloading private method with different datatype
        Seq_change_parameter s=new Seq_change_parameter();
        s.disp('a',10);
        s.disp(15,'m');
        Type_Promotion t=new Type_Promotion();
        t.disp(10, 20.587f);
        t.disp(30,48712, 12345789);
        //METHOD OVERRIDING CONCEPT
        Boy b=new Boy();
        b.eat();
        Human h=new Human();
        h.eat();
        //dynamic method dispatch or runtime polymorphism
        Human h1=new Boy();
        h1.eat();
        b.eat("Apple");
    }
    
}
//METHOD OVERLOADING CONCEPT
//valid cases of Method Overloading
class No_Of_parameters
{
    protected static void disp(char c)
    {
        System.out.println(c);
    }
    public static void disp(char c, int num)  
    {
        System.out.println(c +" "+ num);
    }
}
class Diff_Parameter_Datatypes
{
    private void disp(char c)
    {
        System.out.println(c);
    }
    void disp(int c)
    {
       System.out.println(c);
    }
}
class Seq_change_parameter
{
    void disp(char c, int num)
    {
       System.out.println("I’m the sequence of parameters of method disp");
    }
    void disp(int num, char c)
    {
       System.out.println("I’m the reverse sequence of parameters of method disp" );
    }
}
class Type_Promotion
{
    void disp(int a, double b)
    {
        System.out.println("First disp Method "+a+b);
    }
    void disp(int a, double b, long c)
    {
        System.out.println("Second disp Method "+(c-b-a));
    }

}
//Invalid case of Method overloading
/* class Invalid_M_Load
{
   public double myMethod(int num1, int num2)
    {
      System.out.println("First myMethod of class ");
      return num1+num2;
    }
    int myMethod(int a, int b)
    {
      System.out.println("Second myMethod of class ");
      return a-b;
    }
} */

//METHOD OVERRIDING CONCEPT
class Human
{
    //Overridden method
    public void eat()
    {
       System.out.println("Human is eating");
    }
    
}
class Boy extends Human
{
    //Overriding method
    public void eat()
    {
       // super.eat();//if parent class overriden method should be accessed
        System.out.println("Boy is eating");
    }
    void nature()
    {
        System.out.println("kind at heart");
    }
    //method overloading can also be done in child class
    void eat(String a)
    {
        System.out.println("through inheritance overloading also can be done: "+a);
    }
}
//abstract methods also can be overrided and overloaded
abstract class Display
{
    abstract void add();
}
class Disp extends Display
{
    void add()//overriding abstract add() method
    {
        int a=4,b=6;
        int c=a+b;
        System.out.println("sum is: "+c);
    }
    void add(int a,int b)//overloading abstract add() method
    {
        a=5;b=8;
        int c=b-a;
        System.out.println("difference is"+c);
    }
}
//final class  can be overloaded but not overrided
//static methods cannot be overrided or overloaded
