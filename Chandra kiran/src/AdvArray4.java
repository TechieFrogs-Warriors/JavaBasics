public class AdvArray4 
{
    public static void main(String[] args) 
    {
        int a[][]={{40,60,50},{70,20,30},{90,10,80}};
        int temp=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                for(int k=0;k<3;k++)
                {
                  for(int l=0;l<3;l++)
                  {
                     if(a[i][j]<a[k][l])
                      {
                           temp=a[k][l];
                           a[k][l]=a[i][j];
                           a[i][j]=temp;
                       }
                    }
                }
            }
        }
       
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
