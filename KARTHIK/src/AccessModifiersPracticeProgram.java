 class AccessModifiersPracticeProgram {
    public static void main(String[] args) {
        Student2 obj=new Student2();
        obj.Student3();
        System.out.println(obj.s);
    }
    
}
class Student2{
    private int RollNumber=15;
    String s="Karthik";
    public int Student3(){
        int i=100,j=75;
        if(i>=j){
            System.out.println("Student Have 75% of Attendance ");
        }
        else{
            System.out.println("Student Not Have 75% of Attendance ");
        }
        System.out.println(RollNumber);
        return RollNumber;      
    }
    
}