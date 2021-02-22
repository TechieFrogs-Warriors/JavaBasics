package WiproPrograms;

import java.util.Scanner;

public class CubeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int numDimensions=InputValidation(scan);
        int arr[]=new int[numDimensions];
        int cube[]= new int[numDimensions];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<cube.length;i++)
        {
           cube[i]=(int)Math.pow(i, 3);//cube value of number
               
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<cube.length;j++)
            {
                if(arr[i]==cube[j])//checks the cube values present in the array
                {
                    count++;//increaments the count

                }
            }
        }
        System.out.println(count);
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
