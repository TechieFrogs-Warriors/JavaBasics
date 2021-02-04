package Arraysprograms;

public class Program15 {
    public static void main(String[] args) {
        int arr[] = { 33, 44, 55, 66, 88, 99 };
        System.out.println("Original array ");
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("Clone array");
        int arr2[] = arr.clone();
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("Are both are equal:");
        System.out.print(arr.equals(arr2));
    }

}
