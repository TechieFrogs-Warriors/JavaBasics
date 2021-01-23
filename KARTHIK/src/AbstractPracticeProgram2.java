public class AbstractPracticeProgram2 {
    public static void main(String[] args) {
        BankA1 obj1=new BankA1();
        obj1.getBalence();
        BankB1 obj2=new BankB1();
        obj2.getBalence();
        BankC1 obj3=new BankC1();
        obj3.getBalence();
    }
    
}
abstract class Banka{
    abstract void getBalence();
}
class BankA1 extends Banka{
   public void getBalence() {
      System.out.println("Balence Of Bank A: "+"100$");  
    }
}
class BankB1 extends Banka{
    public void getBalence(){
        System.out.println("Balence Of Bank B: "+"150$");
    }
}
class BankC1 extends Banka{
    public void getBalence(){
        System.out.println("Balence Of Bank C: "+"200$");
    }
}
