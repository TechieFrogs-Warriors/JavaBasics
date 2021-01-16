import java.util.Scanner;

public class AddingTwo_Type_Distances 
{
    public static void main(String[] args) 
    {
        Distance D1=new Distance();
		Distance D2=new Distance();
		Distance D3=new Distance();
		System.out.println("ENTER FIRST DISTANCE: ");//read first distance
		D1.getDistance();
		System.out.println("ENTER SECOND DISTANCE: ");//read second distance
		D2.getDistance();
		D3.addDistance(D1,D2);                        //adding two distances
		System.out.println("TOTAL DISTANCE IS:" );
		D3.showDistance(); 
    }
}
class Distance
{
	int feet,inches;
	void getDistance()
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("ENTER FEET: ");
		feet=obj.nextInt();
		System.out.print("ENTER INCHES: ");
        inches=obj.nextInt();
    }
    void addDistance(Distance D1, Distance D2) //logic
	{
		inches=D1.inches+D2.inches;//adding two different inches
		//12 inch = 1 feet
		feet=D1.feet+D2.feet+(inches/12);//adding two different feets and quotient of inches/12(i.e feet)
		inches=inches%12;//remainder of inches/12 is extra inches
	}
	void showDistance()
	{
		System.out.println("FEET: "+ feet + "\tINCHES: "+ inches);
    }	
}
