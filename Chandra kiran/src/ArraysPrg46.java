import java.util.Arrays;

public class ArraysPrg46 
{
    public static void main(String[] args) 
    {
        int a[]={10,20,30,40};
        int b[]={50,60,70,80};
        int n=a.length;
        int m=b.length;
        int l=n+m;
        int c[]= new int[l];
        System.arraycopy(a, 0, c, 0, n);
        System.arraycopy(b, 0, c, n, m);
        System.out.println(Arrays.toString(c));
        
    }
    
}
