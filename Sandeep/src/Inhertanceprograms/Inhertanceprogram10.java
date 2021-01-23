package Inhertanceprograms;

class Apple {
    int number_of_items = 2;
}

class Banana extends Apple {
    int number_of_items = 4;

    public Banana() {
        System.out.println("Banana Constructor");
    }

    public void show() {
        System.out.println("no of Banana's : " + number_of_items);
        System.out.println("no of apple's : " + super.number_of_items);
    }
}

public class Inhertanceprogram10 {
    public static void main(String[] args) {
        Banana obj = new Banana();
        obj.show();
    }

}
