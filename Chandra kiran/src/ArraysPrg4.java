public class ArraysPrg4 
{
    public static void main(String[] args) 
    {
        int a[]={10,20,10,30,20,40,30};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }

            }
        }
        
    }
    
}
