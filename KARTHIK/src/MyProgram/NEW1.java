package MyProgram;

public class NEW1 {
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
