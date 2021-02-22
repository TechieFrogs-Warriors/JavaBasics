package Accenturepgms;
import java.util.*;

public class Ass19 {
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

        int n=range2;
        
        System.out.println("odd nubers are :");
        for(int i=range1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i +" ");
            }
        }
    }
    
}
