package Interfaceprograms;

interface Shape {
    void displayShape();
    // void getdet()//cannot create a body to method
    // {

    // }
}

interface Color {
    void displayColor();
}

interface Square extends Shape, Color {
    void displaySquare();
}

public class Example3 implements Square {// we can not use extends becous its not a supperclass
    public void displayShape() {
        System.out.println("Shape interface method");
    }

    public void displayColor() {
        System.out.println("color interface method");
    }

    public void displaySquare() {
        System.out.println("Square method");
    }

    public static void main(String[] args) {
        Square obj = new Example3();
        obj.displayShape();
        obj.displayColor();
        obj.displaySquare();

        // Square obj1=new Square();//cannot create objoct to interface
    }

}
