package AdvancedPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length of Array: ");
        int len=scan.nextInt();

        String a[]=new String[len];

        for(int i=0;i<len;i++){
            System.out.println("Enter String: ");
            a[i]=scan.nextLine();
        }
        System.out.println("Array a:");
        for(String ch:a){
            System.out.print(ch+" ");
        }
        System.out.println("\nArray to String: "+Arrays.toString(a));
        scan.close();
    }
}
