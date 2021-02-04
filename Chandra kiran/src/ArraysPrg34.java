public class ArraysPrg34 
{
    public static void main(String[] args) 
    {
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        int sum=0,i,j;
        for( i=0;i<a.length;i++)
        {
            sum=0;
            for( j=0;j<a[0].length;j++)
            {
                sum=sum+a[i][j];
            }
                 System.out.println("sum of "+(i+1)+" row "+sum);
         }
         
        for( i=0;i<a.length;i++)
        {
            sum=0;
            for( j=0;j<a[0].length;j++)
            {
                sum=sum+a[j][i];
            }
            System.out.println("sum of "+(i+1)+" column "+sum);
        }
        

    
        
    }
    
}
