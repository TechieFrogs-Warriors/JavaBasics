package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class IntersectionOfNumbers1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter length of an array1: ");
        int length1 = vallidation(scan);
        System.out.println("Enter length of an array2: ");
        int length2 = vallidation(scan);

        //create two arrays
        int arr1[] = new int[length1];
        int arr2[] = new int[length2];

        //assign values to an array1
        System.out.println("Enter elements to 1st Array: ");
        for(int i =0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        //assigning values to array2
        System.out.println("Enter elements to 2nd Array: ");
        for(int i =0;i<arr2.length;i++){
            arr2[i] = scan.nextInt();
        }
        System.out.println("intersection elements: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){//it only print equal elements
                    System.out.print(arr1[i]+" ");
                }
            }
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
