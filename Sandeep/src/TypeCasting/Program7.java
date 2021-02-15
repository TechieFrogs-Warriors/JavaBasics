package TypeCasting;

public class Program7 {

    public static void main(String[] args) {
        byte b = 30;
        char c = 'k';
        short s = 164;
        int i = 52564;
        float f = 3235.64f;
        double d = 241.3685;

        double result = (f * b) + (i / c) - (d * s);

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }

}
