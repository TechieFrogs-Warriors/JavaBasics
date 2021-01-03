import java.util.Scanner;

public class AlphabetPattern8 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        //LOGIC
        for(int i=0;i<=n;i++)
        {
            char ch='A';
            for(int j=n-1;j>=i;j--)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();   
        }
        obj.close(); 
        
    }
    
}
