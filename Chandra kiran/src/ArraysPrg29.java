public class ArraysPrg29 
{
    public static void main(String[] args) 
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2},{4,5},{7,8}};
        int r=a.length,c=a[0].length,r1=b.length,c1=b[0].length;
        int size=r*c,size1=r1*c1;
        boolean flag=true;
        if(size!=size1)
        {
            System.out.println("Matrices are not equal");
        }
        else
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        flag=false;
                        break;
                     }
                
                }
            }
            if(flag==true)
            {
                System.out.println("Matrices are equal");
            }
            else 
            {
                System.out.println("Matrices are not equal");
            }
        }
        
    }
    
}
