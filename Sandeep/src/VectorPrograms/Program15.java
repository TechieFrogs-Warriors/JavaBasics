package VectorPrograms;

import java.util.*;

public class Program15 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>();

        v1.add("Sai");
        v1.add("Sandeep");
        v1.add("Maddipati");

        Vector<String> v2 = new Vector<>();

        v2.add("Sai");
        v2.add("Sandeep");
        // v2.add("Krishna");
        // v2.add("Maddipati");

        System.out.println("Is vector1 equals vector2 ? " + v1.equals(v2));
    }
}
