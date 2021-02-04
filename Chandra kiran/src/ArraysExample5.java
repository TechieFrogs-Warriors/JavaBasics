import java.util.Arrays;

public class ArraysExample5 
{
    public static void main(String[] args) 
    {
        int a[]={35,25,55,65,75};
        int b[]={40,30,60,70,80};
        

        
       System.out.println(Arrays.equals(a, b));
       for(int i=0;i<a.length;i++)
       {
           a[i]=a[i]+5;
        
       }
       
       System.out.println(Arrays.equals(a,b));
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
      System.out.println(Arrays.binarySearch(a, 55));
      System.out.println(Arrays.hashCode(a));
      System.out.println(Arrays.compare(a, b));
      System.out.println(Arrays.mismatch(a, b));
      

      
    
    

      

            
        
    }
    
}
