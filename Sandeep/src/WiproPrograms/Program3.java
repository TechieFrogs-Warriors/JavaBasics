package WiproPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '!' || s1.charAt(i) == '@' || s1.charAt(i) == '#' || s1.charAt(i) == '$'
                    || s1.charAt(i) == '%' || s1.charAt(i) == '^' || s1.charAt(i) == '*' || s1.charAt(i) == '?') {
                count++;
            }
        }
        System.out.println("numner of spical charcters are  : " + count);

        sc.close();
    }

}
