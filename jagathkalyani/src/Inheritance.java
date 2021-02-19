import org.graalvm.compiler.virtual.phases.ea.PartialEscapeBlockState.Final;

public class Inheritance {
    public static void main(String[] args) {
        C obj = new C();
       
        obj.displayA();
        obj.displayB();
        obj.displayC();
        //Doctor objDoctor= new Doctor();
        //Engineer objEngineer =new Engineer();
        //objDoctor.Work();
        //objEngineer.eat();
        //System.out.println("human can eat");
        //System.out.println("human can work");
       
    }

    
}
class A{
    public void  displayA(){
        System.out.println("display A");

    }

}
class B extends A{
    public void displayB(){
        System.out.println("display B");
    }
}
class C extends B{
    public void displayC(){
        System.out.println("display C");
    }
}

