package InterfaceExcercisePrograms;

public class InterfaceExerciseProgram5 {
    public static void main(String[] args) {
        Sandwich obj=new Sandwich();
        obj.food();
    }  
}
interface FastFood {
    void food();
}
class Sandwich implements FastFood{

    public void food() {
        System.out.println("Select Your Food");

    }

}