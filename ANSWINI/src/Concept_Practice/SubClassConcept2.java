public class SubClassConcept2 
{
    public static void main(String[] args) 
    {
        BankA objA=new BankA();
        System.out.println("$"+(objA.getBalance(1000)));
        BankB objB=new BankB();
        System.out.println("$"+(objB.getBalance(1500)));
        BankC objC=new BankC();
        System.out.println("$"+(objC.getBalance(2000)));
        System.out.println(objB.getBalance());
        objC.myDeposits();
    }
    
}
class Bank
{
    void myDeposits()
    {
        System.out.println("BOY IS DEPOSITING IN THREE BANKS");
    }
    int getBalance()
    {
        System.out.println("BOY'S BANK BALANCE IN MAIN BRANCH is: ");
        return 0;
    }
}
class BankA extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("BOY'S BALANCE IN BANKA ACCOUNT IS : ");
        return balance;
    }
}
class BankB extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("BOY'S BALANCE IN BANKB ACCOUNT IS : ");
        return balance;
    }
}
class BankC extends Bank
{
    int getBalance(int balance)
    {
        System.out.println("BOY'S BALANCE IN BANKC ACCOUNT IS : ");
        return balance;
    }
}

