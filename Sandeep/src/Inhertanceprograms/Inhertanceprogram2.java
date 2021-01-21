package Inhertanceprograms;

class Parent1 {
    private void parentmethod() {
        System.out.println("This is Parent class");
    }
}

class Child1 extends Parent1 {
    public void childmethod() {
        System.out.println("This is Child class");
    }
}

public class Inhertanceprogram2 {
    public static void main(String[] args) {
        Parent1 obj1 = new Parent1();
        // obj1.parentmethod();
        Child1 obj = new Child1();
        obj.childmethod();
        // obj.parentmethod();
    }

}
