public class StringsPrg28 
{
    public static void main(String[] args) 
    {
        String S="abc";
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(S.substring(i, j));
            }

        }
        
    }
    
}
