class outer1 {
    static class Nestedclass {
        void MyMethod() {
            System.out.println("Nested Class");
        }
    }
}

public class Nestedclass {
    public static void main(String[] args) {
        outer1.Nestedclass nested = new outer1.Nestedclass();
        nested.MyMethod();
    }

}
