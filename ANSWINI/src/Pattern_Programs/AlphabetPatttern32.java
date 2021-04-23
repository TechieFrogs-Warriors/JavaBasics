import java.util.Scanner;

public class AlphabetPatttern32 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER");
        int n=obj.nextInt();
        char ch='A';
        int temp=0;
        for (int i=n;i>=1;i--)
        {
            for (int j=n;j>=i;j--)
            {
                System.out.print((char)(ch+j-1)+ " ");
                temp=j;
            }
            for (int k=n-i+1;k<n;k++)
            {
                System.out.print((char)(ch+temp-1)+ " ");
            }
            System.out.println();
        }
        obj.close(); 
    } 
}
