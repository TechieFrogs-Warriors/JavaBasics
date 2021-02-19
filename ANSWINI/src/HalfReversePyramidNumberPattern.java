import java.util.Scanner;

public class HalfReversePyramidNumberPattern 
{
    public static void main(String args[]) 
    { 
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        numberPattern(n);
        obj.close(); 
    }
    public static void numberPattern(int n) 
    { 
        int i, j; 
    
        for(i=0; i<n; i++) // outer loop  for rows
        { 
            int num=1; 
            for(j=n-1; j>=i; j--) // inner loop for coloumns
            {  
                System.out.print(num+ " ");  
                num++; 
            }  
            System.out.println(); 
        }
         
    }  
    
}
