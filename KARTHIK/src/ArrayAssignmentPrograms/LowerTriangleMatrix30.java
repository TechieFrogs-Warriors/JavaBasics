package ArrayAssignmentPrograms;

import java.util.Scanner;

public class LowerTriangleMatrix30 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int col=scan.nextInt();

        int a[][]=new int[rows][col];

        if(rows!=col){
            System.out.println("Rows and Coloumns not Equal.");
        }
        else{
            System.out.println("Enter values to Array: ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    System.out.println("Enter value: ");
                    a[i][j]=scan.nextInt();
                }
            }
            System.out.println("Input Matrix: ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
            System.out.println("Low Triangle Matrix: ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    if(j>i){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print(a[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();
    }
}
