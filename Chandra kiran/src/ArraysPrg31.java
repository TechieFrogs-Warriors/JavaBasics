public class ArraysPrg31 
{
    public static void main(String[] args) 
    {
        int a[][]={{20,30,50},{40,80,90},{10,60,70}};
        System.out.println("Upper Triangular Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i<=j)//checks the condition to print upper triangular matrix
                {
                   System.out.print(a[i][j]+" ");
                }
                else
                {
                    System.out.print("00 ");
                }

            }
            System.out.println();
        }
     }
}
    

