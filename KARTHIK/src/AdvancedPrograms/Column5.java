package AdvancedPrograms;

import java.util.Scanner;

public class Column5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number O f Rows: ");
        int Rows=scan.nextInt();
        System.out.println("Enter Number Of Columns: ");
        int Col=scan.nextInt();

        System.out.println("Enter Column Which One Ascending:");
        int n1=scan.nextInt();
        int n2=n1+1;

        int a[][]=new int[Rows][Col];
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Col;j++){
                System.out.println("Enter Value: ");
                a[i][j]=scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Input Array: ");
        for(int i=0;i<Rows;i++){
            for(int j=0;j<Col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<Rows;i++)
        {
            for(int j=n1;j<n2;j++)
            {
                for(int k=0;k<Rows;k++)
                {
                    for(int l=n1;l<n2;l++)
                    {
                        if(a[k][l]>a[i][j])
                        {
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