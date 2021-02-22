package Accenturepgms;
import java.util.Scanner;

import java.util.Arrays;

public class Ass21 {
    static int sumofminabsdiff( int arr[],int n){
        Arrays.sort(arr);// sorting of array
        int sum=0;// intilizing the sum to 0 to caluclatethe difference
        sum +=Math.abs(arr[0]-arr[1]); // absolute difference of the 1st array values in for loop 1st elemnt is calculated
        sum +=Math.abs(arr[n-1]-arr[n-2]);// abosolute difference od last values in loop last element is not calculated
        for(int i=1;i<n-1;i++)// finding the absolute difference for the remaining values in the array excpet last and first
        sum +=Math.min(Math.abs(arr[i]-arr[i-1]),Math.abs(arr[i]-arr[i+1]));// calucate the min value difference
        return sum;
    }
    public static void main(String[] args) {
        sumofminabsdiff obj=new sumofminabsdiff();
        Scanner sc = new Scanner(System.in);
        int len;
        // validation for input length
        do {
            System.out.println("enter  Length of Array : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            len = sc.nextInt();
        } while (len <= 0);
        System.out.println("its a Number: " + len);

        int arr[] = new int[len];
        System.out.println("Enter Elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n=arr.length;
       System.out.println("sum  " +obj.sumofminabsdiff(arr,n));
        
    }

        
    
}
