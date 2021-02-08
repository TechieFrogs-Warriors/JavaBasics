package ArrayAssignmentPrograms;

import java.util.Scanner;

public class CopyArrayToAnotherArray1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter values of an array: ");
        int n=scan.nextInt();
        int a[]=new int[5];
        System.out.println("Values of a is: ");
        for(int i=0;i<n;i++){
            System.out.println("Enter value:");
            a[i]=scan.nextInt();
        }
        System.out.println("Copy values are:");
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            System.out.print(c[i]+" ");
        }
        scan.close();
    }
}
