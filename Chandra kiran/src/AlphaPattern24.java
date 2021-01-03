public class AlphaPattern24 
{
    public static void main(String[] args) 
    {
         String S="JAVA";
         int n=S.length();
         for(int i=1;i<=n;i++)
         {
             for(int j=n;j>i;j--)
             {
                 System.out.print(" ");
             }
             for(int k=i*2-1;k>=1;k--)
             {
                 System.out.print(S.charAt(i-1));
             }
             System.out.println();
         }

    }
    
}
