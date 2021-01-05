import java.util.Scanner;

class Variables1{
    Scanner scan=new Scanner(System.in);
    int RollNumber=scan.nextInt();
    String Name=scan.next();
    float Marks=scan.nextFloat();
}
class Variables2{
    Scanner scan=new Scanner(System.in);
    long PhoneNumber=scan.nextLong();   
}
public class ProgramOnClass2 {
    public static void main(String[] args) {
        System.out.println("Enter Values");
        Variables1 V1Obj=new Variables1();
        Variables2 V2Obj=new Variables2();
        System.out.println("*****output****");
        if(V1Obj.Marks>=80){
            System.out.println("Student Name: "+V1Obj.Name);
            System.out.println("Student RollNumber: "+V1Obj.RollNumber);
            System.out.println("Student Marks: "+V1Obj.Marks);
            System.out.println("Student PhoneNumber: "+V2Obj.PhoneNumber);
            System.out.println("Status: "+"Qualified");
        }
        else 
        System.out.println("*****Not Qualified*****");
    }
    
}
