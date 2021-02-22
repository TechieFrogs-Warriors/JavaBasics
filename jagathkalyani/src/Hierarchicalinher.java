

public class Hierarchicalinher {
    public static void main(String[] args) {
        Doctor objDoctor= new Doctor();
        Engineer objEngineer =new Engineer();
        objDoctor.Work();
        objEngineer.eat();
        System.out.println("human can eat");
        System.out.println("human can work");
     
        }
    
}
class Human{
    void Work(){
        
    }
    void eat(){
    }
}
class Engineer extends Human{

}
class Doctor extends Human{
   
}