public class ArraysPrg15 
{
    public static void main(String[] args) 
    {
        int a[]={10,30,50,20,90};
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    max=a[j];
                    a[j]=a[i];
                    a[i]=max;

                }
            }
        }
        System.out.println("Descending order");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
}
