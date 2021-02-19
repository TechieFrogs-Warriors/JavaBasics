public class TypeCastingPractice2 {
    public static void main(String[] args) {
        Fruit3 obj=new Apple2();//parent calss obj creaction refernce to child
        obj.Show();
        ((Apple2)obj).show2();//downcasting the parent to child

        // Apple2 animal;
        // String s=(String)animal;//Cannot cast from Apple2 to String
    }

}
interface Fruit3{
    void display();
    
    void Show();
}
class Apple2 implements Fruit3{
    
    public void display() {
        System.out.println("Display Method");
    }
    
    public void Show() {
        System.out.println("Show Method");
    }

    public void show2(){
        System.out.println("Unique Show Method");
    }

}