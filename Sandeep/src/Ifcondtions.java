import java.util.*;

public class Ifcondtions {
    public static void main(String[] args) {
        System.out.println("----else if ladder--------");
        Scanner obj = new Scanner(System.in);
        int a;
        System.out.println("Enter a:: ");
        a = obj.nextInt();

        int b;
        System.out.println("Enter b:: ");
        b = obj.nextInt();

        int c;
        System.out.println("Enter c:: ");
        c = obj.nextInt();

        int d;
        System.out.println("Enter d:: ");
        d = obj.nextInt();

        if (a > b && a > b && a > c) {
            System.out.println("a is greater than b,c,d");

        } else if (b > a && b > c && b > d) {
            System.out.println("b is greater than a,c,d ");

        } else if (c > a && c > b && c > d) {
            System.out.println("c is greater than a,b,d");

        } else if (d > a && d > b && d > c) {
            System.out.println("d is greater than a,b,c");
        } else {
            System.out.println("a,b,c,d are equal");
        }
        obj.close();
    }

}
