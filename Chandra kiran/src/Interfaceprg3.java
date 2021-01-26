import Interface.*;
class Red implements Packet
{
    
    public void Addition() 
    {
        int a=70,b=90,c;
        c=a+b;
        System.out.println("Addition "+c);
    
    }
    public void Multiply1()
    {
        int d=60,e=80,f;
        f=d*e;
       System.out.println("Multiplication "+f);
    }
    public void Division1()
    {
        int g=800,h=40,i;
        i=g/h;
        System.out.println("Division "+i);
    }

}
    

public class Interfaceprg3 
{
    public static void main(String[] args) 
    {
        Red obj = new Red();
        obj.Addition();
        obj.Multiply1();
        obj.Division1();
        
    }

}