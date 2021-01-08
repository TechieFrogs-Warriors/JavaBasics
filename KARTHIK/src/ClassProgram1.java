public class ClassProgram1 {
    public static void main(String[] args) {
        outer1.Nestedclass nested = new outer1.Nestedclass();
        nested.MyMethod();
    }

}
class outer1 {
    static class Nestedclass {
        void MyMethod() {
            System.out.println("Nested Class");
        }
     }
    }