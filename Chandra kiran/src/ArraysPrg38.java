public class ArraysPrg38 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};
       int n=a.length,sum=0,average=1;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
            average=(sum)/n;
            System.out.println(average);
        
        
    }
    
}
