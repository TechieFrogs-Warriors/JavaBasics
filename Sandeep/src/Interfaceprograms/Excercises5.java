package Interfaceprograms;

interface FastFood {
    void food();
}

class Sandwich implements FastFood {
    public void food() {
        System.out.println("food");
    }

    public static void main(String[] args) {
        FastFood obj = new Sandwich();
        obj.food();
    }
}

public class Excercises5 {

}
