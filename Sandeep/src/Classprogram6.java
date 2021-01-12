import java.util.*;

class Area1 {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;

    }

    void getArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle of length :" + length + " breadth : " + breadth + " is : " + area);
    }

}

public class Classprogram6 {
    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length : ");
        l = sc.nextInt();

        System.out.println("enter the breadth : ");
        b = sc.nextInt();

        Area1 obj = new Area1();
        obj.setDim(l, b);
        obj.getArea();

        sc.close();
    }

}
