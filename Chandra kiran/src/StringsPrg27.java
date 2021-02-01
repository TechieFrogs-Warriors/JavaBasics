public class StringsPrg27 
{
    public static void main(String[] args) 
    {
        String S="chandrakiran";
        int len = S.length();
        int n=3;
        int m=len/n;
        String S1;
        if(len%n==0)
        {
            for(int i=0;i<n;i++)
            {
                S1=" ";
                for(int j=i*m;j<m*(i+1);j++)
                {
                    S1=S1+S.charAt(j);

                }
                System.out.println(S1);
            }
        }
        else
        {
            System.out.println("String cannot be divided");

        }
        
        
    }
    
}
