package StringsPrograms;

public class Program1 {
    public static void main(String[] args) {
        String s1 = "Sandeep";
        String s2 = new String("Sandeep");
        String s3 = "";
        String s4 = " sai Sandeep ";
        System.out.println(s1 + s2);
        System.out.println(s1 + (String.join(" ", " is", "a", "student")));
        System.out.println(s1.isEmpty());// false
        System.out.println(s3.isEmpty());// true

        System.out.println(s1.isBlank());// false
        System.out.println(s3.isBlank());// true

        System.out.println(s1.formatted());

        System.out.println(s1.indent(2));// it creates a spacses befor the string
        System.out.println(s1.intern());// it creates a line gap befor this statement executes

        System.out.println(s1.repeat(2));// it repeats the string

        System.out.println(s4.strip());// it removes the spaces before and after the string

        System.out.println(s4.stripIndent());// it removes the spaces before and after the string

        // System.out.println(s2.valueOf(s2));
        System.out.println(s1.subSequence(1, 3));// it gives the substring value

    }

}
