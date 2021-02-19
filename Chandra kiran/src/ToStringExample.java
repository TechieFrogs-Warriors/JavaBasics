class Address1
{
    int doorno;
    String Street;
    String City;
    public Address1(int doorno,String Street,String City)
    {
        this.doorno=doorno;
        this.Street=Street;
        this.City=City;
    
    }
    public Address1(String Street,String City)
    {
        this.Street=Street;
        this.City=City;
    }
    
    public String toString() {
        
        return doorno+" "+Street+" "+City;
    }
    public String toString(String Street,String City)
    {
        return Street+" "+City;
    }
    

}
public class ToStringExample 
{
    public static void main(String[] args) 
    {
        Address1 obj = new Address1(70, "7th Street", "Vizag");
        Address1 obj1 = new Address1("8th Street", "Hyderabad");
        System.out.println(obj);
        System.out.println(obj1.toString("9th Street", "Eluru"));
        
    }

    
}
