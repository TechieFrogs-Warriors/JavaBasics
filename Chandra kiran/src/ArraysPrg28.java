public class ArraysPrg28 
{
    public static void main(String[] args) 
    {
        int a[][]={{2,0,0},{3,0,0},{4,0,0}};
         int  r=a.length,c=a[0].length,d=0;
         int s=0;
         for(int i=0;i<r;i++)
         {
             for(int j=0;j<c;j++)
             {
                 if(a[i][j]==0)
                 {
                     d=d+1;
                 }
                 else
                 {
                   s=s+1;
                 }

             }
         }
         if(d>s)
         {
             System.out.println("Matrix is Sparse Matrix");
         }
         else
         {
             System.out.println("Matrix is not a Matrix");

         }
        
    }
    
}
