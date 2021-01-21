public class InheritancePracticeProgram2 {
    public static void main(String[] args) {
        Bank4 obj=new Bank4();
        obj.getBalence(2000);
    }
    
}
class Bank1{
    public float getBalence(float Amount){
        System.out.println("Balence Of Bank:"+Amount);
        return Amount;
    }
}
class Bank2 extends Bank1{
    public float getBalence(float Amount){
        super.getBalence(0);
        System.out.println("Balence Of BankA:"+Amount);
        return Amount;
    }
}
class Bank3 extends Bank2{
    public float getBalence(float Amount){
        super.getBalence(1000);
        System.out.println("Balence Of BankB:"+Amount);
        return Amount;
    }
}
class Bank4 extends Bank3{
    public float getBalence(float Amount){
        super.getBalence(1500);
        System.out.println("Balence Of BankC:"+Amount);
        return Amount;
    }
}