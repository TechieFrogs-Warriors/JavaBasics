public class Methodlocalinnerclass {

    // instance method of the outer class
    void Method() {
        int num = 50;

        // method-local inner class
        class MethodInner {
            void print() {
                System.out.println("Inner class num : " + num);
            }
        }

        // Accessing the inner class
        MethodInner inner = new MethodInner();
        inner.print();
    }

    public static void main(String[] args) {

        // Instantiating the outer class
        Methodlocalinnerclass outer = new Methodlocalinnerclass();
        outer.Method();

    }

}
