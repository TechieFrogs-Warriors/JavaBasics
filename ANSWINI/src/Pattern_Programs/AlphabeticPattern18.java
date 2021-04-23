import java.util.Scanner;

public class AlphabeticPattern18 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int n=obj.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print((char)(ch+j));
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print(" ");
            }
            for(int l=n-i;l>=0;l--)
            {
                if(l!=n)    
                System.out.print((char)(ch+l));
            }
           System.out.println();
        }
        obj.close(); 
    } 
}
