package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class PerfectNumber5 {
    public static void main(String[] args) {
        Scanner scan1= new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        int start, end;
        do{
            System.out.println("Enter starting and ending values:");
            while(!scan1.hasNextInt() | !scan2.hasNextInt()){
                System.out.println("Please Enter Integer values only: ");
                scan1.next();
                scan2.next();
            }
            start=scan1.nextInt();
            end=scan2.nextInt();
        }
        while(start<=0&&end<=0);

        for(int i=start;i<end;i++){//for loop for cheak each Number perfect or not
            if(perfect(i)){
                System.out.println(i+": is perfect Number");
            } 
        }
        
        scan1.close();
        scan2.close();
    }
    //static method
    public static boolean perfect(int Number) {
        int sum=1;
        //to find sum of didvisors
        for(int i=2;i*i<=Number;i++){
            if(Number % i == 0){
                if(i*i!=Number){
                sum=sum+i+Number/i;
                }
                else{
                    sum=sum+i;
                }
            }
        }
        //sum of the divisors equal to Number is perfect Number
        if(sum==Number){
            return true;
        }
        return false;
    }
}
