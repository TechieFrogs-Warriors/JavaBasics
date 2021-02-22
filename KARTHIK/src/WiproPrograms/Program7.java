package WiproPrograms;

import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = vallidation(scan);
        int A=vallidation(scan);
        int B=vallidation(scan);
        //create an array
        int arr[]=new int[number];
        //assign values to array
        for(int i=0;i<number;i++){
            System.out.println("Enter values: ");
            arr[i]=scan.nextInt();
        }
        //print the array
        for(int a:arr){
            System.out.print(a);
        }
        if(B<number){
            System.out.print("\nOutput: ");
            for(int i=0;i<arr.length;i++){//print upto point A
                if(i==A){
                    for(i=B;i>=A;i--){
                        System.out.print(arr[i]+" ");//print reverse 
                    }
                    break;
                }
                System.out.print(arr[i]+" ");
            }
        }  
        else{
            System.out.println("B value is greater then Number.");
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
