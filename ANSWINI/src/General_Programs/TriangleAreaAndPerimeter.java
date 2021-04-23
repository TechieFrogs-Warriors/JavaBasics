public class TriangleAreaAndPerimeter 
{
    public static void main(String[] args) 
    {
        Triangle obj=new Triangle();//constructor with no areguments.
        
    }
}
class Triangle
{
    double s,perimeter,area;
    Triangle()
    {
        double a=3,b=4,c=5;
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA OF TRIANGLE : "+area);
        perimeter=a+b+c;
        System.out.println("PERIMETER OF TRIANGLE : "+perimeter);
    }

}
