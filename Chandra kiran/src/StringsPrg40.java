public class StringsPrg40 
{
    public static void main(String[] args) 
    {
        String S="my name is chandra kiran";
         int n[] = new int[S.length()];
        int i,j;
        char S1[]=S.toCharArray();
        for( i=0;i<S.length();i++)
        {
            n[i]=1;
            for( j=i+1;j<S.length();j++)
            {
                
                if(S1[i]==S1[j])
                {
                    n[i]++;
                    S1[j]='0';
                }
            
            }
         }
         for(i=0;i<n.length;i++)
         {
             if(S1[i]!='0'& S1[i]!=' ')
            
            {
                System.out.println(S1[i]+"-"+n[i]);
            }

         }
    
     }
    
}
