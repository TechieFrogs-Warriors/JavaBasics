public class Bitwiseor {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);// true || = true
        System.out.println(a > b || a > c);// true || = true
        System.out.println(a < b || a < c);// false || true = true
        System.out.println(a < b || a > c);// false || false = false

        System.out.println(a > b | a < c);// true | true = true
        System.out.println(a > b | a > c);// true | false = true
        System.out.println(a < b | a < c);// false | true = true
        System.out.println(a < b | a > c);// false | false = false

        System.out.println(a > b || a++ < c);// true || = true
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a > b || a++ > c);// true || = true
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a < b || a++ < c);// false || true = true
        System.out.println(a);// 11 As 1st condition is false so second condition is checked
        System.out.println(a < b || a > c++);// false || false = false
        System.out.println(c);// 21 As 1st condition is false so second condition is checked

        int x = 30;
        int y = 20;
        int z = 50;
        System.out.println(x > y | x++ < z);// true | true = true
        System.out.println(x);// 31 because second condition is checked
        System.out.println(x > y | x++ > z);// true | false = true
        System.out.println(x);// 32 because second condition is checked
        System.out.println(x < y | x < z++);// false | true = true
        System.out.println(z);// 51 because second condition is checked
        System.out.println(x < y | x > z++);// false | false = false
        System.out.println(z);// 52 because second condition is checked

    }

}
