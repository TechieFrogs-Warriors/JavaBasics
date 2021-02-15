abstract class Animals3{
    abstract void cats();
    abstract void dogs();
}
class Cats3 extends Animals3{
    void cats() {
        System.out.println("Cats meow");
    }
    void dogs() {
    }
    
}
class Dogs3 extends Animals3{
    void cats(){
    }
    void dogs(){
        System.out.println("Dogs Bark");
    }
}
public class Assesment3 {
    public static void main(String[] args) {
        Cats3 obj=new Cats3();
        obj.cats();
        Dogs3 obj1=new Dogs3();
        obj1.dogs();
    }
}