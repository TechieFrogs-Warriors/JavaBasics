package AssignmentPrograms;

import java.util.*;

public class Program23 {
    // method to find the number of cards used in pyramid
    public int CardsPyramid(int level) {
        return level * (3 * level + 1) / 2;// formula for finding the number of cards used to build pyrmid

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // validation for user input
        int level;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            level = sc.nextInt();
        } while (level <= 0);
        System.out.println("its a Number: " + level);

        Program23 obj = new Program23();// creating a object and calls method
        System.out.println("the number of cards used is :: " + obj.CardsPyramid(level));
        sc.close();

    }

}
