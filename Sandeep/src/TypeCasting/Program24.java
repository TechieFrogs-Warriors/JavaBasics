package TypeCasting;

class ABC {
    ABC() {
        System.out.println("ABC");
    }

    void display() {
        System.out.println("parent");
    }
}

class CDS extends ABC {
    CDS() {
        System.out.println("CDS");
    }

}

public class Program24 {
    public static void main(String[] args) {
        ABC obj1 = new ABC();

        Program24 obj = null;
        System.out.println(obj instanceof Program24);// returns false because obj is null

    }

}
