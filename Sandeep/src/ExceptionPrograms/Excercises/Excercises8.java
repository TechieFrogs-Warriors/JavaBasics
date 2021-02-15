package ExceptionPrograms.Excercises;

public class Excercises8 {
    void method(int a) {
        System.out.println(a);
    }

    void method(int a, int b) {
        System.out.println((a + b) / 0);
    }

    void method(float a, int b) throws Exception {
        System.out.println((a + b) / 0);
    }

    void method(int a, float b) throws Exception {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Excercises8 obj = new Excercises8();

        try {
            obj.method(20);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            obj.method(22, (int) 30.0);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            obj.method(20, 30);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            obj.method((int) 22.5, 50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
