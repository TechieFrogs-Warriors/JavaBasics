package AssignmentPrograms;

import java.util.*;

public class Program7 {
    public static int m;
    public static int n;

    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            m = sc.nextInt();
        } while (m <= 0);
        // System.out.println("its a Number: " + m);

        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m value : ");
        m = inputValidation(sc);
        System.out.println("Enter n value : ");
        n = inputValidation(sc);
        int arr[] = new int[100];
        int x;
        System.out.println("m series odd");
        for (x = 0; x < m; x++) {
            if (x % 2 == 0) {
                arr[x] = (int) Math.pow(1, m) + x;
                // System.out.print(arr[x] + " ");
            }
            
        }
        System.out.println("\nmth element in m series is : " + arr[x - 1]);
        System.out.println("\nn series even");
        for (x = 1; x <= n; x++) {
            if (x % 2 != 0) {
                arr[x] = (int) Math.pow(1, n) + x;
                // System.out.print(arr[x] + " ");
            }
        }
        System.out.println("\nnth element in the n series is : " + arr[x - 1]);

    }

}
