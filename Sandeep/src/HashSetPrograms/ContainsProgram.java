package HashSetPrograms;

import java.util.*;

public class ContainsProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Sai");
        h.add("venkata");
        h.add("Krishna");

        boolean flag = h.contains("sandeep");
        if (flag) {
            System.out.println("element exist");
        } else {
            System.out.println("element does not exist");
        }
    }
}
