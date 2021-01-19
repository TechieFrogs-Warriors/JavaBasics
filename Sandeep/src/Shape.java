public class Shape {
    protected Shape() {
        System.out.println("Shape const");
    }

    private void display() {
        System.out.println("Disply");
    }

    void print() {
        System.out.println("print ");
    }
}

class RectangleA extends Shape {
    public void area() {
        System.out.println("Area");
    }

    public static void main(String[] args) {
        RectangleA obj = new RectangleA();
        // obj.display();
        obj.area();
        obj.print();
    }
}
