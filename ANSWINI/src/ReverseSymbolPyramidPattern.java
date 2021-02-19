import java.util.Scanner;

public class ReverseSymbolPyramidPattern 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        // INPUT NUMBER VALIDATION
        int n;
        do 
        {
            System.out.println("ENTER YOUR NUMBER");
            while (!obj.hasNextInt()) 
            {
                System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
                obj.next();
            }
            n=obj.nextInt();
        } while (n <= 0);
        System.out.println("YES IT IS POSITIVE NUMBER : " + n);
        //LOGIC
        reversePyramidPattern(n);
        obj.close();
        
    }
    public static void reversePyramidPattern(int n) 
    {  
        
        for (int i=0; i<=n-1; i++)
        { 
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            
            for (int k=0; k<=n-1-i; k++ )
            { 
                System.out.print("* ");
            } 
            System.out.println();
        }
    } 
}
