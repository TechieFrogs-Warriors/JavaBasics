package ExceptionPrograms.Excercises;

public class Excercises18 {
    public static void main(String[] args) {
        int age = 1, a;
        try {
            if (age < 18 || age > 50) {
                throw new IllegalArgumentException("age Should be above 18");
            } else {
                a = age;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
