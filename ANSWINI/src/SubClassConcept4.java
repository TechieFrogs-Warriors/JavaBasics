public class SubClassConcept4 
{
    public static void main(String[] args) 
    {
        System.out.println(A.getName());
        System.out.println(B.getName());
        A obj=new B();//parent class object refering to child class.
        System.out.println(obj.getName());
        
    }
    
} 
class A
{
    static String getName()
    {
        String name="PARENT";
        return name;
    }
}
class B extends A
{
    static String getName()
    {
        String cName="CHILD";
        return cName;
    }
} 

