import java.util.Scanner;
public class PascalsTriangle 
{
    public static void main(String[] args) 
    {
        Scanner D= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!D.hasNextInt())
            {
                String input = D.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=D.nextInt();
        }while(n<0);

        int i,j;
          for(i=0;i<n;i++)
        {
              int num=1;
              System.out.printf("%" + (n-i) * 2 + "S","");
             for(j=0;j<=i;j++)
          {
            System.out.printf("%4d",num);
            num = num * (i-j) / (j+1);
          }
           System.out.println();
        }
        D.close();
    }
    
}
