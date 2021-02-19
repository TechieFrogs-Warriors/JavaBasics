package ArrayAssignmentPrograms;

import java.util.Scanner;

public class DuplicateElement4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size Of an Array");
        int n=scan.nextInt();
        char a[]=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Charecter value");
            a[i]=scan.next().charAt(0);
        }

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Elements: "+a[i]);
                    break;
                }
            }
        }
        scan.close();
    }
}
