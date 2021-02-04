public class ArraysPrg9 
{
    public static void main(String[] args) 
    {
        int a[]={10,50,30,70,40};
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    max=a[i];
                    
                }
                else
                {
                    max=a[j];
                }

            }
        
        }
        System.out.println("Largest element is "+max);
        
        
    }
    
}
