package StringsPrograms;

public class Program8 {
    public static void main(String[] args) {
        String s1 = "Sandeep";
        System.out.println(s1.startsWith("Sa"));// true
        System.out.println(s1.endsWith("ep"));// true

        String s2 = "Sai Sandeep";
        String s3 = "Krishna";
        System.out.println(s2.startsWith("Sa"));// true
        System.out.println(s2.endsWith(s2.substring(0, 3) + "ai"));// false
        System.out.println((s2 + s3).endsWith("na"));// true

    }

}
