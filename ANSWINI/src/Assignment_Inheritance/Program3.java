package Assignment_Inheritance;

public class Program3 
{
    public static void main(String[] args) 
    {
        //employee(child) inherits all from member(parent) class
        Employee emp=new Employee();
        System.out.println(emp.name="Answini");
        System.out.println(emp.age=30);
        System.out.println(emp.ph_No=12345789);
        System.out.println(emp.address="vijayawada");
        System.out.println(emp.salary=25000);
        emp.specialization="java";
        emp.printSalary();
        //manager(child) inherits all from member(parent) class
        Manager man=new Manager();
        System.out.println(man.name="Achyuth");
        System.out.println(man.age=6);
        System.out.println(man.ph_No=10187945);
        System.out.println(man.address="Nuzvid");
        System.out.println(man.salary=45000);
        man.department="designing";
        man.printSalary();
    }
    
}
class Member
{
    String name;
    int age;
    int ph_No;
    int salary;
    String address;
    void printSalary()
    {
        System.out.println("salary is: "+salary);
    }
}
class Employee extends Member
{
    String specialization;

}
class Manager extends Member
{
    String department;
}
