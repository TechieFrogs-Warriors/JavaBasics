import java.util.Scanner;

public class NumberIncrementTrianglePattern 
{
    public static void main(String args[]) 
    { 
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Numberpattern(n); 
    } 
    public static void Numberpattern(int n) 
    { 
        int i, j;int num=1; 
    
        for(i=0; i<n; i++) // outer loop 
        { 
           //int num=1; 
            for(j=0; j<=i; j++) // inner loop 
            {  
                System.out.print(num+ " ");  
                num++; 
            }  
            System.out.println(); 
        } 
    } 
      
}

    

