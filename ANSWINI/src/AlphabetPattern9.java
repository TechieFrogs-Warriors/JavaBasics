import java.util.Scanner;

public class AlphabetPattern9 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=0;i<=n;i++)
        {
            char ch='A';
            for(int j=i;j>=0;j--)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
        obj.close(); 
    }    
}
