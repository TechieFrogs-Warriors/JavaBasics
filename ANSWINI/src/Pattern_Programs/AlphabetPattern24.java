import java.util.Scanner;

public class AlphabetPattern24 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<=n;i++)
        {
            int temp=i;
            for (int j=i;j>=0;j--)
            {
                System.out.print((char)(ch+temp) + " ");
                temp=temp+5;
            }
            System.out.println();
        }
        obj.close(); 
    }  
}
