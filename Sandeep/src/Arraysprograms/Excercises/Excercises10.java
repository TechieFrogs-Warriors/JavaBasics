package Arraysprograms.Excercises;

public class Excercises10 {
    void min(int a[]) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }

        System.out.println("Largest value is : " + min);

    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 9, 1, 11, 0 };
        Excercises10 obj = new Excercises10();
        obj.min(a);
    }

}
