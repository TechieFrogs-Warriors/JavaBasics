class Triangle1 {
    int a, b, c;
    double s, area;

    Triangle1(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        s = (a + b + c) / 2.0;
        area = Math.pow((s * (s - a) * (s - b) * (s - c)), .5);
    }

    void display() {
        System.out.println("peramter of a triangle is : " + s);
        System.out.println("Area of a triangle is : " + area);
    }
}

public class Classprogram4 {
    public static void main(String[] args) {

        Triangle1 obj = new Triangle1(3, 4, 5);
        obj.display();

        System.out.println("\n");

        Triangle1 obj1 = new Triangle1(6, 3, 7);
        obj1.display();

    }

}
