package Interfaceprograms;

interface ABC {
    void print();
}

public class Excercises8 implements ABC {
    public void print() {
        System.out.println("ABC interface");
        class Ex8 {
            public void display() {
                System.out.println("Ex8");
            }
        }
        Ex8 inner = new Ex8();
        inner.display();
    }

    public static void main(String[] args) {
        Excercises8 obj = new Excercises8();
        obj.print();

    }

}
