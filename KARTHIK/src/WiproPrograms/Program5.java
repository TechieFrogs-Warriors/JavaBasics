package WiproPrograms;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number = vallidation(scan);

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
         //logic
         System.out.println("Output: ");
         int sum;
         for(int i=0;i<arr.length;i++){
            sum=0;
            while(arr[i]!=0){
                int rem=arr[i]%10;
                sum=sum+rem;
                arr[i]=arr[i]/10;
            }
            System.out.print(sum+" ");
         }
    }
    //vallidatin
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
