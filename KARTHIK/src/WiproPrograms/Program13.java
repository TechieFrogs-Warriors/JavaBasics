package WiproPrograms;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number = vallidation(scan);
        System.out.println("Enter starting value:");
        int start=vallidation(scan);
        System.out.println("Enter ending value: ");
        int end=vallidation(scan);

        //create array
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter values: ");
            arr[i]=scan.nextInt();
        }
        //input arry
        System.out.println("Input array: ");
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println("\nOther values then range:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<start || arr[i]>end){
                System.out.print(arr[i]+" ");
            }
        }
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
