public class AdvArray2 
{
    public static void main(String[] args) 
    {
        
       int a[]={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
       int temp=0;
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]>a[j])
               {
                   temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
               }
           }
           System.out.print(a[i]+" ");
       }
    }
    
}
