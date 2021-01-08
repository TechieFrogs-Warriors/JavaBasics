class StudentA {
    String name;
    int age;
    int i, j, k, d;

    StudentA(String str, int a) {
        name = str;
        age = a;
    }

    StudentA(StudentA obj) {
        name = obj.name;
        age = obj.age;
    }

    public void display() {
        System.out.println("Name is : " + name);
        System.out.println("age is : " + age);
    }
}

public class Constructorexampl8 {
    public static void main(String[] args) {

        System.out.println("## Original Content ##");
        StudentA obj = new StudentA("sai", 25);
        obj.display();

        System.out.println("## Copied Content ##");
        StudentA obj1 = new StudentA(obj);
        obj1.display();

    }

}
