package ExceptionPrograms.Excercises;

public class Excercises2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int a = 10, b = 0, c;
        try {
            c = a / b;
            String s = null;

            System.out.println(arr[2]);

            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(arr[10]);
        }
        int d = b / a;
        System.out.println(d);
        System.out.println(arr[0]);
    }

}
