import java.util.Scanner;

public class AlphabetPattern16 
{
    public static void main(String[] args) 
    {
        String str="ISTS";
        int n=str.length();
        for(int i=0;i<=n;i++ )
        {
            System.out.println(str.substring(0, i));
        }
    }  
}
