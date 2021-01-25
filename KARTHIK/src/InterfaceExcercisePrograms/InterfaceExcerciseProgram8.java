package InterfaceExcercisePrograms;

public class InterfaceExcerciseProgram8 implements Program8 {
    public static void main(String[] args) {
        InterfaceExcerciseProgram8 obj = new InterfaceExcerciseProgram8();
        obj.print();
    }
    public void print() {
        System.out.println("ABC interface");
        class Exercise8 {
            public void display() {
                System.out.println("Excercise8");
            }
        }
        Exercise8 inner = new Exercise8();
        inner.display();
    }
    
}
interface Program8 {
    void print();
}