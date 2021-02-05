public class ArraysPrg13 
{
    public static void main(String[] args) 
    {
        int a[]={20,30,40,50,10};
        int n=2;
        System.out.println("Before shifting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");

        }
        for(int i=0;i<n;i++)
        {
            int b,j;
            b=a[a.length-1];
            for( j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];


            }
            a[0]=b;

        }
        System.out.println();
        System.out.println("After Shifting");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        
    }
    
}
