import java.util.Scanner;

public class PracticeProgramOnClassAndObject11 {
    public static void main(String[] args) {
        Distance D1=new Distance();
        
		Distance D2=new Distance();
		Distance D3=new Distance();
		System.out.println("Enter 1st Distance ");
		D1.getDistance();
		System.out.println("Enter 2nd Distance ");
		D2.getDistance();
		D3.addDistance(D1,D2);                  
		System.out.println("Total Distance Is" );
		D3.showDistance(); 
    }
}
class Distance
{
	int feet,inches;
	void getDistance(){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Feet: ");
		feet=obj.nextInt();
		System.out.print("Enter Inches: ");
        inches=obj.nextInt();
        
    }
    void addDistance(Distance D1, Distance D2){
		inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
	void showDistance()
	{
		System.out.println("FEET: "+ feet + "\tINCHES: "+ inches);
    }	
}

