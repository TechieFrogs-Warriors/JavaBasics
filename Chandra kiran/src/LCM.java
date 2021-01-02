import java.util.Scanner;
public class LCM 
{
  public static void main(String[] args) 
    {
        Scanner L= new Scanner(System.in);
        int n,m;
        do
        {
            System.out.println("enter positive number");
            while(!L.hasNextInt())
            {
                String input = L.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=L.nextInt();
          m=L.nextInt();

        }while(n<0&&m<0);
        int gcd=1,lcm;
        for(int i=1;i<=n&&i<=m;i++)
        {
           if(n%i==0&&m%i==0)
          {
            gcd=i;
          }
        }
            lcm=(n*m)/gcd;//gives the lcm of the num
            System.out.println(lcm);
            L.close();
   }
    
}
