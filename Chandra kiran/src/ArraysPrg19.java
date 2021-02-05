public class ArraysPrg19 
{
    public static void main(String[] args) 
    {
        int a[]={40,30,80,20,50};
        int min=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    min=a[j];
                    a[j]=a[i];
                    a[i]=min;
                    
                }
            }
         }
         System.out.println("2nd smallest number ");
         for(int i=0;i<a.length;i++)
         {
             if(i==1)
             System.out.print(a[i]+" ");
         }
        
        
    }
    
}
