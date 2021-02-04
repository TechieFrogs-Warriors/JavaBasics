package Arraysprograms;

import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array : ");
        int k = sc.nextInt();

        int n[] = new int[k];
        System.out.println("Enter elements : ");
        for (int i = 0; i < k; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println("Elements are --");
        for (int i : n) {
            System.out.println(n[i]);
        }
        sc.close();

    }

}
