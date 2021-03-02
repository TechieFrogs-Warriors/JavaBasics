package JavaInterviewCodingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Leader4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter length of an array: ");
        int length = vallidation(scan);
        
        //intilize an arry
        int arr[] = new int[length];
        
        //assign values to an array
        System.out.println("Enter values to an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        //sort the array
        Arrays.sort(arr);
        
        //print the array
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
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
