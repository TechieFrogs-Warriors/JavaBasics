import java.util.Scanner;

public class NumericPattern 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {  
            int count=0;  
            for(int j=1;j<n;j++)
            {
                if(count<i-1)
                {  
                    if(!(j<n-i+1))
                    {  
                        System.out.print(j);  
                        count++;  
                    }  
                }  
            }  
            System.out.print("0");  
            count=0; 
            for(int j=n-1;j>=1;j--)
            { 
                if(count<i-1)
                {  
                    System.out.print(j);  
                    count++;  
                }  
            }  
            System.out.println("");  
        }
        obj.close();   
    }
}
