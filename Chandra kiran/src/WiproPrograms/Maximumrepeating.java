package WiproPrograms;

import java.util.Scanner;

public class Maximumrepeating 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num=InputValidation(scan);
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int max=0,Maxnum=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;//count will be increamented
                }
            }
            if(max<=count)
            {
                max=count;//max count
                Maxnum=arr[i];//asigns the maximum repeating number

            }
            
        }
        System.out.println(Maxnum);
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
