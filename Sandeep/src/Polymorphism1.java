class ABCA {
    int i = 20, j = 30;
    String name = "sai";

    public ABC() {
        System.out.println("Empty constructor");
    }

    public ABC(int i) {
        System.out.println(i);
    }

    public ABC(int i, String name) {
        System.out.println(i + name);
    }

    public ABC(String name, int i) {
        System.out.println(name + i);
    }

    void Display() {
        System.out.println("empty display method ABC class");
    }

    void Display(int i) {
        System.out.println("Display i : " + i);
    }

    void Display(int i, String name) {
        System.out.println("Display i and name : " + i + name);
    }

    void display(String name, int i) {
        System.out.println("Display name and i : " + name + i);
    }
}

public class Polymorphism1 extends ABC {
    int x = 50, z = 60;
    String str = "sai";

    public Polymorphism1() {
        System.out.println("Empty Polymorphism1 constructor");
    }

    public Polymorphism1(int x) {
        System.out.println("x is : " + x);
    }

    public Polymorphism1(int x, String str) {
        System.out.println(x + str);
    }

    public Polymorphism1(String str, int x) {
        System.out.println(str + x);
    }

    void Display() {
        System.out.println("empty display method Polymorphism1 class");
    }

    void Display(int x) {
        System.out.println("Display x : " + x);
    }

    void Display(int x, String str) {
        System.out.println("Display x and str : " + x + str);
    }

    void display(String str, int x) {
        System.out.println("Display name and i : " + str + x);
    }

    public static void main(String[] args) {

        Polymorphism1 obj = new Polymorphism1();
        obj.Display();
        obj.Display(10);
        obj.Display(20, " sai");
        obj.display("sandeep ", 50);

        System.out.println("\n\n");
        Polymorphism1 obj1 = new Polymorphism1(100);
        obj1.Display(77);
    }

}
