import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("------------- validation for Int -----------");

        String s = "Hello World! 3 + 3.0 = 6 true 5";

        Scanner obj1 = new Scanner(s);

        while (obj1.hasNext()) {

            if (obj1.hasNextInt()) {
                System.out.println("Found :" + obj1.nextInt());
            }
            System.out.println("Not Found :" + obj1.next());
        }

        obj1.close();
    }

}
