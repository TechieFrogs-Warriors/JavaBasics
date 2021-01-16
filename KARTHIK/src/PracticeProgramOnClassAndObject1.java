public class PracticeProgramOnClassAndObject1 {
    public static void main(String[] args) {
        Student obj=new Student();//Normal Variable calling by creating an Object
        obj.rollNumber=2;
        obj.Name="john";
        System.out.println("Roll Number Of The Student: "+obj.rollNumber);
        System.out.println("Name Of The Student: "+obj.Name);
        
    }
}
class Student{
    int rollNumber;
    String Name;
}