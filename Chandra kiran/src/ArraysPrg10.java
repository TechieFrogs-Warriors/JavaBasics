public class ArraysPrg10 
{
    public static void main(String[] args) 
    {
        int a[]={30,50,10,70,90};
        int min=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])//checks the minmum value in both
                {
                    min=a[j];// assigns the minimum value to min
                    
                }
                
            }
        }
        System.out.println("Smallest number is "+min);

        
    }
    
}
