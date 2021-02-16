package TypeCasting;
//type promation in classes using methods

public class Program9 {
    void sum(int x, long y) {
        System.out.println(x + y);
    }

    void sum(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void main(String[] args) {
        Program9 obj = new Program9();
        obj.sum(50, 20, 55);
        obj.sum(20, 3);
    }

}
