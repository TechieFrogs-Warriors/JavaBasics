public class StringsPrg29
{
    public static String Longest(String S,String S1)
    {
        int n= S1.length();
       for(int i=0;i<n;i++)
       {
           char ch =S.charAt(i);
           char ch1 =S1.charAt(i);
           if(ch!=ch1)
           {
               return S.substring(0, i);
           }
       }
       return S.substring(0, n);
    }
    public static void main(String[] args) 
    {
        String S2 = "ababcd";
        String S3 = "";
        int m=S2.length();
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                String S4 = Longest(S2.substring(i, m),S2.substring(j,m));
                if(S4.length()>S3.length())
                {
                    S3=S4;
                }
            }
        }
        System.out.println(S3);
    }

    
    
}
