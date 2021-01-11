import java.util.*;

class Area2 {
    int length;
    int breadth;

    Area2(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class Classprogram7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();

        System.out.println("Enter breadth : ");
        int b = sc.nextInt();

        Area2 obj = new Area2(l, b);
        System.out.println("Area of rectangle : " + obj.getArea());

        sc.close();

    }

}
