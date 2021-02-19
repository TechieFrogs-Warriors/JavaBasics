package Interfaceprograms;

public class Example4 {
    public static void main(String[] args) {
        bus2 obj=new Busses();
        obj.method();
    }
    
}
interface bus1{
    public void method();
}
interface bus2 {
    public void method();
}
class Busses implements bus1, bus2{
    public void method(){
        System.out.println("method ");
    }
    

}