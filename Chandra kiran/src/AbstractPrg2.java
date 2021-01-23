abstract class Bank1
{
    public abstract void getBalance();
}
class BankA1 extends Bank1
{
  public void  getBalance()
  {
      String Depositedamount="$100";
      System.out.println("BankA1 "+Depositedamount);
  }
}
class BankB1 extends Bank1
{
    public void getBalance()
    {
        String Depositedamount="$200";
        System.out.println("BankB1 "+Depositedamount);
    }
}
class BankC1 extends Bank1
{
    public void getBalance()
    {
        String Depositedamount="$300";
        System.out.println("BankC1 "+Depositedamount);
    }
}
public class AbstractPrg2 
{
    public static void main(String[] args) 
    {
        BankA1 obj = new BankA1();
        BankB1 obj1 = new BankB1();
        BankC1 obj2 = new BankC1();
        obj.getBalance();
        obj1.getBalance();
        obj2.getBalance();
        
    }
    
}
