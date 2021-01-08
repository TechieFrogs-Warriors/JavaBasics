class Bank
{
    int getBalance()
    {
        int balance=0;
        System.out.println("Balance of Bank: "+balance);
        return balance;
    }
}
class BankA extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("Balance of BankA : "+balance);
        return balance;
    }
}
class BankB extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("Balance of BankB : " +balance);
        return balance;
    }
}
class BankC extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("Balance of BankC : "+balance);
        return balance;
    }
}
public class MethodPrg6 
{
    public static void main(String[] args) 
    {
        BankA obj1=new BankA();
        obj1.getBalance(1000);
        obj1.getBalance();
        BankB obj2=new BankB();
        obj2.getBalance(1500);
        obj2.getBalance();
        BankC obj3=new BankC();
        obj3.getBalance(2000);
        obj3.getBalance();
        
        
    }
    
}
