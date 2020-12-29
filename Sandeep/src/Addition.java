import java.util.*;

public class Addition {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = obj.nextInt();
        System.out.println("Enter b value: ");
        int b = obj.nextInt();
        int c = a + b;
        System.out.println(" " + a + " + " + b + " : " + c);
        obj.close();

    }

}
