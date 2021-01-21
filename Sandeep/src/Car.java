public class Car {
    public Car() {
        System.out.println("Class Car");
    }

    public void vehicleType() {
        System.out.println("vehicle type : car");
    }
}

class Kia extends Car {
    public Kia() {
        System.out.println("Class Kia");
    }

    protected void brand() {
        System.out.println("brand : Kia");
    }

    void speed() {
        System.out.println("max speed : 140");
    }
}

class KiaSeltos extends Kia {
    public KiaSeltos() {
        System.out.println("Kia Model : Seltos");
    }

    public void speed() {
        System.out.println("max Speed : 130 ");
    }

    public static void main(String[] args) {
        KiaSeltos obj = new KiaSeltos();
        obj.vehicleType();
        obj.brand();
        obj.speed();
        obj.display();
    }

    public void display() {
        super.brand();
        super.speed();
    }
}