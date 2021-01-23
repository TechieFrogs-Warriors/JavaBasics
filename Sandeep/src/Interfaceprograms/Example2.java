package Interfaceprograms;

interface StdDetails {
    public void details();
}

interface StdDepartment extends StdDetails {
    public void department();
}

public class Example2 implements StdDepartment {
    public void details() {
        System.out.println("Student details");
    }

    public void department() {
        System.out.println("Student department");
    }

    public static void main(String[] args) {
        StdDepartment obj = new Example2();
        obj.details();
        obj.department();
    }

}
