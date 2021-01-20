public class Example {
    public static void main(String[] args) {
        second obj = new second();
        obj.add1();
        int a = 50;
        int b = 60;
        int c = 10;
        if (a > b) {
            if (a > c) {
                System.out.println("a is greater than b,c");

            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("b is greater than a,c");
            }
        } else if (c > a) {
            if (c > b) {
                System.out.println("c is graeter than a,b");

            }

        }

    }
}
