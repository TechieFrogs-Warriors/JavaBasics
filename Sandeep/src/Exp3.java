
import Interfaceprograms.*;

public class Exp3 implements Excercises3 {
    public void method1() {
        System.out.println("print method1");
    }

    public void method2() {
        System.out.println("print method2");
    }

    public void method3() {
        System.out.println("print method3");
    }

    public static void main(String[] args) {
        Excercises3 obj = new Exp3();
        obj.method1();
        obj.method2();
        obj.method3();

    }

}
