package ExceptionPrograms.Excercises;

public class Excercises21 {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = { 1, 2, 3, 4, 5 };
                System.out.println(arr[7]);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
            int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
            for (int i = 0; i <= arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
