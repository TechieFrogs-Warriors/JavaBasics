import javax.lang.model.util.ElementScanner14;

public class Ifcondtions {
    public static void main(String[] args) {
        System.out.println("----else if ladder--------");
        int a = 50;
        int b = 50;
        int c = 50;
        int d = 50;
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
    }

}
