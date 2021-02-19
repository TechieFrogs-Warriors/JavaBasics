package StringAssignmentPrograms2;

import java.util.Scanner;

public class StringDivideNparts {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();
        int l=str.length();

        System.out.println("Enter Number: ");
        int n=scan.nextInt();
        int n1=l/n;
        String s;

        if(l%n==0){
            for(int i=0;i<n;i++){
                s=" ";
                for(int j=i*n1;j<n1*(i+1);j++){
                    s=s+str.charAt(j);
                }
                System.out.println(s);
            }
        }
        else{
            System.out.println("String can not be splited into equal parts.");
        }
        scan.close();
    }   
}