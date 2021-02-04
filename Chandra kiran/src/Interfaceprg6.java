interface One
{
    void test();
    void Rent();
}
interface Two 
{
    void sum();
    void product();
}
interface Three 
{
    void New();
    void Old();
}
interface Four extends One,Two,Three
{
    void Own();
    

}
public class Interfaceprg6 implements Four
{
  public void test()
    {
        System.out.println("test method");

    }
    public void sum()
    {
        System.out.println("sum method");
    }
    public void product()
    {
        System.out.println("Product method");
    }
    public void New()
    {
        System.out.println("New method");
    }
    public void Old()
    {
        System.out.println("Old method");

    }
    public void Own()
    {
        System.out.println("Own method");
    }
    public void Rent()
    {
        System.out.println("Rent method");
    }
public static void main(String[] args) 
{
    Interfaceprg6 obj = new Interfaceprg6();
    obj.test();
    obj.New();
    obj.Old();
    obj.Rent();
    obj.product();
    obj.sum();
    obj.Own();
    
}
}




    

