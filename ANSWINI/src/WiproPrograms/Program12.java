package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 
{
    public static int numberOfStudents;

    // input validation
    public static int inputValidation(Scanner sc) 
    {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            numberOfStudents = sc.nextInt();
        } while (numberOfStudents <= 0);

        return numberOfStudents;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        numberOfStudents = inputValidation(sc);// validation for user input
        System.out.println("Enetr score of students : ");

        int[] num = new int[numberOfStudents];//Array

        // Taking elements into array
        for (int i = 0; i < numberOfStudents; i++) 
        {
            num[i] = sc.nextInt();
        }
        // printing the elemts in array
        System.out.println(" score of students is:  ");
        for (int i = 0; i < num.length; i++) 
        {
            System.out.print(num[i] + " ");
        }

        Arrays.sort(num);// sorting array 

        //Printing elements from last of the array(last two values)
        System.out.println("\nlargest score of 2 students are: ");
        for (int i = numberOfStudents - 2; i < num.length; i++) 
        {
            System.out.print(num[i] + " ");
        }

    }
}
