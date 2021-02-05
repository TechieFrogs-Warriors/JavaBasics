public class ArraysPrg3 
{
    public static void main(String[] args) 
    {
        int a[]={10,20,40,30,50};
        int n=2;
        System.out.println("Before Shifting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            int j,b;
            b=a[0];
            for(j=0;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            a[j]=b;
            
        }
        System.out.println();
        System.out.println("After Shifting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");

        }
     }
    
}
