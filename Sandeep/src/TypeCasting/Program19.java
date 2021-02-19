package TypeCasting;

class A {
    void m1() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    void m2() {
        System.out.println("method in class B");
    }
}
// up casting

public class Program19 {
    public static void main(String[] args) {
        A a = (A) new B();// Upcasting. Here, super class reference o refers to sub class object
        a.m1();
        //a.m2(); // Compile-time error message

    }

}
