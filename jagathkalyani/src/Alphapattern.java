import java.util.Scanner;

public class Alphapattern {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc=new Scanner(System.in);
        int a;
        //validating for input
        do{
            System.out.println("please enter positive  number of row");
            while(!sc.hasNextInt())
            {
                System.out.println("enter a number");
                sc.next();

            }
            a=sc.nextInt();
        }
        while(a<=0);
        System.out.println("number of rows are : "+a);
        //////code for program
        {
            int alphabet=65;
            for(int i=0;i<=a;i++)//outer loop
            {
                for(int j=0;j<=i;j++)//inner loop
                {
                    System.out.print((char)alphabet+" ");
                    alphabet++;
                }
                System.out.println();
            }

        }
       
        
    }
    
}
