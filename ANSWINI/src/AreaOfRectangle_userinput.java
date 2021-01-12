import java.util.Scanner;

public class AreaOfRectangle_userinput 
{
    public static void main(String[] args) 
    {
        //user input from keyboard
        Scanner obj=new Scanner(System.in);
        int length=obj.nextInt();
        int breadth=obj.nextInt();
        //object creation for class "Area"
        Area obj1=new Area();
        //taking user input as arguments in method
        obj1.setDim(length, breadth);
        //calling area caluculating and returning method and catching result in a variable
        int a=obj1.getArea();
        System.out.println("AREA OF RECTANGLE IS: "+a);
        obj.close();
        
    }
    
}
class  Area
{
    int l,b,area;
    void setDim(int length,int breadth)//method
    {
        l=length;
        b=breadth;
    }
    int getArea()//method
    {
        area=l*b;
        return area;
    }

}
