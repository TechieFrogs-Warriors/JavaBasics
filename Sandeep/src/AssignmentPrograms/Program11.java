package AssignmentPrograms;

import java.util.*;

public class Program11 {
    public int sum(int number)

    {
        int sum = 0;// intilizing the sum to u to add the factors
        for (int i = 1; i <= number; i++)// loop to iterate till the giver number
        {
            if (number % i == 0)// if remider is zero then the condition excutes
            {
                sum += i;// adding of factors
            }
        }
        System.out.println("Sum of factors of " + number + " is :: " + sum);
        // now again performing the adding of factors for the output
        number = sum;// asigninh the sum to num
        int sum1 = 0;
        for (int i = 1; i <= number; i++) {// loop iterating till the given number
            if (number % i == 0) {// if reminder is zero condtion excutes
                sum1 += i;// adding of factors
            }
        }
        System.out.println("Sum of factor of " + number + " is :: " + sum1);
        if (sum == sum1) {// if the both the sum of factors are equal then retrns 1
            return 1;
        } else {// if the both the sum of factors are not equal then returns 0
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// taking user input
        int number;
        // validation for input
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        Program11 obj = new Program11();

        System.out.println(obj.sum(number));
        sc.close();

    }
}