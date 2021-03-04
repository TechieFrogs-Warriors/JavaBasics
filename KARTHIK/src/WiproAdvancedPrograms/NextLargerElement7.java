package WiproAdvancedPrograms;

import java.util.Scanner;

public class NextLargerElement7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //length of an array
        System.out.println("Enter Array length: ");
        int N = vallidation(scan);
        //create an array
        int arr[] = new int[N];
        //insert values to an array
        System.out.println("Enter values to an array");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        int result[]=nextLargeElement(arr, N);//calling the method

        //print the array
        for(int i=0;i<arr.length;i++){
            if(result[i]==0){
                System.out.print ("-1"+" ");//if array conatin 0 it prints -1
            }
            else{
                System.out.print(result[i]+" ");
            }
        }
    }
    //method to find next large number
    public static int[] nextLargeElement(int arr[],int N){
        //logic to find next large
        int result[] = new int[N];//for store arge values
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){//give next large value
                    result[i] =arr[j];//it stores only 1st occurence large value
                    break;
                }
            }
            
        }
        for(int a:result){
            System.out.print(a+" ");
        }
        return result;
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter Positive integer only: ");
                scan.next();
            }
            number = scan.nextInt();
        }while(number<0);
        return number;
    }
}
