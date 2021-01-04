class Student1 {
    int id;
    String name;
    String Department;
}

public class Exampleclass2 {
    public static void main(String[] args) {
        Student1 std1 = new Student1();
        std1.id = 225;
        std1.name = "Sai";
        std1.Department = "CSE";
        System.out.println("id is :" + std1.id + "\n name is : " + std1.name + "\n Department is : " + std1.Department);
        System.out.println("\n ### accesed from outside of class ### \n");
        Student std2 = new Student();
        System.out.println("id is : " + std2.id);
        System.out.println("name is : " + std2.name);
    }
}
