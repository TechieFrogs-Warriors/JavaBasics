package AccentureCodeAssesmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FeetsAndInches23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        //validation part
        do{
            System.out.println("Enter Number of values: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer Value Only:");
                scan.next();
            }
            number=scan.nextInt();
        }
        while(number<=0);
        //creating an array
        int arr1[]=new int[number];
        int arr2[]=new int[number];
        //assaign feet values to an array
        for(int i=0;i<number;i++){
            System.out.println("Enter feets: ");
            arr1[i]=scan.nextInt();
        }
        //assign inch values to arrays
        for(int j=0;j<number;j++){
            System.out.println("Enter Inches");
            arr2[j]=scan.nextInt();
        }
        //create an array to store result
        int arr3[]=new int[number];
        //convert feets to inches
        for(int i=0;i<number;i++){
            arr3[i]=(arr1[i]*12)+arr3[i];
        }
        //sort the array
        Arrays.sort(arr3);
        // for(int ch:arr3){
        //     System.out.print(ch+" ");
        // }
        System.out.println("Maximum Height of the tree is"+arr3[arr3.length-1]+" inches.");
        scan.close();
    }
}
