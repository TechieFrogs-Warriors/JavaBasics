public class StringsPrg45 
{
    public static void main(String[] args) 
    {
        String S = "chandra";
        String S1 = "kiran";
        S=S+S1;
        S1=S.substring(0, S.length() - S1.length());
        S=S.substring(S1.length());
        System.out.println(S);
        System.out.println(S1);
        
    }
    
}
