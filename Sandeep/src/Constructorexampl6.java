
class Operator {
    int i;
    int j;
    String str;

    Operator() {
        int a = 10;
        System.out.println(" a is : " + a);
    }

    Operator(int a) {
        System.out.println("\n \n ## Even or Odd ##");
        i = a;
        if (i % 2 == 0) {
            System.out.println(i + " is a even number");
        } else {
            System.out.println(i + " is a odd number");
        }
    }

    Operator(int a, int b) {
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

    Operator(int a, int b, String s) {
        System.out.println("\n \n");
        i = a;
        j = b;
        str = s;
        System.out.println(" i is : " + i + "\n j is : " + j + "\n name is : " + s);
    }

}

public class Constructorexampl6 {
    public static void main(String[] args) {

        Operator obj = new Operator();
        Operator obj1 = new Operator(8, 2);
        Operator obj2 = new Operator(33);
        Operator obj3 = new Operator(10, 22, "sai");

    }

}
