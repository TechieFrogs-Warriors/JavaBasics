package ArrayAssignmentPrograms;

import java.util.Scanner;

public class PrintElementsOfArray5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of an Array: ");
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter Values Of an Array: ");
            a[i]=scan.nextInt();
        }

        System.out.println("The Elements in Array:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        scan.close();
    }
}
