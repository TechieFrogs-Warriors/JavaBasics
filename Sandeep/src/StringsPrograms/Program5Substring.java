package StringsPrograms;

public class Program5Substring {
    public static void main(String[] args) {
        String s1 = "Sai Venkata Krihna Sandeep";
        System.out.println(s1);
        System.out.println(s1.substring(0, 3));// sai
        System.out.println(s1.substring(4, 10));// Venkata
        System.out.println(s1.substring(12, 18));// Krishna
        System.out.println(s1.substring(19, 26));// sandeep
        System.out.println(s1.substring(12));// Krishna sandeep
        System.out.println(s1.subSequence(4, 10));// venkata
    }

}
