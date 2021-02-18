package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class MaximumProductOfArray {
    public static void main(String[] args) {

        Scanner scan1= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);

        int row, col;
        //vallidation
        do{
            System.out.println("Enter Number of rows and columns: ");
            while(!scan1.hasNextInt()|!scan2.hasNextInt()){
                System.out.println("Please Enter integers only.");
                scan1.next();
                scan2.next();
            }
            row = scan1.nextInt();
            col = scan2.nextInt();
        }
        while(row<=0 && col<=0);

        //create array1
        int arr1[][]=new int[row][col];
        //assign values to array
        System.out.println("Enter Values to array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value: ");
                arr1[i][j]=scan1.nextInt();
            }
            System.out.println();
        }
        //create array2
        int arr2[][]=new int[row][col];
        //assign values to array
        System.out.println("Enter Values to array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value: ");
                arr2[i][j]=scan1.nextInt();
            }
            System.out.println();
        }
        
        //create matrix to store result
        int arr3[][]=new int[row][col];
        
        //2-D array multplication
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=0;
                for(int k=0;k<row;k++){
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        //finding max value
        int max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr3[i][j]>max){
                    max=arr3[i][j];
                }

            }
        }
        System.out.println("Maximum Product of matrix is "+max);//printing max product 
        scan1.close();
        scan2.close(); 
    }
}
