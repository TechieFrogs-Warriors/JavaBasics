package ExceptionPrograms.Excercises;

public class Excercises12 {

    public static void main(String[] args) {
        try {
            Class.forName("Alpha");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());

        }
    }
}
