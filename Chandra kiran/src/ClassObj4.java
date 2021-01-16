class Triangle1
{
    Triangle1(double a,double b,double c)
    {
        double area,perimeter,p;
        perimeter=a+b+c;
        p=(a+b+c)/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(area);
        System.out.println(perimeter);

    }

}
public class ClassObj4 
{
    public static void main(String[] args) 
    {
        Triangle1 Obj= new Triangle1(3, 4, 5);
        
        
    }
    
}
