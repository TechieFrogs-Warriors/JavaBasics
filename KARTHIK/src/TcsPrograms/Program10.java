package TcsPrograms;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n_P=vallidation(scan);
        //create an array
        int arr[]=new int[n_P];
        //assign ages to array
        System.out.println("Enter ages");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int fees1=0,fees2=0,fees3=0;
        //logic
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 & arr[i]<17){
                fees1=fees1+200;
            }
            else if(arr[i]>=17 && arr[i]<40){
                fees2= fees2+400;
            }
            else if(arr[i]>=40 && arr[i]<120){
                fees3= fees3+300;
            }
        }
        int total=fees1+fees2+fees3;
        System.out.println("Total Income: "+total);
    }
    //int valliadation
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
}
