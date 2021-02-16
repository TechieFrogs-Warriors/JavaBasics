package TypeCasting;

class Parent2 {
    String name;

    // A method which prints the signature of the parent class
    void method() {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child extends Parent2 {
    int id;

    // Overriding the parent method to print the signature of the child class

    void method() {
        System.out.println("Method from Child");
    }
}

public class Program21 {
    public static void main(String[] args) {
        // up casting
        Parent2 obj = new Child();
        obj.name="Sai Sandeep";

        //obj.id=12;//this is not accessable

        System.out.println("Name : "+obj.name);
        obj.method();

        // Trying to Downcasting Implicitly 
        //Child c = new Parent(); //- > compile time error 

        //Down Casting

        Child obj1=(Child) obj;

        obj1.id=12;
        System.out.println("id : "+obj1.id);
        System.out.println("Name : "+obj1.name);
        obj1.method();

    }

}
