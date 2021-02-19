package AccessModifers;
import Interface_Concept.*;
//import Interface_Concept.Program7;
import Access.Access_Specifiers;

public class ProtectedSample implements Program3and4  //exteneds Access_Specifiers
{
    public static void main(String[] args) 
    {
        ProtectedSample p=new ProtectedSample();
        p.add();
       // p.mul(2, 4);
        Access_Specifiers a=new Access_Specifiers();//accessing public method from other package 
        a.division(); 

        //from interface concept package and from program 3and4
        p.nothing();
        p.nothing2();
        p.nothing3();
    }
    protected void add()
    {
        int a=20,b=30;
        int c=(a+b)*(a-b);
        System.out.println(c);

    }
    public void nothing()
    {
        System.out.println("iam nothing method of interface Sample_check");
    }
    public void nothing2()
    {
        System.out.println("iam nothing2 method of interface Sample_check");
    }
    public void nothing3()
    {
        System.out.println("iam nothing3 method of interface Sample_check");
    }
    //Interface concept program 7 part2
    protected class Prog7BaseInner implements Program7
    {
    	// need public constructor to create one in Program7 child: 
        public Prog7BaseInner() 
        { 

        }
        public String Talk() 
        { 
            return "Hello How Are You Answini"; 
        }
    }
}


    


