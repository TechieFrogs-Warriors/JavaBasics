package Inhertanceprograms;

class Counter {
    int i = 0;

    public void Increment() {
        for (i = 0; i < 3; i++) {

        }
        System.out.println("i : " + i);

    }
}

public class Inhertanceprogram7 extends Counter {
    public static void main(String[] args) {
        Inhertanceprogram7 obj = new Inhertanceprogram7();
        obj.Increment();
    }

}
