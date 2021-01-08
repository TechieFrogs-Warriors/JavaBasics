public class Classexample2 {
    public void method(char c, int n) {
        System.out.println("method1 : " + c + "  " + n);
    }

    public void method(int n, char c) {
        System.out.println("method2 : " + n + "  " + c);
    }

    public static void main(String[] args) {
        Classexample2 obj = new Classexample2();
        obj.method('s', 99);
        obj.method(88, 'a');
    }

}
