package AccentureCodeAssesmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortDecendingOrder8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //intilize an array
        int len;
        //validation
        do{
            System.out.println("Enter integer value as Length:");
            while(!scan.hasNext()){
                System.out.println("Please Enter an Integer Value only:");
                scan.next();
            }
            len=scan.nextInt();
        }
        while(len<=0);
        //array initilization
        int arr[]=new int[len];
        //assigning values to array
        System.out.println("Enter values to Array");
        for(int i=0;i<len;i++){
            System.out.println("Enter value:");
            arr[i]=scan.nextInt();
        }
        //sorting
        Arrays.sort(arr);
        
        for(int i=len-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}
