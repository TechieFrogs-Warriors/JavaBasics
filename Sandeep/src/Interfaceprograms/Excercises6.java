package Interfaceprograms;

interface X {
    void x1();

    void x2();
}

interface Y {
    void y1();

    void y2();
}

interface Z {
    void z1();

    void z2();
}

interface V extends X, Y, Z {
    void v1();

    void v2();
}

public class Excercises6 implements V {
    public void x1() {
        System.out.println("x1");
    }

    public void x2() {
        System.out.println("x2");
    }

    public void y1() {
        System.out.println("y1");
    }

    public void y2() {
        System.out.println("y2");
    }

    public void z1() {
        System.out.println("z1");
    }

    public void z2() {
        System.out.println("z2");
    }

    public void v1() {
        System.out.println("v1");
    }

    public void v2() {
        System.out.println("v2");
    }

    public static void main(String[] args) {
        V obj = new Excercises6();
        obj.x1();
        obj.x2();
        obj.y1();
        obj.y2();
        obj.z1();
        obj.z2();
        obj.v1();
        obj.v2();
    }

}
