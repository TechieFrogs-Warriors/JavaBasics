package ExceptionPrograms.Excercises;

public class Excercises13 {
    public static void main(String[] args) {
        int a = 50, b = 0, c = 1;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
            // e.printStackTrace();
        }
        System.out.println(c);
    }

}
