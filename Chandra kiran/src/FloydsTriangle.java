import java.util.Scanner;
public class FloydsTriangle 
{
    public static void main(String[] args) 
    {
        Scanner F= new Scanner(System.in);
        int n;
        do{
            System.out.println("enter positive number");
            while(!F.hasNextInt())
            {
                String input = F.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=F.nextInt();


        }while(n<0);

        int i,j,num=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");//prints the num value
                num++;//increaments the num value
            }
            System.out.println();
        }
      F.close();  
    }
    
}
