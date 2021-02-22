package WiproPrograms;

import java.util.*;

public class Program16 {
    public static int size;

    // input validation
    // validation method
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            size = sc.nextInt();
        } while (size <= 0);

        return size;
    }

    // method for finding large digit in a number
    public static int large(int num) {
        int large = 0;
        while (num != 0) {
            int reminder = num % 10;// returnd reminder i.e last digit in anumber

            large = Math.max(reminder, large);// finds the smallest value
            num = num / 10;// returns quefient i.e gives the number excpt last digit

        }
        // System.out.println(large);
        return large;

    }

    public static int secondL(int num) {
        int reminder = 0, Largest = 0;
        int secondL = 0;
        while (num != 0) {// whike itertes till the number is 0
            reminder = num % 10;// geting coficent value
            if (Largest < reminder) {// if largest is greater than reminder
                secondL = Largest;
                Largest = reminder;// value isnassigned to reminder
            } else if (reminder >= secondL)
                secondL = reminder;// if remider gerter than value is assinged to second value
            num = num / 10;// gets the values expt the first one
        }

        System.out.println("The Second Largest Digit is " + secondL);
        return secondL;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr bar code number : ");
        size = inputValidation(sc);// input validation
        System.out.println("Enetr numbers :: ");

        int[] number = new int[size];
        for (int i = 0; i < size; i++) {// tacking input to elemts into array
            number[i] = sc.nextInt();
        }
        int arr[] = new int[size];
        arr = number.clone();

        // calculating the every number to find the maximum digit
        for (int i = 0; i < size; i++) {
            number[i] = large(number[i]);

        }
        int resultl = 0;
        for (int i = 0; i < size; i++) {
            resultl += number[i];
        }
        System.out.println("sum of 1st largest values : " + resultl);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = secondL(arr[i]);
        }
        int result2 = 0;
        for (int i = 0; i < arr.length; i++) {
            result2 += arr[i];
        }
        System.out.println("sum of second largest values : " + result2);
        int diff = resultl - result2;
        System.out.println(diff);

    }

}
