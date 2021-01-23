public class AbstractPracticeProgram1 {
    public static void main(String[] args) {
        Child3 obj1=new Child3();
        obj1.message();
        Child4 obj2=new Child4();
        obj2.message();
    }
    
}
abstract class Parent4{
    abstract void message();
}
class Child3 extends Parent4{
    public void message() {
       System.out.println("This Is First Subclass"); 
    }    
}
class Child4 extends Parent4{
    public void message(){
        System.out.println("This Is Second Subclass");
    }
}