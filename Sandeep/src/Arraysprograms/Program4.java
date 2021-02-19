package Arraysprograms;

public class Program4 {

    int add(int a[]) {
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
        System.out.println("smallest value is : "+min);
        System.out.println("Largest value is : "+max);
        return min + max;

    }

    public static void main(String[] args) {
        int a[] = { 22, 33, 66, 55, 11 };
        Program4 obj = new Program4();
        System.out.println("Addition of small and large value is : "+obj.add(a));

    }

}
