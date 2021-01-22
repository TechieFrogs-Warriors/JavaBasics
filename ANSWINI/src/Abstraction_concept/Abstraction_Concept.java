package Abstraction_concept;
public class Abstraction_Concept 
{
    public static void main(String[] args) 
    {
       /* Abst a=new Abst();
       System.out.println("height is:"+a.height); 
       System.out.println("name is: "+a.name);
       a.fee();
       a.fee(45);
       a.learn();
       a.display("achyuth");
       a.setAge(14);
       a.getAge(); */
       //cant create instance of abstract class
       //Abs ab=new Abs();
       //creating reference of parent abstractclass pointing to child class object
       Abs ab=new Abstracting();
       //ab.display();
       ab.fee();
       Abstracting abs=new Abst();
       abs.fee();
       abs.display();
       
    }
    
}
//senario 1:abstract variables or methods cannot be under normal class.class should be abstract.
/* class Abs
{
    String name="answini";
    abstract int age=30;
    abstract void x();
} */
abstract class Abs//a class can be abstract or final but not both
{
    //can create main method in abstract class
    public static void main(String[] args) 
    {
       Abstracting abs=new Abstracting();
       abs.display();
        // Abs ab=new Abs();cant create instance of abstract class
    }
    //nested abstract class
    abstract static class Abs2
    {
        void disp()
        {
            System.out.println("this is nested class of abstract Abs class");
        }
    }
    private int age=10;
    protected String name="aswini";
    final float height=5.5f;
    //abstract int id=1;//abstract should not be used for variables..only for class and methods
    Abs()//constructor
    {
        System.out.println("iam default constructor of abstract class");
    }
    //senario-2...abstract cannot be used to a constructor in abstract class.
    /* abstract Abs(int a)
    {

    } */
    protected Abs(int p)
    {
        System.out.println("iam parameterized constructor of abstract class");
    }
    abstract void learn();//abstract method
    protected void protect()
    {
        System.out.println("iam protected java method in abstract class");
    }
    private int num()
    {
        System.out.println("iam a private num method in abstract clas");
        return 0;
    }
    abstract int fee();//abstract method
    void display()
    {
        System.out.println("iam non-abstract method of abstract class");
    }
    //setter and getter for private variable "age" in abstract class
    void setAge(int a)
    {
        age=a;
    }
    void getAge()
    {
        System.out.println(age);
    }

}
//iInheriting abstract class
class Abstracting extends Abs
{
    void learn()//implementing parent class abstract method
    {
        String course="cloud";
        System.out.println("course i want to learn is: "+course);

    }
    int fee()
    {
        String language="java";
        int fees=150;
        System.out.println("fees for "+language+" course is:"+fees);
        return fees;
    }
    Abstracting()
    {
        System.out.println("iam child class default constructor");
    }
    void display()//overriding abstractsuperclass display method(normal)
    {
       // super.height=1.2f;//final field of abstractsuperclass cant be modified in child class
        name="aswini";
        System.out.println("child class display method(overriding parentclass display() method)");
    }
    void display(String name)//overloading abstractsuperclass display method(normal)
    {
        System.out.println("overloading parent class display method in child class: "+name);
    }
    int fee(int x)//overloading abstract fee() method of parent class
    {
        return x;
    }  
}
class Abst extends Abstracting
{
     int fee()//overriding abstractsuperclass abstractfee() method 
    {
        //super.fee();
        int fees=200;
        System.out.println("fees is:"+fees);
        return fees;
    } 
    void display()
    {
        System.out.println("iam abst method of abstracting super class");
    }

}

