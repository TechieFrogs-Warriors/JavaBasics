public class TriangleArea_Perimeter 
{
    public static void main(String[] args) 
    {
        Triangle1 obj=new Triangle1(3, 4, 5);//condtructor with arguments passsed
         
    } 
}
class Triangle1
{
    double s,perimeter,area;
    Triangle1(double a,double b,double c)
    {
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA OF TRIANGLE : "+area);
        perimeter=a+b+c;
        System.out.println("PERIMETER OF TRIANGLE : "+perimeter);
    }

}

