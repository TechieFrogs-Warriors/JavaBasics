import java.util.Arrays;

public class ArraysPrg21 
{
    public static int removeDuplicateElements(int a[],int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
         int temp[]= new int[n];  
         int j=0; 
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
            
                temp[j++]=a[i];
            
            }
        }
          temp[j++]=a[n-1];
          for(int i=0;i<j;i++)
          {
            a[i]=temp[i];
          }
          return j;
    }
    public static void main(String[] args) 
    {
        int a[]={10,20,10,30,20,40,30};
        Arrays.sort(a);
        int length=a.length;
       length=removeDuplicateElements(a, length);
        for(int i=0;i<length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
   
}
