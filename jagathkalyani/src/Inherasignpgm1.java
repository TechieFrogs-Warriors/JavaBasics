public class Inherasignpgm1 {
    public static void main(String[] args) {
        parent obj1=new parent();
        obj1.method1();
        child obj2=new child();
        obj2.method2();
        obj2.method1();
    }
    
}
class parent{
    public void method1(){
        System.out.println("this is parent class");
    }
}
class child extends parent{
    public void method2() {
        System.out.println("this is child class");
        
    }
}