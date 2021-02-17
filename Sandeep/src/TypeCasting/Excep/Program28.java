package TypeCasting.Excep;

class Parent {
    String parentName;

    Parent(String n1) {
        parentName = n1;
    }

    public void display() {
        System.out.println(parentName);
    }
}

class Child extends Parent {
    String childName;

    Child(String n2) {
        super(n2);
        childName = n2;
    }

    public void display() {
        System.out.println(childName);
    }
}

public class Program28 {
    public static void main(String args[]) {
        Child ct1 = new Child("Sai");
        Parent pt1 = new Parent("Sandeep");
        pt1 = ct1;
        pt1.display();

        Parent pt2 = new Parent("Krishna");
        Child ct2 = (Child) pt2;

    }

}
