package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class OlderProducts 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int barcode=InputValidation(scan);
        int arr[]=new int[InputValidation(scan)];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=barcode%10;//stores the last element into array
            barcode=barcode/10;
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);//Array is sorted
        System.out.println();
        System.out.println("Older Product "+arr[0]);//prints the least value of array
        
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
