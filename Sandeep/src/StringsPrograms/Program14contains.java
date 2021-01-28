package StringsPrograms;

public class Program14contains {
    public static void main(String[] args) {
        String s1 = "Sai Sandeep";
        System.out.println(s1.contains("S"));// true//it cheks wether the gove alphabet is present in ty estring or nor

        System.out.println(s1.contains("a"));// true
        System.out.println(s1.contains("w"));// false

        System.out.println("\n\n content equals method\n");
        System.out.println(s1.contentEquals("Sai Sandeep"));// true it checks the sting is equal or not
        System.out.println((s1.substring(0, 2)).contentEquals("Sai"));// false
        System.out.println(s1.contentEquals("Sai"));// false
    }

}
