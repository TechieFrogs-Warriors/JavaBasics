public class Encapsulation_Concept 
{
    public static void main(String args[])
    {
        Encap obj = new Encap();
        //we cannot directly call private member of other class
        // obj.empName;
        obj.setEmpName("Answini");
        obj.setEmpAge(32);
        obj.setEmp(123456);
        obj.setCompany("oracle");
        //obj.setSalary....writing not allowed because no setter is in the code
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Id: " + obj.getEmp());
        System.out.println("Employee Age: " + obj.getEmpAge(5, 10));
        //only reading salary
        System.out.println("Employee Salary: " + obj.getSalary());
        //cant read company name because no getter is in the code
       // System.out.println("Employee Company: " + obj.getCompany());

    }
}
class Encap
{

    //declared data members as private 
    private int empId;
    public String empName;
    protected int empAge;
    private long salary=25000;
    private static String company="wipro";

    //Getter and Setter methods
    public int getEmp()
    {
        return empId;
    }
    //protected access modifier is given and works
    protected String getEmpName()
    {
        return empName;
    }

    int getEmpAge(int a,int b)
    {
        //a=10;b=20;
        empAge=a+b;
        return empAge;
    }

    public void setEmpAge(int newValue)
    {
        empAge = newValue;
    }
    //default access modifier is given and works
    void setEmpName(String newValue)
    {
        empName = newValue;
    }

    public void setEmp(int newValue)
    {
        empId = newValue;
    }
    //only providing access to read my private salaray data..cant modify by others outside
    public long getSalary()
    {
        return salary;
    }
    public void setCompany(String newName)
    {
        company=newName;
    }
    /* int getEmpDetails()
    {
        if(empId)
        {
            return empId;
        }
    } */
    //this.id=10;
}

