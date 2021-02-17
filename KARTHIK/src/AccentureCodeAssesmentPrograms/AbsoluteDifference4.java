package AccentureCodeAssesmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

class SumOfAbsDifference{
    
}

public class AbsoluteDifference4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length Of An Array:");
        int len=scan.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter values to Array: ");//assign values to array
        for(int i=0;i<len;i++){
            System.out.println("Enter value: ");
            arr[i]=scan.nextInt();
        }
        //calling 
        minimum(arr, len);
        scan.close();
    }
    public static void minimum(int arr[],int len){
        int sum=0;
        //sort the array
        Arrays.sort(arr);
        //Minimum absolute difference for First element
        sum= sum+Math.abs(arr[0]-arr[1]);
        //Minimum absolute difference for last element
        sum =sum+Math.abs(arr[len-1]-arr[len-2]);
        //Minimum Absolute Diffrence for remining elements
        for(int i=1;i<len-1;i++){
            sum =sum+Math.min(Math.abs(arr[i]-arr[i-1]),Math.abs(arr[i]-arr[i+1]));
        }
        System.out.println("Sum of Minimum Absolute Difference: "+sum);
    }
}
