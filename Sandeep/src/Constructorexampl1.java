
public class Constructorexampl1 {

    private String name;

    private Constructorexampl1() {
        System.out.println(" Constructor");
        name = "Default constructor";

    }

    public static void main(String[] args) {
        Constructorexampl1 obj = new Constructorexampl1();
        System.out.println("Name : " + obj.name);
    }

}
