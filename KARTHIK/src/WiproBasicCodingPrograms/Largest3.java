package WiproBasicCodingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr_Len = vallidation(scan);
        // create an array
        int arr[] = new int[arr_Len];

        //assign values to an array
        for(int i=0;i<arr_Len;i++){
            arr[i]=scan.nextInt();
        }

        //sort an array
        Arrays.sort(arr);

        System.out.println("1st Largest Number: "+arr[arr_Len-1]);//first largest number
        //give second largest number
        int s_large = 0;
        for(int i=0;i<arr_Len;i++){
            if(arr[i]<arr[arr_Len-1]){//if value less then 1st large 
               s_large = Math.min(arr[i], arr[arr_Len-1]);//2nd large number in the array
            }
        }
        System.out.println("2nd Largest Number: "+s_large);
    }
    //vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
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
