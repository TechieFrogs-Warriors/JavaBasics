package AssignmentPrograms;

public class Program15 {
    public static void main(String[] args) {
        // intiliximng the values of a b
        int a = 20;
        int b = 30;
        int x = a;// intilly assigning the x b value to x

        // the given equaltion to find x
        x = a + b - x;

        System.out.println("x value when assinging a is :: " + x);

        x = b;// againing x to b
        x = a + b - x;
        System.out.println("X value when assining b is :: " + x);

    }

}
