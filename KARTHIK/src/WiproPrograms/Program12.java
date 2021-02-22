package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=vallidation(scan);
        int arr[]=new int[number];
        //assign values to array
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter value: ");
            arr[i]=scan.nextInt();
        }
        //input array
        System.out.println("Input array: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        //sort array
        Arrays.sort(arr);
        //output
        System.out.println("\nLarge 2 values to give maximum sum value are:");
        System.out.println(arr[arr.length-1]+"\n"+arr[arr.length-2]);
    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer value Only: ");
                scan.next();
            }
        number=scan.nextInt();
        }
        while(number<=0);
        return number;
    }
}
