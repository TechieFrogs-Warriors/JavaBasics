
class I {
    int i;

    void print() {
        System.out.println("I class");
    }

    void printNum() {
        System.out.println("i value is : " + i);
    }
}

class J extends I {
    int j;

    void printNum() {
        System.out.println("j value is : " + j);
    }
}

public class Classexample7 {

    public static void main(String[] args) {
        // I obj = new I();
        // obj.i = 10;
        // obj.printNum();

        J obj1 = new J();
        obj1.i = 50;

        obj1.j = 7;
        obj1.i=obj1.j;

        obj1.printNum();
        // method override it prints the subclass method

        obj1.print();

    }
}
