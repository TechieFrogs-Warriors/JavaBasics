package StringsConcept;

public class Program5_6_7 
{
    public static String s1=new String("hai");
    public static String s2=new String("hai");
    public static void main(String[] args) 
    {
        System.out.println("hello"=="hello");//comparing two strings directly
        System.out.println(s1==s2);//comparing two strings through objects using "=="
        System.out.println(s1.equals(s2));//comparing two strings through objects using "equals method"
        
    }
    
}
