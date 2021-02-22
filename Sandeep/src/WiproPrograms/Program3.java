package WiproPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (!((s1.charAt(i) >= 'a' && s1.charAt(i) <= 'Z') || (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
                    || (s1.charAt(i) >= '0' && s1.charAt(i) <= '9'))) {
                count++;
            }
        }
        System.out.println("numner of spical charcters are  : " + count);

        sc.close();
    }

}
