package TypeCasting;

interface Printable {

}

class A1 implements Printable {
    public void a() {
        System.out.println("Class A method");
    }
}

class B1 implements Printable {
    public void b() {
        System.out.println("class B method");
    }
}

class C {
    void display(Printable p) {
        if (p instanceof A1) {
            A1 a = (A1) p;// Down casting
            a.a();
        }
        if (p instanceof B1) {
            B1 b = (B1) p;
            b.b();
        }
    }
}

public class Program26 {
    public static void main(String[] args) {
        Printable p = new B1();
        C c = new C();
        c.display(p);
    }

}
