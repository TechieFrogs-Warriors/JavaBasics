public class StringsPrg36 
{
    public static void main(String[] args) 
    {
        String S="aabbb";
        int[] f = new int[S.length()];
        char ch1=S.charAt(0);
        char ch2=S.charAt(0);
        int i,j,min, max;
        char ch[]=S.toCharArray();
        
        for( i=0;i<ch.length;i++)
        {
             f[i]=1;
            for( j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j]&&ch[i]!=' '&&ch[i]!='0')
                {
                    f[i]++;
                    ch[j]='0';
                }
            }
        }
        min=max=f[0];
        for( i=0;i<f.length;i++)
        {
            
             if( min>f[i] && f[i]!='0')
             {
                 min=f[i];
                 ch1=ch[i];

             }
             if(max<f[i])
             {
                 max=f[i];
                 ch2=ch[i];
             }
            
        }
        System.out.println("Minimum occured character "+ch1);
        System.out.println("Maximum occured character "+ch2);

        
    }

    
}
