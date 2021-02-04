package Array_Concept;

public class Program30 
{
    //program to multiply two multidimensional matrices
    public static void main(String[] args) 
    {
        int[][] a=new int[][]{{1,2,3},{1,2,3},{1,2,3}};//first array
        int[][] b=new int[][]{{1,2,3},{1,2,3},{1,2,3}};//second array
        int[][] c=new int[3][3];//Third array to store product of first and second arrays
        System.out.println("product of two matrices is: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]=a[i][k] * b[k][j];
                    
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


        //program to find Product of two jagged multidimensional arrays
        int[][] d={{1,2,3},{1,2},{1,2,3,4}};//first jagged array
        int[][] e={{1,2,3},{1,2},{1,2,3,4}};//second jagged array
        int[][] f=new int[5][5];//Third array to store Product of first and second arrays
        System.out.println("Product of two matrices is: ");
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                f[i][j]=0;
                for(int k=0;k<d[i].length;k++)
                {
                    f[i][j]+=d[i][k] * e[k][j];
                    
                }
                System.out.print(f[i][j]+" ");//Index out of bound exception occurs
            }
            System.out.println(); 
        }


    }
    
}
