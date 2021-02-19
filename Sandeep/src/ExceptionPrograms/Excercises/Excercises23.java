package ExceptionPrograms.Excercises;

public class Excercises23 {
    public static void main(String[] args) {
        try {// try block
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
            for (int i = 0; i <= arr.length + 1; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {// ArrayIndexOutOgBondsException
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e) {// parent exception
            System.out.println(e);
        } finally {// finally block
            System.out.println("finally block");
        }

    }

}
