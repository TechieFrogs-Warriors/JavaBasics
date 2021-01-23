package Abstraction_concept;

public class Program2 
{
    public static void main(String[] args) 
    {
        BankA b1=new BankA();
        b1.getBalance();
        BankB b2=new BankB();
        b2.getBalance();
        BankC b3=new BankC();
        b3.getBalance();
        
    }   
}
abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank
{
    void getBalance()
    {
        int deposit=100;
        System.out.println("balance is: $"+deposit);
    }
}
class BankB extends Bank
{
    void getBalance()
    {
        int deposit=150;
        System.out.println("balance is: $"+deposit);
    }
}
class BankC extends Bank
{
    void getBalance()
    {
        int deposit=200;
        System.out.println("balance is: $"+deposit);
    }
}


