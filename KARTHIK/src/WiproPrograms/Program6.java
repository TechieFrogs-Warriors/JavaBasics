package WiproPrograms;

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = vallidation(scan);
        //create array
        int arr[] = new int[number];
        //assigning values to array
        System.out.println("Enter values to an array: ");
        for(int i=0;i<number;i++){
            System.out.print("Enter Number: ");
            arr[i]=scan.nextInt();
        }
        //print input array
        for(int a: arr){
            System.out.print(a+" ");
        }
        //cheak cube or not
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                int cube = j*j*j;
                if(cube==arr[i]){
                    count ++;
                }
            }
        }
        System.out.println("\nNumber of perfect cubes are: "+count);
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
