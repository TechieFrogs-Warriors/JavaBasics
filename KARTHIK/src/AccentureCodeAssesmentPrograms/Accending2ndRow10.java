package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class Accending2ndRow10 {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int len;
       //validation
        do{
            System.out.println("Enter Integer Value: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value only: ");
                scan.next();
            }
            len=scan.nextInt();
        }
        while(len<=0);
       //2-D array
       int arr[][]=new int[len][len];

       //initilize Values to an Array
       for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
               System.out.print("Enter value: ");
               arr[i][j]=scan.nextInt();
           }
           System.out.println();
        }

        //sort 2nd row assending order
        for(int i=1;i<len-1;i++){
            for(int j=0;j<len;j++){
                for(int k=1;k<len-1;k++){
                    for(int l=0;l<len;l++){
                        if(arr[k][l]>arr[i][j]){
                            int temp=arr[k][l];
                            arr[k][l]=arr[i][j];
                            arr[i][j]=temp;
                        }   
                    }
                }
            }
        }
        //print array after sorting
        System.out.println("Sorted 2-D array:");
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    } 
}
