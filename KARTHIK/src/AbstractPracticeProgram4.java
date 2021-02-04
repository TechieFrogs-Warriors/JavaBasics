public class AbstractPracticeProgram4 {
    public static void main(String[] args) {
        NonAbstractClass obj=new NonAbstractClass();
        obj.a_method();
    }
    
}
abstract class AbstractClass{
    AbstractClass(){
        System.out.println("This is constructor of abstract class.");
    }
    abstract void a_method();
}
class NonAbstractClass extends AbstractClass{
    NonAbstractClass(){
        System.out.println("This is a normal method of abstract class.");
    }
	public void a_method(){
        System.out.println("This is abstract method.");
	} 
}