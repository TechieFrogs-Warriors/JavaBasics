package ExceptionPrograms.Excercises;

public class Excercises25 {
    public static void main(String[] args) {
        try {
            int a = 20, b = 30, c;
            c = a + b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                int a = 50, b = 0, c;
                c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finally in Finally Block");
            }
        }
    }
}
