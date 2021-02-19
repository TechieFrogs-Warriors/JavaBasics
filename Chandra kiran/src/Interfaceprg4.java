interface Sample1
{
    int a=50;
    String b;
    void concatinate(int a,String b);
}
class Children implements Sample1
{
    public void concatinate(int a,String b)
    {
         String s=a+b;
         System.out.println(s);

    }
}
public class Interfaceprg4 
{
    public static void main(String[] args) 
    {
        
        Sample1.a=60;
        Sample1.b="print";
        
        
    }
    
}
