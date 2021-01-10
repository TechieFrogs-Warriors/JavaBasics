public class PracticeProgramOnClassAndObject2 {
    public static void main(String[] args) {
        Student1 obj=new Student1();//Normal Variable calling by creating an Object
        System.out.println("Roll Number Of The Student: "+obj.rollNumber);
        System.out.println("Name Of The Student: "+obj.Name);
        System.out.println("Phone Number Of The Student: "+obj.phoneNumber);
        System.out.println("Address Of The Student: "+obj.Address);
        obj.show();
        Student1 obj1=new Student1(5, "85555555555", "john", "********");// Normal Variable calling by creating an Object
        obj1.display();
    }
}
 class Student1{
    int rollNumber;
    String phoneNumber;
    String Name,Address;
    public Student1(){
        rollNumber=2;
        phoneNumber="9844484444l";
        Name="sam";
        Address="*********";
    }
    public  Student1(int rollNumber,String phoneNumber,String Name,String Address){
        System.out.println("Roll Number Of The Student: "+rollNumber);
        System.out.println("Name Of The Student: "+Name);
        System.out.println("Phone Number Of The Student: "+phoneNumber);
        System.out.println("Address Of The Student: "+Address);
       
    }
    void show(){
        System.out.println("****2nd Student Details****");
    }
    void display(){
    }
}