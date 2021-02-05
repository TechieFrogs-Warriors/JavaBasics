package Arraysprograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        String stringarr[] = { "a", "b", "c", "d", "e", "f" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringarr));
        System.out.println(arrayList);
        // ArrayUtils.reverse(arrayList);
    }

}
