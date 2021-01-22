package Abstractclass;

abstract class Animals {
    abstract void cats();

    abstract void dogs();
}

class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    void cats() {
        // TODO Auto-generated method stub

    }
}

class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {
        // TODO Auto-generated method stub

    }
}

public class Excercises6 {
    public static void main(String[] args) {
        Cats obj = new Cats();
        obj.cats();

        Dogs obj1 = new Dogs();
        obj1.dogs();
    }

}
