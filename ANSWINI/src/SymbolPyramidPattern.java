import java.util.Scanner;

public class SymbolPyramidPattern 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER");
        int n=obj.nextInt();
        pyramidPattern(n);
        obj.close();
        
    }
    public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++)
        { 
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");

            }
            
            for (int k=0; k<=i; k++ )
            { 
                System.out.print("* ");
            } 
            System.out.println();
        }
    }  
}
