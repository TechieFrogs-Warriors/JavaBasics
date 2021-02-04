public class ArraysPrg30 
{
    public static void main(String[] args) 
    {
        int a[][]={{20,30,50},{40,80,90},{10,60,70}};
        System.out.println("Lower Triangular Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i>=j)//checks the values of i and j to print
                {
                   System.out.print(a[i][j]+" ");//if i position greater than and equal j postion prints value
                }
                else
                {
                    System.out.print("00 ");//prints 00 in reamaining positions
                }

            }
            System.out.println();
        }
     }
    
    
}
