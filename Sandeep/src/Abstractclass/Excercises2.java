package Abstractclass;

abstract class Bank {
    public abstract void getBalance();
}

class BankA extends Bank {
    public void getBalance() {
        System.out.println("Balance : $100");
    }
}

class BankB extends Bank {
    public void getBalance() {
        System.out.println("Balance : $150");
    }
}

class BankC extends Bank {
    public void getBalance() {
        System.out.println("Balance : $200");
    }
}

public class Excercises2 {
    public static void main(String[] args) {
        BankA obj = new BankA();
        obj.getBalance();

        BankB obj1 = new BankB();
        obj1.getBalance();

        BankC obj2 = new BankC();
        obj2.getBalance();

    }

}
