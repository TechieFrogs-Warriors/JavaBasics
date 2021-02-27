package TcsPrograms;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int position = vallidation(scan);
        int position_1=0,position_2=0,j=0;
        //create an array
        int arr[]= new int[position];
        arr[j]=position_1;//value 0 is assign to arr[0]
        j++;
        arr[j]=position_2;//value 0 is assign to arr[1]
        j++;
        //logic
        for(int i=1;i<=position-2;i++){
            if(position%2==0){
                position_1=position_1+6;
                arr[j]=position_1;
                j++;
            }
            else{
                position_2=position_2+7;
                arr[j]=position_2;
                j++;
            }
        }
        System.out.println(arr[position-1]);
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
