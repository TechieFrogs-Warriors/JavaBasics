class PurchaseItem
{
    private String name;
    private double unitPrice;
    PurchaseItem()
    {
        this.name="vegetables";
        this.unitPrice=40;
    }
     public String getname()
     {
         return name;
     }
    public void setname(String name)
     {
         this.name=name;
     }
     public double getunitPrice()
     {
         return unitPrice;
     }
     public void setunitPrice(double unitPrice)
     {
         this.unitPrice=unitPrice;
     }
     public double getPrice()
     {
         return unitPrice;
     }
    /* PurchaseItem(String name,double unitPrice)
     {
         this.name="vegetables";
         this.unitPrice=40;
     }*/
}
class WeighedItem extends PurchaseItem
{
    private double weight;
    public  WeighedItem(double weight)
    {
       this.weight=weight;
    }
    public double getweight()
    {
        return weight;
    }
    public void setweight(double weight)
    {
        this.weight=weight;
    }
    public double getPrice()
    {
        return weight*super.getPrice();
    }
    
  /* public  WeighedItem(double weight)
    {
        
        this.weight=weight;
    }*/
}
class CountedItem extends PurchaseItem
{
    private int quantity;
    public CountedItem(int quantity)
   {
       this.quantity=quantity;
   }
    public int getquantity()
    {
        return quantity;
    }
    public void setquantity(int quantity)
    {
        this.quantity=quantity;
    }
    public double getPrice()
    {
        return quantity *super.getPrice();
    }
    
  /* public CountedItem(int quantity)
   {
       this.quantity=quantity;
   }*/
    
}
public class Inheritence9 
{
    public static void main(String[] args) 
    {
        WeighedItem obj = new WeighedItem(50);
        System.out.println("weight "+obj.getweight());
        System.out.println("unit Price "+obj.getunitPrice());
        System.out.println("Price "+obj.getPrice());
        CountedItem obj1 = new CountedItem(3);
        System.out.println("Quantity "+obj1.getquantity());
        System.out.println("UnitPrice "+obj1.getunitPrice());
        System.err.println("Price "+obj1.getPrice());


        
    }
    
}
