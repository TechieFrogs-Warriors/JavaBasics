public class ArraysAddition 
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
        System.out.println("Jagged array");
        int d[][]= new int[3][];
        d[0]=new int[3];
        d[1]=new int[2];
        d[2]=new int[1];
        int e[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                e[i][j]=a[i][j]+d[i][j];
                System.out.print(e[i][j]+" ");

            }
            System.out.println();
        }
    }

}
