package ArrayAssignmentPrograms;

import java.util.Scanner;

public class SumRowsColumns34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int col=scan.nextInt();

        int a[][]=new int[rows][col];

        System.out.println("Enter values to  Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value: ");
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }

        int sumRow,sumCol;
        System.out.println("Sum of The Values Of Rows and Columns: ");

        for(int i=0;i<rows;i++){    
            sumRow=0;    
            for(int j=0;j<col;j++){    
              sumRow=sumRow+a[i][j];    
            }    
            System.out.println("Sum of The :" + (i+1) +" :Row: " + sumRow);    
        } 
        for(int i=0;i<col;i++){    
            sumCol=0;    
            for(int j=0;j<rows;j++){    
              sumCol=sumCol+a[j][i];    
            }    
            System.out.println("Sum of The :" + (i+1) +" :column: " + sumCol);    
        } 
        scan.close();
    }
}
