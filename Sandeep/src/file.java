class second {
    int a = 10, b = 20, c;

    void add1() {
        c = a + b;
        System.out.println(c);

    }
}

public class file {
    public static void main(String[] args) {
        second obj = new second();
        obj.add1();
    }

}
