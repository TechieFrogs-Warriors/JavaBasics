package TypeCasting;

//up casting
class Super {
    void display() {
        System.out.println("Display method of super class");
    }
}

public class Program17 extends Super {
    void display() {
        System.out.println("Dipslay method of sub class");
    }

    public static void main(String[] args) {
        Super obj = new Program17();
        obj.display();
    }

}
