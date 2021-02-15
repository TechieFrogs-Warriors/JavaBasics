package ExceptionPrograms.Excercises;

public class Excercises24 {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int a = 50, b = 0;
                    int c = a / b;
                    System.out.println(c);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("inner most finally");
                }
                int arr[] = { 1, 2, 3, 4, 5 };
                System.out.println(arr[7]);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("inner finally");
            }
            int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
            for (int i = 0; i <= arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            System.out.println("Outer finally");
        }
    }

}
