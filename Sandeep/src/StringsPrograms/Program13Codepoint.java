package StringsPrograms;

public class Program13Codepoint {
    public static void main(String[] args) {
        String s1 = "Sai Sandeep";
        System.out.println(s1.codePointAt(1));// returs unicode at the specified index value a is 97
        System.out.println(s1.codePointBefore(1));// returs unicode before the specified index value S is 83
        System.out.println(s1.codePointCount(1, 8));// returns the nof of unicode points
        String s2 = "Sai 222 Sandeep";
        System.out.println(s2.codePointCount(1, 8));// returns the nof of unicode points

    }

}
