import java.util.*;

public class Hasnext {
    public static void main(String[] args) {
        String ch = "sandeep sai 13 + 13 = 26.0 true  10 + 11 = 20 false 99999999999 22.52  ";

        System.out.println(ch);
        Scanner obj = new Scanner(System.in);
        System.out.println("------------- validation for short-----------");
        while (obj.hasNext()) {
            if (obj.hasNextShort()) {
                System.out.println("Found: " + obj.nextShort());
            }
            System.out.println("Not Found: " + obj.next());

        }

        obj.close();

    }
}
