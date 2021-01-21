class Minus
{
    void Subtract(int i,int j)
    {
        int k=i-j;
        System.out.println("Subtraction " +k);
    }
}
class Divide extends Minus
{
    void Division(int m,int n)
    {
        int l=m/n;
        System.out.println("Division "+l);
    }

}
class Mod extends Divide
{
    void Moddiv(int p,int q)
    {
        int r=p%q;
        System.out.println("Modulus Division "+r);
    }

}
public class MultilevelInheritence 
{
    public static void main(String[] args) 
    {
        Mod Obj1 = new Mod();
        Product Obj2 = new Product();
        Obj1.Division(500, 50);
        Obj1.Subtract(1000, 400);
        Obj1.Moddiv(600, 34);
        Obj2.add(500, 1000);
        Obj2.multiply(4000, 300);
        
        
    }
    
}
