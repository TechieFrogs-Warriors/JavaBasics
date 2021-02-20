

public class Inheriasignpgm4 {
    public static void main(String[] args) {
        employee1 obj1=new employee1();
        obj1.name="kalyani";
        obj1.age=34;
        obj1.phonenumber=12345678;
        obj1.address="rajahmundry";
        obj1.salary=25550;
        obj1.specialization="suppoter";
        System.out.println("-----employee details-----");
        System.out.println("name-" +obj1.name + "\n age-" +obj1.age + "\nphonenumber-"+obj1.phonenumber +"\naddress-" +obj1.address +"\nsalary -"+obj1.salary +"\nspecialization-"+obj1.specialization);


        manager1 obj2=new manager1();
        obj2.name="jagath";
        obj2.age=54;
        obj2.phonenumber=555414678;
        obj2.address="chennai";
        obj2.salary=85550;
        obj2.department="HR";
        System.out.println("\n\n\n\n-----manager detais-----");
        System.out.println("name -" +obj2.name + "\nage-" +obj2.age + "\nphonenumber-"+obj2.phonenumber +"\naddress -" +obj2.address +"\nsalary- "+obj2.salary +"\ndepartment-"+obj2.department);

    }
    
}
class member1{
  String  name;
  int  age;
  long phonenumber;
  String address;
  double salary;
  public void printsalary(){
      System.out.println(salary);
  }
}
class employee1 extends member1{
    String specialization;

}
class manager1 extends member1{
    String department;
}
