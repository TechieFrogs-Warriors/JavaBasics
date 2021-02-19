package AssignmentPrograms;

import java.util.*;

public class Program14 {
    public void digitRoot(int number) {
        int sum = 0;// intilizing the sum to 0 for adding the number
        int reminder;
        while (number >= 10) {// this loop iterates till the number is less than 10
            sum = 0;
            while (number != 0) {// this loop iterates till the number is 0
                reminder = number % 10;// gets the remider value i.e last digit
                number = number / 10;// gets Queficent value exept the last digit in a number
                sum = sum + reminder;// every time remider gets added to sum
            }
            if (sum >= 10)// if sum is greater then 10 agin sum is assigned to number and again while loop
                          // iterates
            {
                number = sum;
            }
        }
        System.out.println("DigiRoot of the number is :: " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // validation for the user input
        int number;
        do {
            System.out.println("enter   Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        Program14 obj = new Program14();// created a object
        obj.digitRoot(number);// calling a method using object
        sc.close();

    }

}
