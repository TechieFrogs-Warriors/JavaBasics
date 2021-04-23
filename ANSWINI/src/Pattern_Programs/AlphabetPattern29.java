import java.util.Scanner;

public class AlphabetPattern29 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str=obj.nextLine();
        int n=str.length();
        for (int i=1;i<=n;i++) 
        { 
            for (int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=i*2-1;k>=1;k--)
            {
                System.out.print(str.charAt(i-1));
            }
            System.out.println();
        }
        obj.close();  
    } 
}
