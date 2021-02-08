import java.util.Scanner;

/* public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        //First take fibonacci range as input from user 
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();

        //step3:printing logic
        for(int i=0;i<N;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
    //Step2:recursive function calling
    static int fib(int N)
    {
        if(N<=1)
        return N;
        else
        return fib(N-1)+fib(N-2);
    } 
    
} */

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int  num1 = 0, num2 = 1;
        for (int i = 1; i <= N; i++)
        {
            System.out.print(num1 + "  ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        sc.close(); 
    }
} 

