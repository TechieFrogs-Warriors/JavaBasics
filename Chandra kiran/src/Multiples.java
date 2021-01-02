import java.util.Scanner;
public class Multiples 
{
    public static void main(String[] args) 
    {
        Scanner Mul= new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!Mul.hasNextInt())
            {
                String input = Mul.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
            n=Mul.nextInt();


        }while(n<0);
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(i*j+" ");
            }
            System.out.println();
        }
        Mul.close();
    }
}
        
    

