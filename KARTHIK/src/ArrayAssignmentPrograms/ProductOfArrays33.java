package ArrayAssignmentPrograms;

import java.util.Scanner;

public class ProductOfArrays33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int col=scan.nextInt();
    
        int a[][]=new int[rows][col];
        int b[][]=new int[rows][col];
        int c[][]=new int[rows][col];
        System.out.println("Enter values to 1st Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value: ");
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Values to 2nd Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter Value: ");
                b[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Multiplication matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                c[i][j]=0;
                for(int k=0;k<rows;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
