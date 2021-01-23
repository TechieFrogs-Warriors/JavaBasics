package Inhertanceprograms;

class A {
    int i = 10;
    int j = 20;

    A() {
        System.out.println("A class");
    }

    public void show() {
        System.out.println("value of i and j : " + i + " " + j);
    }
}

class B extends A {
    int k = 30;

    B() {
        System.out.println("B class");
    }

    public void show() {
        System.out.println("k value : " + k);
    }

}

public class Inhertanceprogram8 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
