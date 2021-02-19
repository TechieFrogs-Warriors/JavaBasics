package AssignmentPrograms;

import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        // validation for input length
        do {
            System.out.println("enter  Length of Array : ");
            while (!sc.hasNextInt()) {// cheks if any non integer input
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            len = sc.nextInt();
        } while (len <= 0);
        System.out.println("its a Number: " + len);
        // input for array
        int arr[] = new int[len];
        // intilizing the array elements
        System.out.println("Enter Elements in array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // code for sum of odd and even
        int sumeven = 0, sumodd = 0;
        for (int i = 0; i < arr.length; i++)// foor loop of iterating the full array
        {
            if (arr[i] % 2 == 0)// if even this condtion is executed
            {
                sumeven += arr[i];// adds the even numbers
            } else if (arr[i] % 2 != 0)// if odd thiscondition is excuted
            {
                sumodd += arr[i];// adds the odd nunbers
            }
        }
        System.out.println("Sum of odd numbers : " + sumodd + "\n\n Sum of Even numbers : " + sumeven);
        sc.close();

    }

}
