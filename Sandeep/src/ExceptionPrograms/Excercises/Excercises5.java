package ExceptionPrograms.Excercises;

public class Excercises5 {
    public static void main(String[] args) {
        int a = 50, b = 0;
        try {
            int c = a / b;
            System.out.println(c);
            throw new Exception("Exception");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

}
