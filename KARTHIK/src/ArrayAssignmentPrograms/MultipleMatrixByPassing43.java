package ArrayAssignmentPrograms;

public class MultipleMatrixByPassing43 {
    public static void main(String[] args) {
        int a[][]={{8,12,41},{12,8,7},{9,21,4}};
        int b[][]={{10,12,14},{17,14,42},{47,21,8}};
        
        Multiplication(a,b);
        
    }
    public static void Multiplication(int a[][],int b[][])
    {
        int c[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a.length;k++)
                 {
                    c[i][j]=c[i][j]+a[i][j]*b[i][j];
                    
                 }
                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }
    }
}
