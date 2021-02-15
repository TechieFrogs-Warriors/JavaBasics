package AdvancedPrograms;

import java.util.Scanner;

public class Sort2DArray4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number O f Rows: ");
        int Rows=scan.nextInt();
        System.out.println("Enter Number Of Columns: ");
        int Col=scan.nextInt();

        int a[][]=new int[Rows][Col];
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Col;j++){
                System.out.println("Enter Value: ");
                a[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Col;j++){
                for(int k=0;k<Rows;k++){
                    for(int l=0;l<Col;l++){
                        if(a[k][l]>a[i][j]){
                            int temp=a[i][j];
                            a[i][j]=a[k][l];
                            a[k][l]=temp;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted 2-D Array: ");
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
