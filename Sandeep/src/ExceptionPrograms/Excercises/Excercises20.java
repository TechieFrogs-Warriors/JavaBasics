package ExceptionPrograms.Excercises;

import java.util.*;

public class Excercises20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number : ");

        try {
            String ip = sc.next();
            int num = Integer.parseInt(ip);
            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("odd Number");
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
