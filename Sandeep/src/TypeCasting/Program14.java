package TypeCasting;

public class Program14 {
    public static void main(String[] args) {
        System.out.println("-----.toString()------");
        System.out.println("Converting integer to string");
        int i = 200;
        String s = Integer.toString(i);
        System.out.println(i + 100);
        System.out.println(s + 100);
        System.out.println("Converting byte to string");
        byte b = 2;
        String s1 = Byte.toString(b);
        System.out.println(b + 100);
        System.out.println(s1 + 100);
        System.out.println("Converting float to string");
        float f = 25.23f;
        String s2 = Float.toString(f);
        System.out.println(f + 100);
        System.out.println(s2 + 100);
        System.out.println("Converting short to string");
        short sh = 265;
        String s3 = Short.toString(sh);
        System.out.println(sh + 100);
        System.out.println(s3 + 100);
        System.out.println("Converting double to string");
        double d = 5156.651651d;
        String s4 = Double.toHexString(d);
        System.out.println(d + 100);
        System.out.println(s4 + 100);
        System.out.println("Converting long to string");
        long l = 1651616115;
        String s5 = Long.toString(l);
        System.out.println(l + 100);
        System.out.println(s5 + 100);
        System.out.println("Converting char to string");
        char ch = 'm';
        String s6 = Character.toString(ch);
        System.out.println(ch + 100);
        System.out.println(s6 + 100);

    }

}
