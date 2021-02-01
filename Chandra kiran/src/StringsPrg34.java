public class StringsPrg34 
{
    public static void main(String[] args) 
    {
        String S ="chandra";
        String S1="";
        for(int i=S.length()-1;i>=0;i--)//for loop iterates string in reverse order
        {
            char ch = S.charAt(i);
            S1=S1+ch;//reverse strin is stored here
        }
        if(S1.equals(S))// checks whether the reverse of string is equal to original string
        {
            System.out.println(S+" is a Palindrome");
        }
        else
        {
            System.out.println(S+" is not a palindrome");
        }
    
    }
    
}
