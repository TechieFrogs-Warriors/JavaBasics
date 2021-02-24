package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= vallidation(scan);
        //create an array
        int arr[]=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter value: ");
            arr[i]=scan.nextInt();
        }
        //input array
        System.out.println("Input array: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        int  max=0,temp=0;
        Arrays.sort(arr);
        //compare the values
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            if(max<=count){
                temp=arr[i];
                max=count;
            }
        }
        System.out.println("\noutput: "+temp);

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
