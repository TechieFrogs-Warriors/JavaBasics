package ExceptionHandling;

public class ClassCastException19 {
    public static void main(String[] args) {
        A a = new B();   
        B b = (B) a;    
        C c = (C) b;    
        System.out.println(c.k);
    }
}
class A{
    int i = 10;
}
 
class B extends A{
    int j = 20;
}
 
class C extends B{
    int k = 30;
}
