import java.util.Scanner;

public class HalfPyramidNumberPattern 
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
        numberPattern(n);
        obj.close(); 
    } 
    public static void numberPattern(int n) 
    { 
        int i, j; 
    
        for(i=0; i<n; i++) 
        { 
            int num=1; 
            for(j=0; j<=i; j++)
            {  
                System.out.print(num+ " ");  
                num++; 
            }  
            System.out.println(); 
        }
         
    } 
    
}
