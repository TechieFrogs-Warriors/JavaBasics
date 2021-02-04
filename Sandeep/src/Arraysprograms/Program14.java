package Arraysprograms;

public class Program14 {
    public static void main(String[] args) {
        char arr1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

        char arr2[] = new char[10];

        System.arraycopy(arr1, 2, arr2, 1, 6);

        System.out.println(arr2);
    }

}
