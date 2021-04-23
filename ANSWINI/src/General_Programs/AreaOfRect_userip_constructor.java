import java.util.Scanner;

public class AreaOfRect_userip_constructor 
{
    public static void main(String[] args) 
    {
        //user input from keyboard
        Scanner obj=new Scanner(System.in);
        int length=obj.nextInt();
        int breadth=obj.nextInt();
        //object creation for constructor "Area" with argument values from user input.
        Areas obj1=new Areas(length, breadth);
        //calling area caluculating and returning method and catching result in a variable
        int a=obj1.returnArea();
        System.out.println("AREA OF RECTANGLE IS: "+a);
        obj.close();
        
    }
    
}
class  Areas
{
    int l,b,area;
    Areas(int length,int breadth)//constructor
    {
        l=length;
        b=breadth;
    }
    int returnArea()//method
    {
        area=l*b;
        return area;
    }

}

