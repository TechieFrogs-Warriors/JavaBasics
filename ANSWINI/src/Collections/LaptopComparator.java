package Collections;

public class LaptopComparator 
{
    
    //variables
    private String brandName;
    private int price;
    //parameterised constructor
    public LaptopComparator(String name, int rate) 
    {
        this.brandName =name;
        this.price = rate;
    }
    //default settre and getter methods for private variables
    public String getBrandName() 
    {
        return brandName;
    }
    public int getPrice() 
    {
        return price;
    }

    //tostring method to print the output
    @Override
    public String toString() 
    {
        
        return "brandName = "+brandName+" , price = "+price;
    }
    
    
}
