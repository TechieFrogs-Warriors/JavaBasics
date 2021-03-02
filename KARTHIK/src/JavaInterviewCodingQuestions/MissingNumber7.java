package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class MissingNumber7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking n value
        System.out.println("Enter n value: ");
        int n = vallidation(scan);
        //array length
        int arr_Length = n-1;
        int sum_Of_Elements=0,sum_Of_Numbers=0;
        
        //create int array
        int arr[] = new int[arr_Length];
        //assign values to an array
        System.out.println("Enter vales to an array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = vallidation(scan);
        }
        //sum of the elemnts
        for(int i=0;i<arr_Length;i++){
            sum_Of_Elements = sum_Of_Elements+arr[i];
        }
        //sum of numbers
        for(int i=0;i<n;i++){
            sum_Of_Numbers =sum_Of_Numbers+(i+1);
        }

        System.out.println("Missing Element in given series: "+(sum_Of_Numbers-sum_Of_Elements));
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only:");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
