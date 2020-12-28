import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1, n2, lcm;
        System.out.println("------ Validation for  number n1 ------");
        do {
            System.out.println("enter  Postive Number n1 : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n1 : ");
                obj.next();
            }
            n1 = obj.nextInt();
        } while (n1 <= 0);
        System.out.println("its a Number n1 : " + n1);

        System.out.println("------ Validation for  number n2 ------");
        do {
            System.out.println("enter  Postive Number n2 : ");
            while (!obj.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number n2 : ");
                obj.next();
            }
            n2 = obj.nextInt();
        } while (n2 <= 0);
        System.out.println("its a Number n2 : " + n2);

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // always true
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println(" The LCM of " + n1 + " and " + n2 + " is : " + lcm);
                break;
            }
            ++lcm;
        }
        obj.close();
    }

}
