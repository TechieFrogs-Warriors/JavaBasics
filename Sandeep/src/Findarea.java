public class Findarea {
    public static void main(String[] args) {
        System.out.println("## Rectangle ##");
        Rectangle obj = new Rectangle();

        obj.height = 25;
        obj.width = 15;

        obj.findArea();

        System.out.println("## Sqare ##");
        Sqare obj1 = new Sqare();
        obj1.getData();
        obj1.findsqarearea();
    }

}
