class Const {
    String str;

    Const(String s) {
        str = s;

    }

    void display() {
        System.out.println(str);
    }
}

public class Constructorexampl3 {
    public static void main(String[] args) {
        Const obj = new Const("sai");
        Const obj1 = new Const("Sandeep");

        obj.display();
        obj1.display();
    }

}
