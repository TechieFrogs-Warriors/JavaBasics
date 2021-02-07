package ExceptionPrograms;

public class Program2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        // int c = 50 / 0;
        int d = 60;
        int arr[] = { 1, 2, 3, 4 };

        System.out.println(a);

        System.out.println(b);

        try {
            int c = 50 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(d);

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(arr[3]);

    }

}
