import java.util.Scanner;

public class Functionsequence 
{
    public static int Sequence(int a,int num)
    {
        int P=1;
        int arr[]=new int[num];
        for(int i=2;i<=num;i++)
        {
            if(i%2==0)//checks i is even or odd
            {
                P=a/2;
                System.out.print(P+" ");
            }
        
            else
            {
                P=3*(a)+1;
                System.out.print(P+" ");
            }
           if(i==num-1)
           {
              P=arr[i];//gives the nth term of series
           }
    
        }
        System.out.println();
        return P;
        
        
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num,num1;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            num=scan.nextInt();
            num1=scan.nextInt();
    
        }while(num<=0&&num1<=0);
      System.out.println(Sequence(num, num1));//calling and printing the method ouput
        scan.close();
    }
}
