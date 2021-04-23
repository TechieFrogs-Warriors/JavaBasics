
public class EmployeeDetailsPrinting 
{
    public static void main(String[] args) 
    {
        //creating objects for 3 employees using constructor with arguments
        Employee obj1=new Employee("Robert", 1994, 5000,"64C- WallsStreat");
        Employee obj2=new Employee("Sam", 2000,1500 , "68D- WallsStreat");
        Employee obj3=new Employee("John", 1999, 2500,"26B- WallsStreat");
        System.out.println("Name\tYearOfJoining\tSalary\tAddress");
        // printing details of first employee
        System.out.println(obj1.getName()+"\t"+obj1.getYear()+"\t\t"+obj1.getSal()+"\t"+obj1.getAddress());
        // printing details of  second employee   
        System.out.println(obj2.getName()+"\t"+obj2.getYear()+"\t\t"+obj2.getSal()+"\t"+obj2.getAddress());
        // printing details of third employee   
        System.out.println(obj3.getName()+"\t"+obj3.getYear()+"\t\t"+obj3.getSal()+"\t"+obj3.getAddress()); 
  
    }
    
}
class Employee
{
    String name,address;
    int yearOfJoining,salary;
    //constructor with arguments
    Employee(String n,int y,int s,String addr)
    {
        name=n;
        salary=s;
        yearOfJoining=y;
        address=addr;
    }
    //methods
    String getName()
    {
        return name;
    }
    String getAddress()
    {
        return address;
    }
    int getYear()
    {
        return yearOfJoining;
    }
    int getSal()
    {
        return salary;
    }  

} 
