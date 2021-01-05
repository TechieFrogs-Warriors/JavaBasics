import java.util.Scanner;

public class AlphabetPattern7 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        
        for (int i=0;i<=n;i++)
        { 
            for (int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            char ch='A';
            for (int j=1;j<=n-i;j++)
            { 
                System.out.print(ch+" ");
                ch++;  
            } 
            System.out.println();
        }
        obj.close(); 
    }
}
