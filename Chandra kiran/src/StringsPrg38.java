public class StringsPrg38 
{
    public static void main(String[] args) 
    {
        String S = "ChandraKiran";
        

        for(int i=0;i<S.length();i++)
        {
            int d=0;
            char ch = S.charAt(i);
            for(int j=i+1;j<S.length();j++)
            {
                char ch1 = S.charAt(j);
                if(ch==ch1)
                {
                    d++;
                }
            }
            if(d>0)
            {
                System.out.println(S.charAt(i));
            }
        
        }
        
    }
    
}
