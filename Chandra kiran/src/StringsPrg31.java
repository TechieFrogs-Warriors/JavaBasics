public class StringsPrg31 
{
    public static void main(String[] args) 
    {
        StringBuffer S=new StringBuffer("cha ndra kir an");
        
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch==' ')
            {
               S.deleteCharAt(i);
              
            }
        }
        System.out.println(S);
        
        
    }
    
}
