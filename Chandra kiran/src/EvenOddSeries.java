import java.util.Scanner;

public class EvenOddSeries 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int m=InputValidation(scan);
        int n=InputValidation(scan);
        int arr[]=new int[2*InputValidation(scan)];
        int len=arr.length;
        if(len>=m&&len>=n)//checks the condition len is greater than m and n
        {
            Series(arr,m,n);//calling method
        }
        else
        {
            System.out.println("m and n values are greater than array length");
        }
        scan.close();

    }
    public static void Series(int arr[],int m,int n)
    {
        for(int x=0;x<arr.length;x++)//for loop for x values
        {
            if(x%2==0)
            {
                arr[x]=(int)Math.pow(1,m)+x;//prints odd series
                System.out.print(arr[x]+" ");
            }
            else
            {
                arr[x]=(int)Math.pow(1,n)+x;//prints even series
                System.out.print(arr[x]+" ");
            }
        }
        System.out.println();
        System.out.println("mth element in odd series "+arr[m]);
        System.out.println("nth element in even series "+arr[n]);
           
    }
     public static int InputValidation(Scanner scan)
     {
         int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            n=scan.nextInt();
        }while(n<=0);
        return n;
     }   
    
        
}
