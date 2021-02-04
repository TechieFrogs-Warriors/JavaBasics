package Arraysprograms;

import java.util.Arrays;

public class Program8 {
    public static void main(String[] args) {
        String stringarr[] = { "a", "b", "c", "d", "e", "f" };
        boolean a = Arrays.asList(stringarr).contains("c");
        System.out.println(a);

        boolean b = Arrays.asList(stringarr).contains("k");
        System.out.println(b);
    }

}
