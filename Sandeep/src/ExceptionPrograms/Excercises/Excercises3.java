package ExceptionPrograms.Excercises;

import java.util.*;

public class Excercises3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number --");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            throw new ArithmeticException("Valid");
        } else {
            throw new ArithmeticException("odd");
            // System.out.println("odd");
        }
    }

}
