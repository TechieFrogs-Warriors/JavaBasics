public class InheritanceAssignmentProgram3 {
    public static void main(String[] args) {
        Employee1 obj=new Employee1();
        obj.Name="karthik";
        obj.Age=22;
        obj.PhoneNumber=8919015201l;
        obj.Address="West Godavari";
        obj.Salary=50000l;
        obj.specilization="Quality Assurence";
        obj.display();
        obj.PrintSalary();
        Manager obj1=new Manager();
        obj1.Name="raj";
        obj1.Age=27;
        obj1.PhoneNumber=7993411419l;
        obj1.Address="Hyderabad";
        obj1.Salary=100000l;
        obj1.Department="Coding";
        obj1.display();
        obj1.PrintSalary();  
    }  
}
class Member{
    String Name;
    int Age;
    long PhoneNumber;
    String Address;
    long Salary;
    public void PrintSalary(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Phone Number: "+PhoneNumber);
        System.out.println("Address: "+Address);
        System.out.println("Salary: "+Salary);
    }
}
class Employee1 extends Member{
    String specilization;
    void display(){
        System.out.println("*** Employee Details ***");
        System.out.println("specilization: "+specilization);
    }
}
class Manager extends Member{
    String Department;
    void display(){
        System.out.println("*** Manager Details ***");
        System.out.println("Department: "+Department);
    }

}

