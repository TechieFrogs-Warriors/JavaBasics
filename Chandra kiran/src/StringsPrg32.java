public class StringsPrg32 
{
    public static void main(String[] args) 
    {
        String S = "ChAndRaKiRan";
        StringBuffer S1= new StringBuffer(S);
        for(int i=0;i<S.length();i++)
        {
            if(Character.isLowerCase(S.charAt(i)))
            {
                S1.setCharAt(i, Character.toUpperCase(S1.charAt(i)));
            }
           else if(Character.isUpperCase(S.charAt(i)))
            {
               S1.setCharAt(i, Character.toLowerCase(S1.charAt(i)));
            }
        }
        
    System.out.println(S1);
    }
    
}
