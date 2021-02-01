package StringsPrograms;

public class Excercises7 {
    public static void main(String[] args) {
        String s1 = new String("Sai Sandeep");
        String s2 = new String("Sai Sandeep");
        String s3 = new String("Sai");
        System.out.println(s1 == s2);// false
        System.out.println(s1 == s3);// false
        System.out.println(s1 == s1);// true
    }

}
