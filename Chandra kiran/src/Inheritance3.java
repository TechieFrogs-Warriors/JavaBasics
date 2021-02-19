class Member
{
    String Name;
    int Age;
    Long Phonenumber;
    String Address;
    int Salary;
   void printSalary(int Salary)
   {
       System.out.println("Salary "+Salary);
   }

} 
class Employe extends Member
{
    String Specialization;

}
class Manager extends Member
{
    String Department;
}
public class Inheritance3 
{
    public static void main(String[] args) 
    {
        Employe Obj = new Employe();
        Manager Obj1 = new Manager();
        Obj.Name="Ramesh";
        Obj.Age=25;
        Obj.Phonenumber=7844933838l;
        Obj.Address="Hyderabad";
        Obj1.Name="Suresh";
        Obj1.Age=27;
        Obj1.Phonenumber=7899373784l;
        Obj1.Address="Vizag";
        System.out.println("EMPLOYEE");
        System.out.println("Name "+Obj.Name);
        System.out.println("Age " +Obj.Age);
        System.out.println("Phonenumber "+Obj.Phonenumber);
        System.out.println("Address "+Obj.Address);
        Obj.printSalary(50000);
        System.out.println("MANAGER");
        System.out.println("Name "+Obj1.Name);
        System.out.println("Age " +Obj1.Age);
        System.out.println("Phonenumber "+Obj1.Phonenumber);
        System.out.println("Address "+Obj1.Address);
        Obj1.printSalary(60000); 
        

        
    }
    
}
