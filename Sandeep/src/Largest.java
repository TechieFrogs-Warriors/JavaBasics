import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a;

        System.out.println("------ Validation for  number a ------");
        do {
            System.out.println("enter  Postive Number a : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n1 : ");
                obj.next();
            }
            a = obj.nextInt();
        } while (a <= 0);
        System.out.println("its a Number a : " + a);

        int b;

        System.out.println("------ Validation for  number b ------");
        do {
            System.out.println("enter  Postive Number b : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n1 : ");
                obj.next();
            }
            b = obj.nextInt();
        } while (b <= 0);
        System.out.println("its a Number b : " + b);

        int c;

        System.out.println("------ Validation for  number c ------");
        do {
            System.out.println("enter  Postive Number c : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n1 : ");
                obj.next();
            }
            c = obj.nextInt();
        } while (c <= 0);
        System.out.println("its a Number c : " + c);

        if (a > b && b > c) {
            System.out.println(" a is Larger than b , c ");
        } else if (b > a && b > c) {
            System.out.println(" b is Larger than a , c ");
        } else if (c > a && c > b) {
            System.out.println(" c is Larger than a , b");
        } else {
            System.out.println(" a , b , c values are equal");
        }
        obj.close();
    }
}
