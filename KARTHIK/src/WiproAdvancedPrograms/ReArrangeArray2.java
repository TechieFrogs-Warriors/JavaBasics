package WiproAdvancedPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //array length
        System.out.println("Enter length of an array: "); 
        int arr_Length = vallidation(scan);
        //input array
        int arr[] = new int[arr_Length];
        //assign values to an array
        System.out.println("Enter values to an Array: ");
        for(int i=0;i<arr_Length;i++){
            arr[i] = scan.nextInt();
        }
        //sort the array
        Arrays.sort(arr);

        //logic to print array elements
        System.out.println("\nOutput: ");
        int i=0,j=arr.length-1,k=0;
        while(i<arr_Length){//ittrate loop
            if(i%2==0){//if even it prints last element
                System.out.print(arr[j]+" ");
                j--;
            }
            else{//if odd it prints first element
                System.out.print(arr[k]+" ");
                k++;
            }
            i++;
        }
       
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
