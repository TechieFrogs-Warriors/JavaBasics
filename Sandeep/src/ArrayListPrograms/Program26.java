package ArrayListPrograms;

import java.util.*;

class Employee {
    int id;
    String name, Department, Address;
    Double phnno;

    public Employee(int id, String name, String Department, String Address, double phnno) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.Address = Address;
        this.phnno = phnno;
    }
}

public class Program26 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        // creating the employe with the details
        Employee b1 = new Employee(1, "Sai", "Exports", "Hyderabad", 78932145);
        Employee b2 = new Employee(2, "Krishna", "Sales", "Vijaywada", 752314669);
        Employee b3 = new Employee(3, "venkata", "Shipping", "Vizag", 852364128);
        Employee b4 = new Employee(4, "Sandeep", "CRM", "Delhi", 236521478);
        // Adding employee with details to the list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        // Traversing through the list to print the Employee data
        for (Employee b : list) {
            System.out.println(b.id + " " + b.name + " " + b.Department + " " + b.Address + " " + b.phnno);
        }
    }
}
