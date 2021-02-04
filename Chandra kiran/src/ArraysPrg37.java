public class ArraysPrg37 
{
    public static void main(String[] args) 
    {
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        int d[][]= new int[3][];
        d[0]=new int[3];
        d[1]=new int[3];
        d[2]=new int[3];
        int e[][]=new int[3][3];
        int c=0;
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<d[i].length;j++)
            {
                d[i][j]=c++;
        
            }
            
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                e[i][j]=0;
                for(int k=0;k<3;k++)
                 {
                     e[i][j]=e[i][j]+(a[i][j]*d[i][j]);
                 }
                    System.out.print(e[i][j]+" ");
            }
                System.out.println();
        }
        
    }
    
}
