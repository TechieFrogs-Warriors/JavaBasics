package Interfaceprograms;

public class Example6 {
    
}
interface inf6{
    public void method1();
    public void method2();
}
class inf4 implements inf6{
    public void method1(){
        System.out.println("execute interface1");
    }
    public void method2(){
        System.out.println("execute interface2");
    }
    public static void main(String[] args) {
        inf6 obj=new inf4();
        obj.method1();
    }
}
