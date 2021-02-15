package TypeCasting;

class Animal3 {

}

public class Program25 extends Animal3 {
    static void method(Animal3 obj) {
        if (obj instanceof Program25) {
            Program25 obj1 = (Program25) obj;// down casting
            System.out.println("Down casting performed");
        }
    }

    public static void main(String[] args) {
        Animal3 obj = new Program25();
        Program25.method(obj);

    }

}
