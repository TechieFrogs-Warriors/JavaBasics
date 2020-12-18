public class Bitwiseand {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println("----------Bitwiseand Operator----------");
        System.out.println(a < b && a < c);// false && = false
        System.out.println(a > b && a < c);// true && true =true
        System.out.println(a > b && a > c);// true && false =false
        System.out.println(a < b & a < c);// false & true = false
        System.out.println(a > b & a < c);// true & true =true
        System.out.println(a > b & a > c);// true & false =false

        System.out.println(a < b && a++ < c);// false && true = false
        System.out.println(a);// 10 because second condition is not checked
        System.out.println(a > b && a++ < c);// true && true =true
        System.out.println(a);// 11 because 1st condition is true so it checks the 2nd condition
        System.out.println(a > b && a > c++);// true && false =false
        System.out.println(c);// 21 because 1st condition is true so it checks the 2nd condition
        System.out.println(a < b & a++ < c);// false && true = false
        System.out.println(a);// 12 because second condition is checked
        System.out.println(a > b & a++ < c);// true & true =true
        System.out.println(a);// 13 because 1st condition is true so it checks the 2nd condition
        System.out.println(a > b & a < c++);// true & true =true
        System.out.println(c);// 22 because 1st condition is true so it checks the 2nd condition

    }

}
