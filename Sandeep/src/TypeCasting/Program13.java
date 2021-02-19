package TypeCasting;

public class Program13 {
    public static void main(String[] args) {
        System.out.println("-----String.valueOf()------");
        System.out.println("----byte----");
        byte b = 2;
        String s6 = String.valueOf(b);
        System.out.println(b + 100);
        System.out.println(s6 + 100);
        System.out.println("----Integer----");
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100); // 300 because + is binary plus operator  
        System.out.println(s + 100); // 200100 because + is string concatenation operator 
        System.out.println("----Float----");
        float f = 36.54f;
        String s1 = String.valueOf(f);
        System.out.println(f + 100);// here + acts as binay as f is float and s is string
        System.out.println(s1 + 100);// 36.54100 as s1 is string
        System.out.println("---Long----");
        long l = 262651565;
        String s2 = String.valueOf(l);
        System.out.println(l + 100);// here addtin acous as l is long
        System.out.println(s2 + 100);// 262651565100 as s2 is string there contatination accous
        System.out.println("---double----");
        double d = 351.2515;
        String s3 = String.valueOf(d);
        System.out.println(d + 100);
        System.out.println(s3 + 100);
        System.out.println("----Short----");
        short sh = 253;
        String s4 = String.valueOf(sh);
        System.out.println(sh + 100);
        System.out.println(s4 + 100);
        System.out.println("----char----");
        char ch = 'k';
        String s5 = String.valueOf(ch);
        System.out.println(ch + 100);// here car automtically coverts to int so k is 107
        System.out.println(s5 + 100);
    }

}
