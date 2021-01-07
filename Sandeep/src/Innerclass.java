class Outer {
    int num;

    // inner class
    class Inner {
        void print() {
            System.out.println("Inner Class");
        }
    }

    // Assecing the inner class from the method
    // void display() {
    // Inner inner = new Inner();
    // inner.print();
    // }
}

public class Innerclass {
    public static void main(String[] args) {

        // Instantiating the outer class
        Outer outer = new Outer();

        // Instantiating the Inner class
        Outer.Inner obj = outer.new Inner();
        obj.print();

        // Accessing the display_Inner() method.
        // outer.display();
    }

}
