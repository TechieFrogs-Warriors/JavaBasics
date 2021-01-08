class I
{
    int i;
    void print()
    {
        System.out.println("I class");
    }
    void printNum()
    {
        System.out.println("i value is : " +i);

    }
}
class J extends I
{
    int j;
    void printNum()
        {
            System.out.println("j vale is : " +j);
         }
}
public class MethodPrg7 
{
    public static void main(String[] args) {
        J obj1 =new J();
        obj1.j=30;
        obj1.i=70;
        obj1.print();
        obj1.printNum();
    }
    
}
