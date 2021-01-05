import java.util.Scanner;

public class AlphabetPattern12 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS YOU WANT");
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)  
        {              
            int ch=97;
            String str="";              
            for(int j=1;j<=i;j++)
            { 
                str=str+(char)ch + " + ";
                ch++;
            }  
            System.out.println("(" + str.substring(0,str.length()-3) + ")");
        }
        obj.close();
    }
}
