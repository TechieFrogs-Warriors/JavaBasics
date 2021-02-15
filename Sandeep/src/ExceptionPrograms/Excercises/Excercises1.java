package ExceptionPrograms.Excercises;

import java.util.*;

public class Excercises1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number--");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            int c = a + b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

}
