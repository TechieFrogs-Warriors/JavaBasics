public class InheritancePracticeProgram {
    public static void main(String[] args) {
        Bikes obj=new Bikes();
        obj.Number();
        System.out.println("Number Of cars: "+obj.cars);
    }
    
}
class Vehicle{
    int Bike=25;
    int cars=75;
}
class Bikes extends Vehicle{
    public int Number(){
        System.out.println("Number Of Bikes: "+Bike);
        return 0;
    }
}
