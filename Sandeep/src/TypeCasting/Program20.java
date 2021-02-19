package TypeCasting;

//up casting and down clasting
class Animal {
    String name;

    void nature() {
        System.out.println("Animal");
    }
}

class Fish extends Animal {
    //name="fish";
    String color;

    void nature() {
        System.out.println("Aquatic animal");
    }
}

public class Program20 {
    public static void main(String[] args) {
        Animal obj = new Fish();
        // The object 'a' has access to only the parent's properties.
        // That is, the colour property cannot be accessed from 'a'
        obj.name = "CaterFish";

        //obj.color="Red";// This statement throws a compile-time error

        // Creating an object to represent Child c = new Child();
        Fish obj1 = new Fish();

        // The object 'f' has access to all the parent's properties
        // along with the child's properties That is, the colour property can
        // also be accessed from 'obj'
        obj1.name = "Dolphin";
        obj1.color = "Grey";

        // Printing the 'obj' properties
        System.out.println("Object obj");
        System.out.println("Name : " + obj.name);
        // This statement will not work
        // System.out.println("Fish1 Color" +a.color);

        obj.nature();

        // Printing the 'obj1' properties
        System.out.println("object obj2");
        System.out.println("Name : " + obj1.name);
        System.out.println("Color : " + obj1.color);
        obj1.nature();
    }

}
