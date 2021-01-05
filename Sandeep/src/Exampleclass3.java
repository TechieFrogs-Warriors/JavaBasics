class Student3 {
    int x = 50;

    void Getdetails() {
        int id = 568;
        String name = "sandeep";
        String Department = "EEE";
        String Year = "4th";
        String semster = "2nd";
        System.out.println("id : " + id + "\n name : " + name + "\n department : " + Department + "\n year :" + Year
                + "  Semester : " + semster);
    }
}

class Persnalinformation {
    void Information() {

        String Address = "tadepalligudem";
        char gender = 'm';
        System.out.println("Address : " + Address + "\n gender : " + gender);
    }
}

public class Exampleclass3 {
    void Rank() {
        int rank = 6;
        System.out.println("Rank : " + rank + "th");
    }

    public static void main(String[] args) {
        /*
         * void marks(){ int rank = 6; System.out.println("Rank : " + rank + "th"); }
         */

        System.out.println("## Example 2 ###");
        Student1 obj1 = new Student1();
        obj1.id = 225;
        obj1.name = "Sai";
        obj1.Department = "CSE";
        System.out.println("id is :" + obj1.id + "\n name is : " + obj1.name + "\n Department is : " + obj1.Department);

        System.out.println("\n \n ### accesed from outside of class Example 1 ### \n");
        Student obj2 = new Student();
        System.out.println("id is : " + obj2.id);
        System.out.println("name is : " + obj2.name);

        System.out.println("\n \n ## Exmple 3 ###");
        Student3 obj3 = new Student3();
        obj3.Getdetails();
        System.out.println();
        Persnalinformation obj4 = new Persnalinformation();
        obj4.Information();
        // unable to print data form the method using print statement
        // System.out.println("Address : " + Address + "\n gender : " + gender);
        System.out.println("Printing variable : " + obj3.x);

        Exampleclass3 obj5 = new Exampleclass3();
        obj5.Rank();
    }

}
