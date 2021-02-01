public class MEthexp extends Sub {
    public MEthexp() {

        this(2);
        System.out.println("No argument constructor");
    }

    public MEthexp(int u) {
        this(10, 20);
        System.out.println("Paramtrized constructor" + u);

    }

    public MEthexp(int g, int h) {
        System.out.println("Parmatrised " + g + h);
    }

    void methodOne(int i, String str) {

        System.out.println("MEthondOne" + i + str);

    }

    void methodOne(String str, int i) {
        System.out.println("MEthondOne" + str + i);
    }

    void methodTwo() {
        int j = 40;
        int k = 60;
        System.out.println("methodTwo " + j + k);
    }

    void methodTwo(int a, int b) {
        System.out.println("methodTwo With Perameters");
    }

    int methodThree(int x, int y) {
        int d = x + y;

        return d;
    }

    static void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        MEthexp obj = new MEthexp();
        obj.methodOne(40, "Sandeep");
        obj.methodOne(30, "krygc");
        obj.methodOne("str", 00);
        obj.methodTwo();
        System.out.println(obj.methodThree(40, 50));
        MEthexp.display();
        // obj.MEthexp(20);

        // MEthexp obj1 = new MEthexp(100);
    }

}

class Sub {
    public Sub() {
        System.out.println("Sub");
    }

    void methodOne(int i, String str) {
        System.out.println("MEthondOne" + i + str);
    }
}
