import java.util.Scanner;

public class FloydTrianglePattern 
{
    public static void main(String args[]) 
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
        Numberpattern(n);
        obj.close(); 
    } 
    public static void Numberpattern(int n) 
    { 
        int i, j;int num=1; 
    
        for(i=0; i<n; i++) // outer loop 
        {  
            for(j=0; j<=i; j++) // inner loop 
            {  
                System.out.print(num+ " ");  
                num++; 
            }  
            System.out.println(); 
        }
         
    } 
    
}
