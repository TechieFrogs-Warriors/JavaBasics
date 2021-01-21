package Inhertanceprograms;

class Parent {
    public void parentmethod() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    public void childmethod() {
        System.out.println("This is Child class");
    }
}

public class Inhertanceprogram1 {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.parentmethod();
        Child obj = new Child();
        obj.childmethod();
        obj.parentmethod();
    }

}
