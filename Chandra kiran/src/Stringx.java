import java.util.Scanner;

public class Stringx 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Str,Str1;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
            Str1=scan.nextLine();
    
        }while(Str==" "&&Str1==" ");
        String x=Str+Str1;
        if(Str.concat(Str).equals(x))
        {
            x=Str;
            System.out.println(x);
        }
        if(x.concat(Str1).equals(x))
        {
            x=Str1;
            System.out.println(x);
        }
        if(Str.concat(Str1).equals(x))
        {
            System.out.println(x);
        }
        scan.close();
    }
    
}
