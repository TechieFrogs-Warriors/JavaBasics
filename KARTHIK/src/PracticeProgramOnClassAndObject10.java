public class PracticeProgramOnClassAndObject10 {
    public static void main(String[] args) {
        Employee obj1=new Employee("Robert",1994,"64C- WallsStreat");
        Employee obj2=new Employee("Sam",2000,"68D- WallsStreat");
        Employee obj3=new Employee("john",1999,"26B- WallsStreat");
        System.out.println("NAME\t\tYEAR OF JOINING\t\tADDRESS");
        System.out.println(obj1.Name()+"\t\t"+obj1.Year()+"\t\t"+obj1.Address());
        System.out.println(obj2.Name()+"\t\t"+obj2.Year()+"\t\t"+obj2.Address());
        System.out.println(obj3.Name()+"\t\t"+obj3.Year()+"\t\t"+obj3.Address());
    }
    
}
class Employee{
    String Name,Address;
    int Year;
    Employee(String n,int y,String a){
        Name=n;
        Year=y;
        Address=a;
    }
    public String Name(){
        return Name;    
    }
    public int Year(){
        return Year;
    }
    public String Address(){
        return Address;
    }
} 