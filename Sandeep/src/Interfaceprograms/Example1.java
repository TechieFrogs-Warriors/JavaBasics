package Interfaceprograms;

interface Employee {
    public void details();

    public void department();
}

public class Example1 implements Employee {
    public void details() {
        System.out.println("Employee Details");
    }

    public void department() {
        System.out.println("Employee department");
    }
    public static void main(String[] args) {
        Employee obj=new Example1();
        obj.details();
        obj.department();
    }

}
