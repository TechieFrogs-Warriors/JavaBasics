import java.util.*;

class Average {
    int a, b, c;

    void average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();

        System.out.println("Enter b : ");
        b = sc.nextInt();

        System.out.println("Enter c : ");
        c = sc.nextInt();

        float average = (a + b + c) / 3;

        System.out.println("Average of 3 numbers is : " + average);

        sc.close();
    }
}

public class Classprogram8 {
    public static void main(String[] args) {

        Average obj = new Average();
        obj.average();
    }

}
