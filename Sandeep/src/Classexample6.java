class Bank {
    void print() {
        System.out.println("print Bank");
    }

    double getBalance() {
        double balance = 0;
        System.out.println("Balance of Bank : " + balance);
        return balance;
    }
}

class BankA extends Bank {
    double getBalance(double balance) {
        System.out.println("Balance of BankA : " + balance);
        return balance;
    }
}

class BankB extends Bank {
    double getBalance(double balance) {
        System.out.println("Balance of BankB : " + balance);
        return balance;
    }
}

class BankC extends Bank {
    double getBalance(double balance) {
        System.out.println("Balance of BankC : " + balance);
        return balance;
    }
}

public class Classexample6 {
    public static void main(String[] args) {

        // Bank obj = new Bank();
        // obj.getBalance();
        // System.out.println("Balance : " + obj.getBalance(0));

        BankA obj1 = new BankA();
        obj1.getBalance(1000);
        obj1.print();
        obj1.getBalance();
        // System.out.println("Balance : " + obj1.getBalance(1000));

        BankB obj2 = new BankB();
        obj2.getBalance(1500);
        obj2.print();
        obj2.getBalance();
        // System.out.println("Balance : " + obj2.getBalance(1500));

        BankC obj3 = new BankC();
        obj3.getBalance(2000);
        obj3.print();
        obj3.getBalance();
        // System.out.println("Balance : " + obj3.getBalance(2000));
    }
}
