class NestedOut
{
    public void Out()
    {
        System.out.println("print the outer class");
    
     class NestIn
     {
        public void print()
        {
            System.out.println("print the inner class");
        }
        
       }
       NestIn m = new NestIn();
       m.print();
    }
}

public class LocalNestedClass 
{
    public static void main(String[] args) 
    {
        NestedOut n = new NestedOut();
        n.Out();

        
    }
    
}