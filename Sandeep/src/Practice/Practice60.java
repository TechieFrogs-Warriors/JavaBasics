package Practice;

import java.util.*;

public class Practice60 {
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
        // return c;
    }

    public static void main(String[] args) {

        Practice60 obj = new Practice60();
        obj.add();
    }

}
