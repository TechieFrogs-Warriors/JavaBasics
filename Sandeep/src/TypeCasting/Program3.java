package TypeCasting;

public class Program3 {
    public static void main(String[] args) {
        byte b = 20;
        int i = b;
        double d = i;// here automaticllay converts to int
        char c = 'b';// mis match convesrtion
        float f = c;
        double s = f;
        long l = i;

        System.out.println("Int : " + i);
        System.out.println("Double : " + d);
        System.out.println("float : " + f);
        System.out.println("Double s : " + s);
        System.out.println("Long : " + l);
    }
}
