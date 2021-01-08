import java.util.*;

public class MethodExample {

    public static void largeNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is a Large number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Large number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is a Large number");
        } else {
            System.out.println("All are Equal");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int num1 = obj.nextInt();

        System.out.println("Enter number2 : ");
        int num2 = obj.nextInt();

        System.out.println("Enter number3 : ");
        int num3 = obj.nextInt();

        largeNumber(num1, num2, num3);

        obj.close();
    }
}
