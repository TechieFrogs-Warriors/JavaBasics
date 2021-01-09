class StudentX {
    String name;
    int roll_no;
}

public class Classprogram1 {
    public static void main(String[] args) {
        StudentX obj = new StudentX();
        obj.name = "jhon";
        obj.roll_no = 2;
        System.out.println("Name : " + obj.name + "\nROLL_no : " + obj.roll_no);
    }

}
