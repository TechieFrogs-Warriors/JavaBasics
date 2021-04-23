import java.util.Scanner;

public class AlphabetPattern13 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        char ch='A';
        int count=0;
        for(int i=1;i<=n;i++)
        {
            count=i;
            for(int j=1;j<=i;j++)
            { 
                if(i==1)
                {
                    System.out.print(ch);
                }
                else
                {
                    System.out.print((char)(ch+count-1)+" ");
                    count=(char)(count+n-j);
                }
            }
            System.out.println();
        }
        obj.close();
    }
}
