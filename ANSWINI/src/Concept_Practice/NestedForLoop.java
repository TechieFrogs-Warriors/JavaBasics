public class NestedForLoop 
{
    public static void main(String[] args) 
    {
        ABC:
        for(int i=1;i<=5;i++)
        {
            XYZ:
            for(int j=1;j<=i;j++)
            {
                if(i!=j)
                break ABC;
            }
            System.out.print("Hello");
            System.out.println();
        }
    
        DEF:
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                if(i==4)
                break DEF;
         
            }
            System.out.print(i+" "+(++i));
            System.out.println();
        }
    
    
    }
}
