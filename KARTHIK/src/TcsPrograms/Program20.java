package TcsPrograms;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = vallidation(scan);
        int end = vallidation(scan);
        amstrong(start, end);
    }
    //input vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
    //amstrong method
    public static void amstrong(int start, int end){
        int amstrong,temp=0,sum;
        if(start<=0 || end<=0 || start>end){
            System.out.println("Wrong input.");
        }
        else{
            for(int i=start;i<=end;i++){
                temp = i;
                sum=0;
                while(temp!=0){
                    amstrong=temp%10;
                    sum=sum+(amstrong*amstrong*amstrong);
                    temp=temp/10;
                }
                if(i==sum){
                    System.out.println(i);
                }
            }
        }
        
    }  
}
