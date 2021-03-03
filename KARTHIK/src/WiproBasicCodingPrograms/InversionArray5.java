package WiproBasicCodingPrograms;

import java.util.Scanner;

public class InversionArray5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //length of an array
        System.out.println("Enter length of an array:");
        int arr_Len = vallidation(scan);
        //create an array
        int arr[] = new int[arr_Len];
        //assign values to an array
        System.out.println("Enter values to array: ");
        for(int i=0;i<arr_Len;i++){
            arr[i] = scan.nextInt();
        }
        int temp =0, count =0;
        for(int i=0;i<arr_Len;i++){
            for(int j=i+1;j<arr_Len;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count ++;
                }
            }
        }
        //print output array
        System.out.println("sorted array: ");
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println("\nNumber of Inversions: "+count);
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
