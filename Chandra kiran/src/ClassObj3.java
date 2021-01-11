class Triangle
{
    Triangle()
    {
        double a=3,b=4,c=5,p;
        double area,perimeter;
        perimeter=a+b+c;
        p=(a+b+c)/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(area);
        System.out.println(perimeter);
    }
    
}
public class ClassObj3 
{
    public static void main(String[] args) 
    {
        
    
      Triangle Obj = new Triangle();
      
    }
    
    
}
