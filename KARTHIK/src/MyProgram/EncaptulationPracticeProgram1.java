package MyProgram;

public class EncaptulationPracticeProgram1 extends NEW1 {
    public static void main(String[] args) {
        Student3 obj=new Student3();
        obj.setName("karthik");
        obj.setRollNumber(19);
        obj.setMarks(85);
        obj.setRank(3);
        System.out.println("Name Of The Student: "+obj.getName());
        System.out.println("RollNumber Of The Student: "+obj.getRollNumber());
        System.out.println("Marks Of The Student: "+obj.getMarks());
        System.out.println("Rank Of The Student: "+obj.getRank());
        EncaptulationPracticeProgram1 obj=new EncaptulationPracticeProgram1();
        obj.getRollNumber();

        

    }
    
}
class Student3{
    private String name;
    private int rollNumber;
    private int marks;
    protected int rank;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    protected int getRollNumber() {
        return rollNumber;
    }

    protected void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


}
