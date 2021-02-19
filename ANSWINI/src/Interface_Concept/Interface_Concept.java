package Interface_Concept;

public class Interface_Concept 
{
    public static void main(String[] args) 
    {
        //One o=new One();//cannot instantiate interface
        Actual a=new Actual();
        a.profile();
        a.jobDetails();;
        a.show();
        a.address();
        a.tt.display();//calling method inside a classTwo2 whic is inside an interfaceTwo 
        
    }
    
}

interface One
{
    //compiler takes methods in interface abstract method by default.we cant implement method in interface
    /* void show()
    {

    } */

    //new functionality can be added to interface by using "default" without breaking contract
    default void show(){}

    int id=1;//variables by default static and final in interface

    //interfaces cannot have constructors
    /* public One()
    {

    } */

    //can use a main method in interface
    /* public static void main(String[] args) {
        
    } */
}
interface Two
{
    public String profile();
    //protected String name="answini";//no other access modifiers are accepted except static or final
    abstract void jobDetails();

    //default void show(){}//duplicate default method in another interface

    //abstract class can be created in interface
    abstract class Two1
    {
        void personal()
        {
            System.out.println("this is abstract class inside interface two ");
        }
        //can create interface within abstract class
        interface Three
        {
            void display();
        }
    }
    //can create interface in interface
    interface Four
    {
        void address();

    }
    //normal class is created in interface but only public ,static and final
    class Two2
    {
        void display()
        {
            System.out.println("iam normal class Two2 inside interface two");
        }
    }
    
}

//Tag or Marker interface is the one without any methods(Five) is marker interface
//State and behaviuor of 'One' and 'Two' interfaces are extended to interface 'Five'
interface Five extends One,Two,Two.Four//two.four..outerinterface.innerinterface
{
   
}
class Actual implements Five
{
    public void show()
    {
        System.out.println("iam show method from interface One impemented in class Actual");
    }
    public void jobDetails()
    {
        System.out.println("iam abstract jobdetails() of interface Two implemented in class Actual");
    }
    public String profile()
    {
        System.out.println("iam profile() from interface Two implemented in class Actual");
        return "";
    }
    public void address()
    {
        System.out.println("iam interface Two's inner interface 'four' address method");
    }
    //creating instance for normal classTwo2 inside interfaceTwo
    Two.Two2 tt=new Two.Two2();

}

