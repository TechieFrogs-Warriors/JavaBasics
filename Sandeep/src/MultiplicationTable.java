import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("------ Validation for  number ------");
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                obj.next();
            }
            number = obj.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        // multipication table
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }

        obj.close();

    }

}
