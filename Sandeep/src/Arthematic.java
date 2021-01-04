class Add {
    int a;
    int b;
    int c = a + b;
}

class Subtraction {
    int a;
    int b;
    int c = a - b;
}

class Multipication {
    int a;
    int b;
    int c = a + b;
}

class Divide {
    int a;
    int b;
    int c = a / b;
}

class Percentage {
    int a;
    int b;
    int c = a % b;
}

public class Arthematic {
    public static void main(String[] args) {

        System.out.println("## Addition ##\n");
        Add obj = new Add();
        obj.a = 10;
        obj.b = 20;
        obj.c = obj.a + obj.b;
        System.out.println(obj.a + " + " + obj.b + " = " + obj.c);

        System.out.println(" \n \n ## Subtraction ##\n");
        Subtraction obj1 = new Subtraction();
        obj1.a = 50;
        obj1.b = 20;
        obj1.c = obj1.a - obj1.b;
        System.out.println(obj1.a + " - " + obj1.b + " = " + obj1.c);

        System.out.println("\n\n ## Multipication ## \n");
        Multipication obj2 = new Multipication();
        obj2.a = 10;
        obj2.b = 10;
        obj2.c = obj2.a * obj2.b;
        System.out.println(obj2.a + " * " + obj2.b + " = " + obj2.c);

        System.out.println("\n\n ## Divide ##\n");
        Divide obj3 = new Divide();
        obj3.a = 40;
        obj3.b = 10;
        obj3.c = (obj3.a) / (obj3.b);
        System.out.println(obj3.a + " / " + obj3.b + " = " + obj3.c);

        System.out.println("\n\n ## Percentage ##\n");
        Percentage obj4 = new Percentage();
        obj4.a = 10;
        obj4.b = 10;
        obj4.c = (obj4.a) % (obj4.b);
        System.out.println(obj4.a + " % " + obj4.b + " = " + obj4.c);

    }
}
