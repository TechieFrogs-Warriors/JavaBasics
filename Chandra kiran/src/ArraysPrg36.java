public class ArraysPrg36 
{
    public static void main(String[] args) 
    {
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        int b[][]={{100,200,300},{400,500,600},{700,800,900}};
        int c[][]= new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
                
            }
            System.out.println();
        }
    }
    
}
