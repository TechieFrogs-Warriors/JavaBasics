package HashSetPrograms;

import java.util.*;

class Employee {
    int id;
    String name, city, department;
    double phnnum;

    public Employee(int id, String name, String city, String department, int phnnum) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.department = department;
        this.phnnum = phnnum;
    }
}

public class UserDefinedObjectProgram {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<Employee>();
        // Creating Books
        Employee b1 = new Employee(1, "Sai", "Vijaywada", "Sales", 823658746);
        Employee b2 = new Employee(2, "Sandeep", "hyderabad", "marketing", 236985214);
        Employee b3 = new Employee(3, "Krishna", "vizag", "IT", 623685471);
        // Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        // Traversing HashSet
        for (Employee b : set) {
            System.out.println(b.id + " " + b.name + " " + b.city + " " + b.department + " " + b.phnnum);
        }
    }
}
