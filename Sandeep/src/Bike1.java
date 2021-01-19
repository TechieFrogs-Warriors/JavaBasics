public class Bike1 {
    public Bike1() {
        System.out.println("Class Bike");
    }

    public Bike1(String name) {
        System.out.println("Bike ");
    }

    public void vehicleType() {
        System.out.println("vehicle type : Bike");
    }
}

class Hero extends Bike1 {
    public Hero() {
        System.out.println("Class Hero");
    }

    public Hero(String name) {
        System.out.println("Hero");
    }

    public void brand() {
        System.out.println("brand : Hero");
    }

    public void speed() {
        System.out.println("max speed : 90");
    }

    public void vehicleType() {
        System.out.println("vehicle type :Hero Bike");
    }
}

class Bajaj extends Bike1 {
    public Bajaj() {
        System.out.println("Class Bajaj");
    }

    public Bajaj(String name) {
        System.out.println("Bajaj");
    }

    public void brand() {
        System.out.println("brand : Bajaj");
    }

    public void speed() {
        System.out.println("max speed : 70");
    }

    public void vehicleType() {
        System.out.println("vehicle type : Bajaj Bike");
    }
}

class Ktm extends Bike1 {
    public Ktm() {
        System.out.println("Class Ktm");
    }

    public Ktm(String name) {
        System.out.println("Ktm");
    }

    public void brand() {
        System.out.println("brand : Ktm");
    }

    public void speed() {
        System.out.println("max speed : 70");
    }

    public void vehicleType() {
        System.out.println("vehicle type : ktm Bike");
    }

    public void display() {
        super.vehicleType();
    }
}

class Main {

    public static void main(String[] args) {

        // Hero class
        Hero obj = new Hero();
        obj.vehicleType();
        obj.brand();
        obj.speed();
        obj.vehicleType();

        // Bajaj class
        Bajaj obj1 = new Bajaj("bajaj");
        obj1.vehicleType();
        obj1.brand();
        obj1.speed();
        obj1.vehicleType();

        // Ktm class
        Ktm obj2 = new Ktm();
        obj2.brand();
        obj2.speed();
        obj2.vehicleType();
        obj2.display();

    }

}
