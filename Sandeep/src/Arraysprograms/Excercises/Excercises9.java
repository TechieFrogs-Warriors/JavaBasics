package Arraysprograms.Excercises;

public class Excercises9 {
    void max(int a[]) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }

        System.out.println("Largest value is : " + max);

    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 6, 9, 1, 11 };
        Excercises9 obj = new Excercises9();
        obj.max(a);

    }

}
