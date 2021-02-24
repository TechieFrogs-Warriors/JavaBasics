package WiproPrograms;

import java.util.Scanner;

public class Program16 {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      
       int num = vallidation(scan);
       
       int[] number = new int[num];
       int arr[]=new int[num];
       int arr1[]=new int[num];
       int arr2[]=new int[num];
       //assigning values to an array
       for (int i = 0; i < num; i++) {
           System.out.println("Enter value: ");
           number[i] = scan.nextInt();
        }

       // find the maximum digit
       for (int i = 0; i < num; i++) {
           arr[i] = large(number[i]);
        }
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       System.out.println(sum);
       for(int i=0;i<arr.length;i++){
           arr2[i]=number[i];
           arr1[i] = s_Large(arr2[i]);
       }
    int sum1 = 0;
    for (int i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
    }
    System.out.println("sum of second largest values : " + sum1);
    int diff = sum - sum1;
    System.out.println(diff);

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
    //large number
    public static int large(int num) {
        int large = 0;
        while (num != 0) {
            int reminder = num % 10;
            large = Math.max(reminder, large);
            num = num / 10;

        }
        return large;
    }
    //second large
    public static int s_Large(int num){
        System.out.println("large_2"+num);
        int rem= 0, largest = 0;
        int secondL = 0;
        while (num != 0) {
            rem = num % 10;
            if (largest < rem) {
                secondL = largest;
                largest = rem;
            } 
            else if (rem >= secondL)
                secondL = rem;
            num = num / 10;
        }
        System.out.println(secondL);
        return secondL;
    }
}
