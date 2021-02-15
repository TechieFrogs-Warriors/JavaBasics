package ExceptionPrograms;

public class Program4 {
    public static void main(String[] args) {

        int a = 10, b = 0;
        // try block
        try {
            int c = a / b;
        }
        // catch block
        catch (Exception e) {
            System.out.println(e);
        }
        // finally block
        finally {
            System.out.println(" finally block");
        }
        System.out.println("code");
        try {
            int arr[] = { 1 };
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

}
