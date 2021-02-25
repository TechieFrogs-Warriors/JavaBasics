package WiproPrograms;

import java.util.Scanner;

public class PerfectCube 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int N=InputValidation(scan);
        int arr[]=new int[N];
        int sum=0,cube=0;
        System.out.println("Enter price of products");
        for(int i=0;i<arr.length;i++)
        {
             arr[i]=scan.nextInt();
             sum=sum+arr[i];
            
        }
         cube=Cube(sum);//calling method
         if(sum==cube)//checks the sum value
        {
             System.out.println("YES");
        }
        else
        {
            int diff=cube-sum;//diiference between perfectcube and sum
            System.out.println(diff);
        }
            
        
    }
    public static int Cube(int sum)
    {
        int perfectcube=(int)Math.round(Math.cbrt(sum))+1;//add 1 to cuurent sum to find perfect cube
        int cube=perfectcube*perfectcube*perfectcube;
        if(cube==sum)//if sum is equal to perfect cube
        {
            return 0;
        }
        else
        {
            return cube;//else return perfect cube

        }
        
    


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
