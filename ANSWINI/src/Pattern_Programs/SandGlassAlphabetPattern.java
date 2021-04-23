import java.util.Scanner;

public class SandGlassAlphabetPattern 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        reverseAlphabetPyramid(n);
        alphabetPyramid(n);
        obj.close();
    }

    public static void reverseAlphabetPyramid(int n)
    {
        
        for (int i=0; i<=n-1; i++)
        { 
            for (int k=0; k<=i; k++)
            {
                System.out.print(" ");

            }
            char ch='A';
            for (int j=0; j<=n-1-i; j++ )
            { 
                System.out.print(ch+" " );
                ch++;
            } 
  
            System.out.println();
        }
        
    }
    public static void alphabetPyramid(int n)
    {
        for (int i=0; i<n; i++)
        { 
            for (int k=n-i; k>1; k--)
            {
                System.out.print(" ");

            }
            char ch='A';
            for (int j=0; j<=i; j++ )
            { 
                System.out.print(" "+ch);
                ch++;
            } 
  
            System.out.println();
        }

    } 
}
