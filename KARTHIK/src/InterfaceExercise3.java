import InterfaceExcercisePrograms.*;
public class InterfaceExercise3 implements InterfaceExerciseProgram3 {
    public static void main(String[] args) {
        InterfaceExercise3 obj=new InterfaceExercise3();
        obj.Method1();
        obj.Method2();
        obj.Method3(); 
    }
    public void Method1(){
        System.out.println("Method1");
    }

    public void Method2() {
        System.out.println("Method2");
    }

    public void Method3() {
        System.out.println("Method3");
    }
    
}
