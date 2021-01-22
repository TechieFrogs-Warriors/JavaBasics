class Sum
{

   public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition "+c);
        
    }
    
}
class Product extends Sum
{
    void multiply(int d,int e)
    {
        int f=d*e;
        System.out.println("Multiplication "+f);
    }
   
    public void add(int y, int z) {

        int x = y + z + 70;
        System.out.println("Sum " + x);
        super.add(40, 40);

    }
}
public class SingleInheritence 
{
    public static void main(String[] args) 
    {
        Product Obj = new Product();
        Obj.add(30, 70);
        Obj.multiply(70, 40);
        
        
    }
    
}
