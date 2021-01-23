package Inhertanceprograms;

class Member {
    String name;
    int age;
    long phonenumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Inhertanceprogram3 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.name = "sai";
        obj.age = 26;
        obj.phonenumber = 789342111;
        obj.address = "hyderabad";
        obj.salary = 25220;
        obj.specialization = "team lead";
        System.out.println(
                "name : " + obj.name + "\nage : " + obj.age + "\nPhonenumber : " + obj.phonenumber + "\naddress : "
                        + obj.address + "\nsalary : " + obj.salary + "\nspecialization : " + obj.specialization);

        Manager obj1 = new Manager();
        obj1.name = "sandeep";
        obj1.age = 30;
        obj1.phonenumber = 351835252;
        obj1.address = "hyderabad";
        obj1.salary = 35002;
        obj1.department = "HR";
        System.out.println("\n\nname : " + obj1.name + "\nage : " + obj1.age + "\nPhonenumber : " + obj1.phonenumber
                + "\naddress : " + obj1.address + "\nsalary : " + obj1.salary + "\ndepartment : " + obj1.department);

    }

}
