public class AreaOfRectangle 
{
    public static void main(String[] args) 
    {
        //Arguments passed for FIRST rectangle by creating object for constructor
        Rectangle obj=new Rectangle(4, 5);
        //Arguments passed for SECOND rectangle by creating another object for the same constructor
        Rectangle obj1=new Rectangle(5, 8);
        System.out.println("AREA OF FIRST RECTANGLE: "+obj.getArea());
        System.out.println("AREA OF SECOND RECTANGLE: "+obj1.getArea());
    }
    
}
class Rectangle
{
    int l,b;
    Rectangle(int length,int breadth)//constructor
    {
        l=length;
        b=breadth;
    }
    int getArea()//method
    {
        int area=l*b;
        return area;
    }
}
