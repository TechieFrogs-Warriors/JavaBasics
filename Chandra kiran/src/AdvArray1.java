public class AdvArray1 
{
    public static void main(String[] args) 
    {
       int a[]={20,40,60,80,10,50,70,50,30};
       int target=100;
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]+a[j]==target)
               {
                   System.out.println(a[i]+" "+a[j]);
               }
           }
       }
        
    }
    
}
