class Degree {
    void getDegree() {
        System.out.println("\n I got a degree \n");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("\n Iam a Undergraduate \n");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("\n Iam a Postgraduate \n");
    }
}

public class Classexample5 {
    public static void main(String[] args) {
        Degree obj = new Degree();
        obj.getDegree();

        Undergraduate obj1 = new Undergraduate();
        obj1.getDegree();
        // obj1.getDegree();// method override

        Postgraduate obj2 = new Postgraduate();
        obj2.getDegree();
    }

}
