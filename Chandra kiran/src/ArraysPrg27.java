public class ArraysPrg27 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,0,1},{0,0,0},{0,0,1}};
        int c=1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j&&a[i][j]!=1)
                {
                    
                    c=0; 
                }
                if(i!=j&&a[i][j]!=0)
                {
                    c=0;
                }

            }
        }
        if(c==0)
        {
            System.out.println("Matrix is not an Identity Matrix");
        }
        else
        {
            System.out.println("Matrix is an Identity Matrix");
        }

        
    }
    
}
