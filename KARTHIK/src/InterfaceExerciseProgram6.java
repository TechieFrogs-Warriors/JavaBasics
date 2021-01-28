public class InterfaceExerciseProgram6 implements D {
    public static void main(String[] args) {
        D obj = new InterfaceExerciseProgram6();
        obj.a1();
        obj.a2();
        obj.b1();
        obj.b2();
        obj.c1();
        obj.c2();
        obj.d1();
        obj.d2();

    }
    public void a1() {
        System.out.println("a1=1");
    }

    public void a2() {
        System.out.println("a2=2");
    }

    public void b1() {
        System.out.println("b1=3");
    }

    public void b2() {
        System.out.println("b2=4");
    }

    public void c1() {
        System.out.println("c1=5");
    }

    public void c2() {
        System.out.println("c2=6");
    }

    public void d1() {
        System.out.println("d1=7");
    }

    public void d2() {
        System.out.println("d2=8");
    }

    
}
interface A_1 {
    void a1();
    void a2();
}

interface B_1 {
    void b1();
    void b2();
}

interface C {
    void c1();
    void c2();
}

interface D extends A_1, B_1, C {
    void d1();
    void d2();
}