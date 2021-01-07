
abstract class Anonymousinnerclass {
    abstract void MyMethod();

}

class Outerclass {
    public static void main(String[] args) {

        Anonymousinnerclass inner = new Anonymousinnerclass() {
            void MyMethod() {
                System.out.println("Anonymous Inner Class");
            }
        };
        inner.MyMethod();

    }
}