import java.util.Arrays;

public class AdvArrays10 
{
    public static void main(String[] args) 
    {
        int a[]={5, 8, 1, 4, 2, 9, 3, 7, 6};
        int len=a.length;
        Arrays.sort(a);
    
       int temp[]=new int[10];
       int n=0;
        for(int i=0,j=len-1;i<=len/2||j>len/2;i++,j--)
        {
            if(n<len)
            {
               temp[n]=a[i];
               n++;
            }
            if(n<len)
            {
                temp[n]=a[j];
                n++;

            }
              
        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=temp[i];
            System.out.print(a[i]+" ");
        }
    }
    
}
