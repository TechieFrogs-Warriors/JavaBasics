public class Classexample1 {
    void printn(int a) {
        System.out.println(a);
    }

    void printn(float a) {
        System.out.println(a);
    }

    void printn(double a) {
        System.out.println(a);
    }

    void printn(String a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Classexample1 obj = new Classexample1();
        obj.printn(6);
        obj.printn(45.32);
        obj.printn(225.22558896);
        obj.printn("sai");

    }

}
