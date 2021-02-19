package TypeCasting;

class Parent1 {
    public void print() {
        System.out.println("Parent print method");
    }
}

public class Program6 extends Parent1 {
    public void print() {
        System.out.println("Program6 class print method");
    }

    public static void main(String[] args) {
        // Program6 obj = new Program6();
        // obj.print();

        Parent1 obj1 = new Program6();

        Program6 obj2 = (Program6) obj1;
        obj2.print();
    }

}
