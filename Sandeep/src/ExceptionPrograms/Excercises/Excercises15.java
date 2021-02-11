package ExceptionPrograms.Excercises;

public class Excercises15 {
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        try {
            for (int i = -1; i <= arr.length; i++) {
                if (i < 0) {
                    throw new NegativeArraySizeException();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
