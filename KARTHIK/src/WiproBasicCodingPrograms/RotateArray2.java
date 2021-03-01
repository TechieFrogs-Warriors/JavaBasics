package WiproBasicCodingPrograms;

import java.util.Scanner;

public class RotateArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //length of an array
        System.out.println("Enter array length: ");
        int arr_Len = vallidation(scan);
        System.out.println("Enter Number of rotations: ");
        int D = vallidation(scan);
       
        //create an array
        int arr[] = new int[arr_Len];
        
        //assign values to an array
        System.out.println("Enter elements to array:");
        for(int i=0;i<arr_Len;i++){
            arr[i] = scan.nextInt();
        }

        //logic 
        int j=0;
        while(D>0){//itrates 2 times
            int temp = arr[arr_Len-1];//last array value
            for(j=arr_Len-1;j>0;j--){//its rotate all values except last one
                arr[j]=arr[j-1];
            }
            arr[j]=temp;//last value is assign to 1st position
            D--;
        }
        //print rotation array
        for(int a:arr){
            System.out.print(a+" ");
        }
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
