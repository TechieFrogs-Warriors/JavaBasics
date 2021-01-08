class Operator1 {
    int i;
    int j;
    String str;

    Operator1() {
        int a = 10;
        System.out.println(" a is : " + a);
    }

    Operator1(int a) {
        this();

        System.out.println("\n \n ## Even or Odd ##");
        i = a;
        if (i % 2 == 0) {
            System.out.println(i + " is a even number");
        } else {
            System.out.println(i + " is a odd number");
        }
    }

    Operator1(int a, int b) {
        this(10, 20, "sai");

        System.out.println("\n \n ## Largest Number ##");
        i = a;
        j = b;
        if (a > b) {
            System.out.println(" a is greater than b");
        } else if (b > a) {
            System.out.println(" b is greater than a");
        } else {
            System.out.println(" a and b are equal ");
        }
    }

    Operator1(int a, int b, String s) {

        this(5);

        System.out.println("\n \n");
        i = a;
        j = b;
        str = s;
        System.out.println(" i is : " + i + "\n j is : " + j + "\n name is : " + s);
    }

}

public class Constructorexampl7 {
    public static void main(String[] args) {

        // Operator1 obj = new Operator1(2, 4, "sai");
        Operator1 obj1 = new Operator1(5, 2);
    }

}
