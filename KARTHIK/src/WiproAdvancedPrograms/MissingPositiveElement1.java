package WiproAdvancedPrograms;

import java.util.Scanner;

public class MissingPositiveElement1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking length of an array
        System.out.println("Enter Length Of an Array: ");
        int N = vallidation(scan);

        //create an array
        int arr[] = new int[N];
        int positive_Numbers[] = new int[N];

        //assign values to an array
        System.out.println("Enter values to an array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        //logic to find smallest mising number
        int sum_Of_Elements =0, sum_Of_Numbers =0;
        //finding the the posittive numbers only 
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive_Numbers[j]=arr[i];
                j++;
            }
        }
        //sum of numbers
        int N1=j;
        sum_Of_Numbers = ((N1+1)*(N1+2))/2;
        //sum of the elements
        for(int i=0;i<N1;i++){
            sum_Of_Elements = sum_Of_Elements+positive_Numbers[i];
        }
        System.out.println("Missing Number: "+(sum_Of_Numbers-(sum_Of_Elements)));

    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only: ");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
