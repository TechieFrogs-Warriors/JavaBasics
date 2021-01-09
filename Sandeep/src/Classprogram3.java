class Triangle {
    int a = 3, b = 4, c = 5;
    double s, area;

    Triangle() {
        s = (a + b + c) / 2.0;
        area = Math.pow((s * (s - a) * (s - b) * (s - c)), .5);
    }

    void display() {
        System.out.println("peramter of a triangle is : " + s);
        System.out.println("Area of a triangle is : " + area);
    }
}

public class Classprogram3 {
    public static void main(String[] args) {

        Triangle obj = new Triangle();
        obj.display();

    }

}
