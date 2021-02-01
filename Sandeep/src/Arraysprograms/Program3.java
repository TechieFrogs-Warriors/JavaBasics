package Arraysprograms;

public class Program3 {
    void max(int a[]) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Smallets value is : " + min);
        System.out.println("Largest value is : " + max);

    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 9, 1, 11 };
        Program3 obj = new Program3();
        obj.max(a);
        System.out.println("\n\n");
        obj.max(new int[] { 100, 200, 550, 22222, 005500 });

    }

}
