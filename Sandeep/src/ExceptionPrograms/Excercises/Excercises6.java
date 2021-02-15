package ExceptionPrograms.Excercises;

public class Excercises6 {
    public static void main(String[] args) {
        try {
            try {
                int a = 60, b = 0, c;
                c = a / b;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            int arr[] = { 1, 2, 3, 4 };
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
