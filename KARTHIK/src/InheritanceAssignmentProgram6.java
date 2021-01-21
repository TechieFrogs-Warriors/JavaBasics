public class InheritanceAssignmentProgram6 {
    public static void main(String[] args) {
        Square4 obj=new Square4();
        obj.Print1();
        obj.Print2();
        obj.Print3();

    }
    
}
class Shape{
    void Print1(){
        System.out.println("This is shape.");
    }
}
class Rectangle5 extends Shape{
    void Print2(){
        System.out.println("This is rectangle shape.");
    }

}
class Square4 extends Rectangle5{
    void Print3(){
        System.out.println("Square is a rectangle.");
    }

}
class Circle2 extends Shape{
    void Print4(){
        System.out.println("This is circle shape.");
    }

}