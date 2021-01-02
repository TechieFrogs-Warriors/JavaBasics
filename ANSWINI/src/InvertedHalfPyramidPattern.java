import java.util.Scanner;

public class InvertedHalfPyramidPattern 
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
        for(int i=1;i<=n;i++)
        {
        for(int j=n;j>=i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
        }
        obj.close();
    }  
}
