package AccessModifers;

import Access.Access_Specifiers;

public class ProtectedSample //extends Access_Specifiers
{
    public static void main(String[] args) 
    {
        ProtectedSample p=new ProtectedSample();
        p.add();
       // p.mul(2, 4);
        Access_Specifiers a=new Access_Specifiers();//accessing public method from other package 
        a.division(); 
        
    }
    protected void add()
    {
        int a=20,b=30;
        int c=(a+b)*(a-b);
        System.out.println(c);

    }
}

