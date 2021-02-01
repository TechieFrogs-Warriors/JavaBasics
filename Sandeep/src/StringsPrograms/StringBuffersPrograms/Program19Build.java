package StringsPrograms.StringBuffersPrograms;

public class Program19Build {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Sai venkata krishan sandeep");
        StringBuilder s2 = new StringBuilder("Sai venkata krishan sandeep");
        StringBuilder s3 = new StringBuilder("Sandeep");
        System.out.println(s1.compareTo(s2));// equal i.e 0
        System.out.println(s1.compareTo(s3));// s1 grater i.e -5
        System.out.println(s3.compareTo(s1));// s3 is less so +5
        System.out.println(s1.equals(s3));// false
        System.out.println(s1.equals(s2));// error its showing false expected true
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);// false references
        System.out.println(s1 == s3);// false
        System.out.println(s1 != s3);// true
        System.out.println(s1 != s2);// true

    }

}
