package TypeCasting;

//down casting
class Super1 {
    void display() {
        System.out.println("Method of super class");
    }
}

public class Program18 {
    void display() {
        System.out.println("Method of sub class");
    }

    public static void main(String[] args) {
        Program18 obj = new Program18();
        Program18 obj1 = (Program18) obj;
        obj1.display();

    }

}
