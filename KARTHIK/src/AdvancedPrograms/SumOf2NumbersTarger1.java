package AdvancedPrograms;

import java.util.Scanner;

public class SumOf2NumbersTarger1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Target Sum Value: ");
        int t=scan.nextInt();
        System.out.println("Enter Length Of An Array: ");
        int len=scan.nextInt();
        int a[]=new int[len];

        for(int i=0;i<len;i++){
            System.out.println("Enter Values: ");
            a[i]=scan.nextInt();
        }
        int i,j,count=0;
        for( i=0;i<len;i++){
            for( j=i+1;j<len;j++){
                if(a[i]+a[j]==t){
                    System.out.println("This Pair Gives Target: "+a[i]+"+"+a[j]+"="+t);
                    count=1;
                }
                else{
                    count=0;
                }
            }
        }
        if(count == 1){
            System.out.println("Pairs Are Found.");
        }
        else{
            System.out.println("There is no Pairs to Give target value.");
        }
        scan.close();
    }
}
