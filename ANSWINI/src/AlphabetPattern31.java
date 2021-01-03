import java.util.Scanner;

public class AlphabetPattern31 
{
    public static void main(String[] args) 
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (j%2==0)
                System.out.print((char)(ch+(n*(j))+i)+ " ");
                else
                System.out.print((char)(ch+(n*(j+1))-i-1)+ " ");
            }
            System.out.println();
        }
        obj.close();   
    }
}
