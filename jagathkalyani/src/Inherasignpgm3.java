public class Inherasignpgm3 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.name="jagath";
        obj.age=20;
        obj.phonenumber= 801955545;
        obj.address="rajahmundry";
        obj.salary=30000;
        obj.specialization="supoter";
        System.out.println("name : " + obj.name + "\nage : " + obj.age + "\nphonenumber : " +  obj.phonenumber + "\nspecialization : " +  obj.specialization + "\nsalary : " + obj.salary + "\naddress : " +obj.address);
        Manager obj1=new Manager();
        obj1.name="kalyani";
        obj1.age=30;
        obj1.phonenumber= 758964254;
        obj1.address="Hyderabad";
        obj1.salary=80000;
        obj1.department="HR";
        System.out.println("\n\n\nname : " + obj1.name + "\nage : " + obj1.age + "\nphonenumber : " +  obj1.phonenumber + "\ndepartment : " +  obj1.department + "\nsalary : " + obj1.salary +"\naddress : " +obj1.address);
      
    }
    
}
class Member{
    String name;
    int age;
    double phonenumber;
    String address;
    double salary;
    public void printsalary(){
        System.out.println(salary);
    }
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}