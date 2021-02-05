package ArrayAssignmentPrograms;

import java.util.Scanner;

public class ReverseOrder6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size Of an Array");
        int n=scan.nextInt();
        char a[]=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Charecter value");
            a[i]=scan.next().charAt(0);
        }
        for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");  
        }  
        System.out.println(); 
        for (int i = a.length-1; i >= 0; i--) {  
            System.out.print(a[i] + " "); 
        }
        scan.close();
    }
}
