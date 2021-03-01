package WiproBasicCodingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class UnionSort4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array-1:");
        int arr1_Len = vallidation(scan);
        System.out.println("Enter length of array-2: ");
        int arr2_Len = vallidation(scan);

        //create 2 arrays
        int arr1[] = new int[arr1_Len];
        int arr2[] = new int[arr2_Len];

        //assign values to an array
        System.out.println("Enter values to an array1: ");
        for(int i=0;i<arr1_Len;i++){
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter values to an array2: ");
        for(int i=0;i<arr2_Len;i++){
            arr2[i] = scan.nextInt();
        }
        //remove duplicates elements in arrays
        arr1 = Arrays.stream(arr1).distinct().toArray();
        arr2 = Arrays.stream(arr2).distinct().toArray();

        //logic 
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            //array1 element smaller then array2 element
            if(arr1[i]<arr2[j]){
               System.out.print(arr1[i]+" ");
                i++;
            }
            //array1 element grater then array 2 element
            else if(arr1[j]<arr2[i]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            //if both are equal
            else {
                System.out.print(arr2[j]+" ");
                i++;
                j++;
            }
        }
        //remaining elements
        while(i<arr1.length){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<arr2.length){
            System.out.print(arr2[j]+" ");
            j++;
        }
           
    }
    //vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
}
