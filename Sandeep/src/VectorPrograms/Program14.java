package VectorPrograms;

import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        Vector<Integer> vecObject = new Vector<Integer>();

        vecObject.add(11);
        vecObject.add(22);
        vecObject.add(33);

        // Get the element in the enumeration this enumiration also used for iteration
        // in the vector
        Enumeration<Integer> enumobject = vecObject.elements();

        System.out.println("Data in enumeration object is: ");
        while (enumobject.hasMoreElements()) {
            System.out.print(enumobject.nextElement() + " ");
        }
    }
}
