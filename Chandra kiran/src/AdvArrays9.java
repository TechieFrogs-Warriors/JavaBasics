import java.util.Arrays;

public class AdvArrays9 
{
    public static void main(String[] args) 
    {
        int[] A = { 1, 5, 6, 7, 8, 10};
        int[] B = { 2, 4, 9};
        int n=A.length;
        int m=B.length;
        int C[]= new int[9];
        System.arraycopy(A, 0, C, 0, n);
        System.arraycopy(B, 0, C, n, m);
        System.out.println(Arrays.toString(C));
        Arrays.sort(C);
        System.out.println(Arrays.toString(C));
        System.arraycopy(C, 0, A, 0, n);
        System.arraycopy(C, n, B, 0, m);
        System.out.println("A Array");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("B Array");
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    
        
    }
}
