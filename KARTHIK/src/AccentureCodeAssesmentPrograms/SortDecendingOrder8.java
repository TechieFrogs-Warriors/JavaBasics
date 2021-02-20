package AccentureCodeAssesmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortDecendingOrder8 {
    public static int row=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len;
        do{
            System.out.println("Enter Length of an array: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer as a Length: ");
                scan.next();
            }
            len=scan.nextInt();
        }
        while(len<=0);

        //intilize an array
        int arr[]=new int[len];

        //assigning values to array
        for(int i=0;i<len;i++){
            System.out.println("Enter value: ");
            arr[i]=scan.nextInt();
        }
        //initizing 2-D array
        int brr[][]=new int[arr.length][2];

        //sort the array
        Arrays.sort(arr);

        // inserting elements and frequency in 2-D array
        brr[row][0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                brr[row][1]=brr[row][1]+1;
            }
            else{
                row++;
                brr[row][0]=arr[i];
            }
        }
        row++;
        
        //sorting 2-D array
        brr=sort(brr);

        //for printing final sorted 2-D array
        for(int i=0;i<row;i++){
            for(int j=0;j<=brr[i][1];j++){
                System.out.print(brr[i][0]+" ");
            }
            //System.out.print("");

            scan.close();
        }
    }
    public static int[][] sort(int brr[][]){
       //temp array
        int crr[]=new int[2];

        //sorting 2-D rray
        for(int i=0;i<row;i++){
            for(int j=i;j<row;j++){
                if(brr[i][1] < brr[j][1]){
                    crr = brr[i];
                    brr[i]=brr[j];
                    brr[j]=crr;
                }
            }
        }
        return brr;
    }
}
