package TypeCasting;

public class Program10 {
    void sum(int x, long y) {
        System.out.println("yahoo");
    }

    void sum(long x, int y) {
        System.out.println("lalala");
    }

    public static void main(String[] args) {
        Program10 obj = new Program10();
        // obj.sum(10, 10);
    }

}
