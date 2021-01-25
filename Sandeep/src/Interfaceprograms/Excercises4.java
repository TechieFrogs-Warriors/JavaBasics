package Interfaceprograms;

interface Display {
    int a = 10;
    public int b = 20;
    static int c = 30;
    final int d = 40;
    public static final int g = 70;

    // private int e=50;//private varibles cannot be intilized
    // protected int f=60;//protected varibles cannot be intilized

}

public class Excercises4 implements Display {
    public static void main(String[] args) {
        // Diplay.b=30;
        System.out.println("a: " + a + "b: " + b + "c: " + c + "d: " + d + "g: " + g);
    }

}
