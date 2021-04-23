package InterViewCoddingQuestions;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :: ");
        int length = sc.nextInt();

        System.out.println("enter elements in the array :: ");
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length + 1;

        int sum = n * (n + 1) / 2;// formula for sum of prefect numbers

        int add = 0;

        for (int i = 0; i < arr.length; i++) {
            add += arr[i];// adding all the numbers taken
        }

        int missingnumer = sum - add;

        System.out.println("Missing number is :: " + missingnumer);

    }
}
