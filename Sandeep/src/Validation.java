import java.util.*;

public class Validation {
    public static void main(String[] args) {

        System.out.println("------------ validation for Positive Integer ------------");

        Scanner sc = new Scanner(System.in);

        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        float i;
        do {
            System.out.println("Enter Floting point Number: ");
            while (!sc.hasNextFloat()) {
                System.out.println("This is not a floating point number.Please Enter floating point number:");
                sc.next();
            }
            i = sc.nextFloat();
        } while (i >= 2536.2558);
        System.out.println("The floating point number: " + i);

        String s;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            s = sc.nextLine();
        } while (s != "");
        System.out.println("Enter  String Is valid ");
        sc.close();

    }

}
