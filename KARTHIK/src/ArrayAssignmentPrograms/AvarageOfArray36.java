package ArrayAssignmentPrograms;

import java.util.Scanner;

public class AvarageOfArray36 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number Of Rows: ");
        int rows=scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int col=scan.nextInt();

        int a[][]=new int[rows][col];

        System.out.println("Enter values to Array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter value: ");
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sum=sum+a[i][j];
            }
        }
        System.out.println("sum: "+sum);
        System.out.println("length :"+a.length);
        System.out.println("Avarge of an Array: "+(sum/a.length));
        scan.close();
    }
}
