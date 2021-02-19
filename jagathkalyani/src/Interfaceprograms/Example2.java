

package interface;

public class Example2 {
    public static void main(String[] args) {
        Inf2 obj=new Box();
        obj.method2();
    }
    
}
interface Inf1{
    public void method1();
}
interface Inf2 extends Inf1{
    public void method2();
}
class Box implements Inf2{
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }

}