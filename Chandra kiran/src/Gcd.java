import java.util.Scanner;
public class Gcd 
{
    public static void main(String[] args) 
    {
        Scanner G= new Scanner(System.in);
        //input validation..
        int n,m;
        do
        {
            System.out.println("enter positive number");
            while(!G.hasNextInt())
            {
                String input = G.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=G.nextInt();
          m=G.nextInt();
        }while(n<0&&m<0);
        int gcd=1;
        for(int i=1;i<=n&&i<=m;i++)
        {
          if(n%i==0&&m%i==0)//condition to check the gcd of num
           {
             gcd=i;//num is stored in gcd
           }
        }
            System.out.println(gcd);
           G.close();
     }
    
}
