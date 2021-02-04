package StringsPrograms.StringBuffersPrograms;

public class Excercises2 {
    public static void main(String[] args) {
        String s1 = new String("Sai Sandeep");
        String s2 = new String("Sai Sandeep");
        String s3 = new String("Krishna");
        System.out.println(s1 == s2);// false
        System.out.println(s1 == s3);// false
        System.out.println(s1 == s1);// true

    }

}
