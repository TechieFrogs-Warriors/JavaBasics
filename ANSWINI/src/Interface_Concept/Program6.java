package Interface_Concept;
//creating interfaces
interface One_One
{
    void display();
    void disp();
}
interface Two_Two
{
    void add();
    void subtract();
}
interface Three_Three
{
    void experience();
    void salary();
}
//new interface extending three interfaces
interface Mix extends One_One,Two_Two,Three_Three
{
    void newMeth();
    
}
//concrete class have all its methods
class Doctor 
{
	private int i = 0;
	public void doc() {}
}
//class extending  aconcrete class and implementing an interface
class Women  extends Doctor implements Mix
{
    public void display()
    {
        System.out.println("Name is:aswini ");
    }
    public void disp()
    {
        System.out.println("course iam learning is: java ");
    }
    public void add()
    {
        System.out.println("this is second interface addvalue: sum ");
    }
    public void subtract()
    {
        System.out.println("this is second interface subtractvalue: difference");
    }
    public void experience()
    {
        System.out.println("my experience : 4years ");
    }
    public void salary()
    {
        System.out.println("my salary is: 50000");
    }
    public void newMeth()
    {
        System.out.println("my post is: manager");
    }
}
//driver class with main method
public class Program6 
{
    public static void m1(One_One name)
    { 
        name.display();; 
    }
	public static void m2(Two_Two exam) 
    { 
        exam.add(); 
    }
	public static void m3(Three_Three details) 
    { 
        details.salary(); 
    } 
	public static void m4(Mix workup) 
    { 
        workup.newMeth(); 
    }
    public static void main(String[] args) 
    {
		Women obj = new Women();
		m1(obj);
		m2(obj);
		m3(obj);
		m4(obj);
	}
}