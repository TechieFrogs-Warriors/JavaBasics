package ExceptionPrograms.Excercises;

public class Excercises14 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            // e.getStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
