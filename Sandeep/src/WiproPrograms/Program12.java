package WiproPrograms;

import java.util.*;

public class Program12 {
    public static int numberOfStudents;

    // input validation
    // validation method
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            numberOfStudents = sc.nextInt();
        } while (numberOfStudents <= 0);

        return numberOfStudents;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numberOfStudents = inputValidation(sc);// input validation for user input
        System.out.println("Enetr score of students :: ");

        int[] num = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {// tacking input to elemts into array
            num[i] = sc.nextInt();
        }
        System.out.println(" socore of students are ");
        for (int i = 0; i < num.length; i++) {// printing the elemts in array
            System.out.print(num[i] + " ");
        }

        Arrays.sort(num);// sorting array using the Arrys.sort() method

        System.out.println("\nlargest score of 2 studets are");
        for (int i = numberOfStudents - 2; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }

}
