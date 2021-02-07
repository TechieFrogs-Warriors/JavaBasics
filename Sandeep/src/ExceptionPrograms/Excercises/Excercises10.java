package ExceptionPrograms.Excercises;

public class Excercises10 {
    public static void main(String[] args) {
        int x = 10, y = 2, z;

        try {
            z = x / y;
            System.out.println(z);
            int a = 20, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
