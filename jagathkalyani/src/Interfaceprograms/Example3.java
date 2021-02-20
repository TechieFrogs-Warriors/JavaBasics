package Interfaceprograms;

public class Example3 {
    public static void main(String[] args) {
        car1 obj=new vehicle();
        obj.method2();
    }
    
}interface car1 extends car2{
    public void method1();
}
interface car2 {
    public void method2();
}
class vehicle implements car1{
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }

}
