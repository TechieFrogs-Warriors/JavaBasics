package Collections;

import java.util.Comparator;

public class Laptop implements Comparable<Laptop>
{
    //variables
    private String brandName;
    private int price;
    //parameterised constructor
    public Laptop(String name, int rate) 
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
    //It's a comparableInterface abstarct method which has to be implemented here in this class
    //because this class is implementing the comparableinterface
    @Override
    public int compareTo(Laptop obj) 
    {
        if(this.getPrice()>obj.getPrice())
        return 1;
        else 
        return -1;
    }


    //comparator
   public static  Comparator<Laptop> comp = new Comparator<Laptop>(){

        @Override
        public int compare(Laptop o1, Laptop o2) 
        {
            
            if(o1.getPrice()>o2.getPrice())
            return 1;
            else 
            return -1;
        }
        
    };
    
}
