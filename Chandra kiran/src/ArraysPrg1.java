public class ArraysPrg1 
{
    public static void main(String[] args) 
    {
        char a[]={'a','b','c','d','e'};
        char b[]= new char[5];
        System.arraycopy(a, 0, b, 0, 4);
        System.out.println(String.valueOf(b));
        
    }
    
}
