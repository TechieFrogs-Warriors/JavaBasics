package Abstractclass;

abstract class Parent {
    public  void message()
    {
        System.out.println("parent");
    }
}

class Subclass1 extends Parent {
    public void message() {
        System.out.println("subclass1");
    }
}

class Subclass2 extends Parent {
    public void message() {
        System.out.println("subclass2");
    }
}

public class Excercises1 {
    public static void main(String[] args) {
        Subclass1 obj = new Subclass1();
        obj.message();

        Subclass2 obj1 = new Subclass2();
        obj1.message();
    }

}
