package ExceptionPrograms;

public class Program1 {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
            // System.out.println(a);
        }
        // System.out.println(a);

        // S=Null pointer Exception
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e);
        }

        // Number format Exception
        try {
            String str = "abc";
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
