package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class ZeroElements2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //length of an array
        System.out.println("Enter Length of an array: ");
        int length = vallidation(scan);
        //create an array
        int arr[] = new int[length];
        int result[] = new int[length];
        //assign values to an array
        System.out.println("Enter non-zero values and zero values to array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        //logic
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.print(arr[i]+" ");
            }
            else{
                result[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(result[i]+" ");
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
