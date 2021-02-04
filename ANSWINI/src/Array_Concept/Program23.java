package Array_Concept;

public class Program23 
{
    //program to subtract two multidimensional matrices
    public static void main(String[] args) 
    {
        int[][] a=new int[][]{{1,2,3},{1,2,3},{1,2,3}};//first array
        int[][] b=new int[][]{{1,2,3},{1,2,3},{1,2,3}};//second array
        int[][] c=new int[3][3];//Third array to store difference of first and second arrays
        System.out.println("Difference of two matrices is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j] - b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


         //program to find difference of two jagged multidimensional arrays
         int[][] d={{1,2,3},{1,2},{1,2,3,4}};//first jagged array
         int[][] e={{1,2,3},{1,2},{1,2,3,4}};//second jagged array
         int[][] f=new int[5][5];//Third array to store difference of first and second arrays
         System.out.println("Difference of two matrices is: ");
         for(int i=0;i<d.length;i++)
         {
            for(int j=0;j<d[i].length;j++)
            {
                f[i][j]=d[i][j] - e[i][j];
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
         }

    }
    
}
