public class ArraysMultiply 
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
        System.out.println("Jagged Array");
        int d[][]= new int[3][];
        d[0]=new int[3];
        d[1]=new int[2];
        d[2]=new int[1];
        int e[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                e[i][j]=0;
                for(int k=0;k<3;k++)
                 {
                     e[i][j]=e[i][j]+a[i][j]*d[i][j];
                 }
                    System.out.print(e[i][j]+" ");
            }
                System.out.println();
        }


        
    }
    
}
