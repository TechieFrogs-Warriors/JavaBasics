public class AlphabetPattern17 
{
    public static void main(String[] args) 
    {
        String str="HELLO";
        String str2="WORLD";
        int n=str.length();
        int k=str2.length();
        for(int i=1;i<=n;i++)
        {
            System.out.print(str.substring(0,i));
            if(k>=1)
            System.out.println(str2.substring(0,k));
            k--;
        } 
    } 
}
