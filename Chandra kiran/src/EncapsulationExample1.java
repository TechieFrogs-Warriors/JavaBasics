class Person
{
    private String name;
    private String Age;
    private String height;
    private String weight;
    public String getperson(String name,String Age,String height,String weight )
    {
        System.out.println(Age);
        System.out.println(height);
        System.out.println(weight);
        return name;
    }
    
    public void setperson(String name,String Age,String height,String weight)
    {
        this.name=name;
       this.Age=Age;
        this.height=height;
        this.weight=weight;

    }
}
public class EncapsulationExample1 
{
    public static void main(String[] args) 
    {
      Person obj =new Person();
     obj.setperson("kiran", "25", "6","70");
     System.out.println(obj.getperson("chandu"," 22","6.3","70"));
      
    }



    
}
