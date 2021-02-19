public class AbstractPracticeProgram5 {
    public static void main(String[] args) {
        Cats obj1=new Cats();
        obj1.cats();
        Dogs obj2=new Dogs();
        obj2.dogs();
    }
    
}
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    public void cats(){
        System.out.println("Cats meow");
    }
    public void dogs() {
    }
}
class Dogs extends Animals{
    public void dogs(){
        System.out.println("Dogs bark");
    }
	public void cats() {	
	}
}