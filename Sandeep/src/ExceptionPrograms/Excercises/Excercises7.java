package ExceptionPrograms.Excercises;

public class Excercises7 {
    void a() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(arr[3]);
        System.out.println(arr[10]);

    }

    void b() {
        a();
    }

    void c() {
        try {
            b();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {

        Excercises7 obj = new Excercises7();
        obj.c();
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finall Block");
        }
    }

}
