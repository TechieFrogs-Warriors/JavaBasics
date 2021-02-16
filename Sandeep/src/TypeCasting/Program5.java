package TypeCasting;

public class Program5 {
    public static void main(String[] args) {
        double d = 90.0;
        // Explicit casting is needed for below conversion
        float f = (float) d;
        // flaot f1=d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        char ch = (char) i;
        System.out.println("double value : " + d);
        System.out.println("float value : " + f);
        System.out.println("long value : " + l);
        System.out.println("int value : " + i);
        System.out.println("short value : " + s);
        System.out.println("byte value : " + b);
        System.out.println("Char value : " + ch);
    }

}
