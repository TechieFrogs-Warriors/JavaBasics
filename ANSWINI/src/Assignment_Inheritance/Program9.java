package Assignment_Inheritance;

public class Program9 
{
    public static void main(String[] args) 
    {
        WeightedItem weight=new WeightedItem();
        weight.getPrice();
        weight.setName("achyuth");
        System.out.println("Name of parent private member in child class: "+weight.getName());
        CountedItem count=new CountedItem();
        count.getPrice();
        count.setName("vedhansh");
        System.out.println("Name of private member in child class: "+count.getName());
        
    }
    
}
class PurchaseItem
{
    private String name;
    private double unitPrice;
    public PurchaseItem()
    {
        name="answini";
        unitPrice=25;
    }
    double getPrice()
    {
        System.out.println("unit price is: "+unitPrice);
        return unitPrice;
    }
    void setName(String n)
    {
        name=n;
    }
    String getName()
    {
        return name;
    }
    void setUnitPrice(double up)
    {
        unitPrice=up;
    }
}
class WeightedItem extends PurchaseItem
{
    private double weight=20;
    public WeightedItem()
    {
        
    }
    double getPrice()
    {
        super.getPrice();//using super class method to be displayed
        System.out.println("Weight is: "+weight);
        return weight;
    }
}
class CountedItem extends PurchaseItem
{
    private int quantity=5;
    CountedItem()
    {

    }
    double getPrice()
    {
        super.getPrice();//using super class method to be displayed
        System.out.println("Quantity is: "+quantity);
        return quantity;
    }
}
