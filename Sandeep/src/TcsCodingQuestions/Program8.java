package TcsCodingQuestions;

import java.util.*;

public class Program8 {
    // validation method for the string input
    public static String inputValidationS(Scanner sc) {
        String name;
        do {
            // System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z,]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            name = sc.nextLine();
        } while (name.equals(""));
        return name;
    }

    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            // System.out.println("enter Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter parent name ::");
        String parentName = inputValidationS(sc);// input string

        System.out.println("Do parnt has child or nor Y or N");
        char YN = sc.next().charAt(0);// input float

        int schemeAmount = 5000;
        int parentCommsion;

        if (YN == 'N') {// condition excutes if the parrent does not have any child
            System.out.println("Total members : " + "1");
            System.out.println("Commision Details ");
            parentCommsion = 500;// itonally parrent will get commision 500
            System.out.println("Total members : 0\n" + parentName + " : " + parentCommsion + "INR");

        } else {// condition excutes if the parent has childs
            System.out.println("Enter Child names:");
            String[] childName = inputValidationS(sc).split(",");// taking input of child by using the split
            System.out.println("Total members : " + childName.length);// counting the number of child
            System.out.println("Commision details ");
            parentCommsion = childName.length * 500;// parent commsion details
            System.out.println(parentName + " : " + parentCommsion + "INR");

            for (int i = 0; i < childName.length; i++) {// loop for printh the childs and there commision details
                System.out.println(childName[i] + ": " + "250 INR");

            }

        }
    }

}
