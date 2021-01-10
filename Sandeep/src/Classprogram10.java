class Employee {
    String name, address;
    int year;
    double salary;

    Employee(String n, int y, double sal, String add) {
        name = n;
        year = y;
        salary = sal;
        address = add;
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    double getSalary() {
        return salary;
    }

    String getAddress() {
        return address;
    }
}

public class Classprogram10 {
    public static void main(String[] args) {
        Employee obj = new Employee("Robert", 1994, 500000, "64C- WallsStreet");
        Employee obj1 = new Employee("Sam", 2000, 740000, "68d- WallsStreet");
        Employee obj2 = new Employee("John", 1999, 600000, "26B- WallsStreet");

        System.out.println("Name\tYear of joining\t\tSalary\t\tAddress");
        System.out.println(obj.getName() + "\t\t" + obj.getYear() + "\t\t" + obj.getSalary() + "\t" + obj.getAddress());
        System.out.println(
                obj1.getName() + "\t\t" + obj1.getYear() + "\t\t" + obj1.getSalary() + "\t" + obj1.getAddress());
        System.out.println(
                obj2.getName() + "\t\t" + obj2.getYear() + "\t\t" + obj2.getSalary() + "\t" + obj2.getAddress());

    }

}
