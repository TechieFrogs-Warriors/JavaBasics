import java.util.Scanner;

public class AreaOf_Rectangle_Square 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE");
        double length=obj.nextDouble();
        double breadth=obj.nextDouble();
        System.out.println("AREA OF RECTANGLE IS:  "+Area.area(length, breadth));
        System.out.println("ENTER THE SIDE OF SQUARE");
        int side=obj.nextInt();
        System.out.println("AREA OF SQUARE IS:  "+Area.area(side));
        obj.close();
        
    }
    static class Area
    {
        static double area(double length,double breadth)
        {
            return length*breadth;
        }
        static int area(int side)
        {
            return side*side;
        }
    } 
}
