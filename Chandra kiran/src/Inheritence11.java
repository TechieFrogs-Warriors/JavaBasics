class Circle1
{
    private double radius;
    private String color;
  public Circle1()
    {
      this.radius=1.0;
      this.color="red";

    }
   public Circle1(double radius)
    {
      this.radius=radius;

    }
    public Circle1(double radius,String color)
    {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() 
    {
        return radius;
    }
    public void setradius(double radius)
    {
        this.radius=radius;
    }
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public double getArea()
    {
        return 3.14*(radius*radius);
    }
    public String toString()
    {
        return "["+"raduis: " + radius +" "+ "color: "+color+"]";
    }
}
class Cylinder extends Circle1
{
    private double height;
   public Cylinder()
   {
        super();
        this.height=1.0;
        
    }
   public Cylinder(double height)
    {
        super();
        this.height=height;
    }
    Cylinder(double height,double radius)
    {
        super(radius);
        this.height=height;

    }
    public Cylinder(double height,double radius,String color)
    {
        super(radius,color);
        this.height=height;

    }
    public double getHeight() 
    {
        return height;
    }
    public void setHeight(double height) 
    {
        this.height = height;
    }
    public double getArea()
    {
        System.out.println("Area of circle:"+super.getArea());
    double surfacearea= (2*3.14*getRadius()*(getRadius()+getHeight()));
     return surfacearea;
    }
    public double getVolume()
    {
        return super.getArea()*height;
    }


}
public class Inheritence11 
{
    public static void main(String[] args) 
    {
        Cylinder obj = new Cylinder();
        System.out.println("radius "+obj.getRadius());
        System.out.println("Color "+obj.getColor());
        System.out.println("Height "+obj.getHeight());
        System.out.println("Surface area of Cylinder "+obj.getArea());
        System.out.println("Volume of Cylinder "+obj.getVolume());
        System.out.println(obj.toString());
    }
    
}
