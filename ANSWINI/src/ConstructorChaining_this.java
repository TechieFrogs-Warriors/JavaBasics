public class ConstructorChaining_this 
{
    //here we are using same constructor name but with different parameters.its CONSTRUCTOR OVERLOADING
    ConstructorChaining_this()
    {
        /*control came here and prints because no this keyword to check further
        and again flows back in sequence through which path control came till here*/
        System.out.println("NO ARGUMENTS CONSTRUCTOR IS CALLED");
    }
    ConstructorChaining_this(int number)
    {
        this();//secondly control is here and again checks this keyword.
        System.out.println("SINGLE ARGUMENT CONSTRUCTOR IS CALLED");
    }
    ConstructorChaining_this(String name,int salary)
    {
        this(10);//first control comes here and checks this keyword.
        System.out.println("MULTIPLE ARGUMENTS CONSTRUCTOR IS CALLED");
    }
    ConstructorChaining_this(int salary,String name)
    {
        this("Answini", 25000);
        System.out.println("SEQUENCE OF MULTIPLE ARGUMENTS IS CHANGED IN CONSTRUCTOR");
    }
    public static void main(String[] args) 
    {
        ConstructorChaining_this obj=new ConstructorChaining_this("vedansh",10);
        //control starts from that constructor depending on argument values passed 
    } 
}
