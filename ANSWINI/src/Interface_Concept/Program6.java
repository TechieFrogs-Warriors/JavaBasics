package Interface_Concept;

public class Program6 
{
    public static void main(String[] args) 
    {
        Women m=new Women();
        m.display("answini");
        m.disp("java");
        m.add(2);
        m.subtract(4);
        m.experience(5);
        m.salary(25000);
        m.newMeth("manager");  
    } 
}
interface One_One
{
    void display(String name);
    void disp(String course);
}
interface Two_Two
{
    int add(int a);
    int subtract(int b);
}
interface Three_Three
{
    void experience(int years);
    void salary(int sal);
}
//new interface extending three interfaces
interface Mix extends One_One,Two_Two,Three_Three
{
    void newMeth(String post);
    
}
//concrete class is women.
class Women implements Mix
{
    public void display(String name)
    {
        System.out.println("Name is: "+name);
    }
    public void disp(String course)
    {
        System.out.println("course iam learning is: "+course);
    }
    public int add(int a)
    {
        System.out.println("this is second interface addvalue: "+a);
        return a;
    }
    public int subtract(int b)
    {
        System.out.println("this is second interface subtractvalue: "+b);
        return b;
    }
    public void experience(int years)
    {
        System.out.println("my experience : "+years);
    }
    public void salary(int sal)
    {
        System.out.println("my salary is: "+sal);
    }
    public void newMeth(String post)
    {
        System.out.println("my post is: "+post);
    }
}

