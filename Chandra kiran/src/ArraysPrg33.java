public class ArraysPrg33 
{
    public static void main(String[] args) 
    {
        int a[][]={{20,40,60},{80,100,30},{50,70,90}};
        int b[][]={{25,45,65},{85,95,35},{55,75,15}};
        int c[][]= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                 {
                     c[i][j]=c[i][j]+a[i][j]*b[i][j];
                 }
                    System.out.print(c[i][j]+" ");
            }
                System.out.println();
        }
        
    }
    
}
