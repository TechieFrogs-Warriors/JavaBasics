package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class SumOfTheOddNumbers19 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int start,end;
        do{
            System.out.println("Enter 2 Integer Value: ");
            while(!scan1.hasNextInt()|!scan2.hasNextInt()){
                System.out.println("Enter Only Integer Values:");
                scan1.next();
                scan2.next();
            }
            start=scan1.nextInt();
            end=scan2.nextInt();
        }
        while(start<=0&&end<=0);
        int odd_Sum=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                odd_Sum=odd_Sum+i;
            }
        }
        System.out.println("Sum Of the Odd Numbers in the given Range "+start+" - "+end+" is :"+odd_Sum);
        scan1.close();
        scan2.close();
    }
}
