package Exception_Concept;

public class Program17 
{
    //program for Instantiation exception
    public static void main(String[] args) 
    {
        /* try
        {
            Class cl=Inst.class;
            cl.newInstance();
        }
        catch(InstantiationException | IllegalAccessException e)
        {
            System.out.println("Instantiation exception..occured");
        } */
        try
        {
            Class cl=Class.forName("A");
            cl.newInstance();

        }
        catch(InstantiationException |  ClassNotFoundException | IllegalAccessException e)
        {
            System.out.println("Instantiation exception occured");
        }
      
    }
    /* class Inst
    {
    int first,second;
    Inst(int a,int b)    //Here there is no default constructor i.e. a constructor with no arguments
    {
    first=a;
    second=b;
    }
    }    */
    abstract class A
    {

    }
}    


