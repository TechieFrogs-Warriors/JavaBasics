import java.util.Scanner;

public class AlphabetPattern33 
{
    public static void main(String[] args) 
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print((char)(ch+i+j));
            }
            System.out.println();
        }
        obj.close(); 
        
    }
    
}
