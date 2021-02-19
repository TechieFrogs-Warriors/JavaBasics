package Accenturepgms;
import java.util.*;


public class Ass5
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// user input
        int range1;
        // validation for input 1st number
        do {
            System.out.println("enter  range1 : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range1 = sc.nextInt();
        } while (range1 <= 0);
        System.out.println("its a Number: " + range1);

        // input for the second number
        int range2;
        // validation for the second number
        do {
            System.out.println("enter range2 : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            range2 = sc.nextInt();
        } while (range2 <= 0);
        System.out.println("its a Number: " + range2);

        int sum=0;
        for(int i=range1;i<range2;i++){
            sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==i && sum!=0){
                System.out.println(i );
            }
        }
        
    }
    
}
