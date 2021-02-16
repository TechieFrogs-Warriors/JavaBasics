package TypeCasting;

public class Program15 {
    public static void main(String[] args) {

        String name = "sai sandeep";
        String s1 = String.format("name : %s", name);
        System.out.println(s1);
        String s2 = String.format("value : %f", 32.33434f);
        System.out.println(s2);
        String s3 = String.format("value : %32.12f :", 32.3344f);// returns 12 char fractional part filling with 0
        System.out.println(s3);

        String s4 = String.format("%d", 101); // Integer value
        System.out.println(s4);
        String s5 = String.format("%s", "Amar Singh"); // String value
        System.out.println(s5);
        String s6 = String.format("%f", 101.00); // Float value
        System.out.println(s6);
        String s7 = String.format("%x", 101); // Hexadecimal value
        System.out.println(s7);
        String s8 = String.format("%c", 'c'); // Char value
        System.out.println(s8);
        String s9 = String.format("%d", 101);
        System.out.println(s9);
        String s10 = String.format("|%10d|", 101); // Specifying length of integer
        System.out.println(s10);
        String s11 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        System.out.println(s11);
        String s12 = String.format("|% d|", 101);
        System.out.println(s12);
        String s13 = String.format("|%010d|", 101); // Filling with zeroes
        System.out.println(s13);
        String s14 = String.format("%a", 223.51f);// Returns Hex output of floating point number
        System.out.println(s14);
        String s15 = String.format("%b", 2341);// "true" if non-null, "false" if null
        System.out.println(s15);
        String s16 = String.format("1%e2", 254.3f);// decimal number in scientific notation
        System.out.println(s16);
        String s17 = String.format("2%g2", 223.25f);
        // decimal number, possibly in scientific notation depending on the precision
        // and value.
        System.out.println(s17);

    }

}
