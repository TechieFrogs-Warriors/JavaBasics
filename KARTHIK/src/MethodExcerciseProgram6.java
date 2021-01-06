public class MethodExcerciseProgram6 {
    public static void main(String[] args) {
        float n1=0;
        Bank obj1=new Bank();
        obj1.getBalence(n1);
        BankA obj2=new BankA();
        obj2.getBalence(n1);
        BankB obj3=new BankB();
        obj3.getBalence(n1);
        BankC obj4=new BankC();
        obj4.getBalence(n1);
    }
    
}
class Bank{
    public float getBalence(float Amount){
        Amount=0;
        System.out.println("Balence Of Bank:"+Amount);
        return Amount;
    }
}
class BankA extends Bank{
    public float getBalence(float Amount){
        Amount=1000;
        System.out.println("Balence Of BankA:"+Amount);
        return Amount;
    }
}
class BankB extends Bank{
    public float getBalence(float Amount){
        Amount=1500;
        System.out.println("Balence Of BankB:"+Amount);
        return Amount;
    }
}
class BankC extends Bank{
    public float getBalence(float Amount){
        Amount=2000;
        System.out.println("Balence Of BankC:"+Amount);
        return Amount;
    }
}