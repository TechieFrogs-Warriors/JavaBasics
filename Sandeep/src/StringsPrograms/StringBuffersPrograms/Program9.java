package StringsPrograms.StringBuffersPrograms;

public class Program9 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Sai venkata krishan sandeep");
        StringBuffer s2 = new StringBuffer("Sai venkata krishan sandeep");
        StringBuffer s3 = new StringBuffer("Sandeep");
        System.out.println(s1.compareTo(s2));// equal i.e 0
        System.out.println(s1.compareTo(s3));// s1 grater i.e -5
        System.out.println(s3.compareTo(s1));// s3 is less so +5
        System.out.println(s1.equals(s3));// false
        System.out.println(s1.equals(s2));// erroe its showing wrong
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);// erreor it showa false
        System.out.println(s1 == s3);// false
        System.out.println(s1 != s3);// true
        System.out.println(s1 != s2);// error its sowing wrong

    }

}
