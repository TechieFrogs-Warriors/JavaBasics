class Address
{
    
    private String Place;
    protected double doorno;
    public int Pincode;

    protected String getPlace()
    {
        return Place;
   }
     protected void setPlace(String Place)
    {
        this.Place=Place;
    }
    public double getdoorno()
    {  
        if(doorno%2==1)
        {
            System.out.println(doorno);
        }
        return doorno;
    }
    public void setdoorno(double doorno) 
    {
        this.doorno = doorno;
    }
     int getPincode()
    {
        return Pincode;

    }
     void setPincode(int Pincode)
    {
        this.Pincode=Pincode;
    }


}
public class EncapsulationExample 
{
    public static void main(String[] args) 
    {
        Address obj = new Address();
        obj.setPlace("Eluru");
       System.out.println("Name "+obj.getPlace());
        obj.setdoorno(35);
        System.out.println("Doorno "+obj.getdoorno());
        obj.setPincode(543002);
        System.out.println("Pincode "+obj.getPincode());
        

        
    }
    
}
