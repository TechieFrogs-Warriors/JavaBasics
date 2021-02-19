package ArrayAssignmentPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArray21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length of an array: ");
        int l=scan.nextInt();
        int a[]=new int[l];
        int b[]=new int[l];
        int d=a.length;
        for(int i=0;i<l;i++){
            System.out.println("Enter values: ");
            a[i]=scan.nextInt();
        }
        int j=0;
        Arrays.sort(a);
        for(int i=0;i<d-1;i++){
            if(a[i]!=a[i+1]){
                b[j]=a[i];
            }
        }
        b[j]=a[d-1];
        
        System.out.println("Duilcate elements: ");
        for(int ch:b){
            System.out.print(ch+" ");
        }
      scan.close(); 
    }
}
