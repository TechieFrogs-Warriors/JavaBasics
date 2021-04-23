public class Xyz 
{
    public static void main(String[] args) 
    {
       Y objName=new Y();
       objName.add();
       System.out.println(objName.mul());

        Xyz ob2=new Xyz();
        ob2.method2();
        S obj=new S();
        obj.method1();
    }
    static class S
    {
        void method1()
        {
            String a="hello";
            String b="answini";
            System.out.println(a+b);
        }
    }
    void method2()
    {
        System.out.println("iam in method2 from main class");
    }

}
class Y
{
    void add()
    {
        int a=10,b=40;
        int c=a+b;
        System.out.println(c);

    }
    int mul()
    {
        int a=10,b=40;
        int c=a*b;
        //System.out.println(c);
        return c;
        
    }

}


