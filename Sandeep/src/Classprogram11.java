import java.util.*;

class Distance {
    int feet, inch; // Private data of type int

    public void getDistance() // Public method to read the Data(feet & inch) from KB
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Feet : ");
        feet = sc.nextInt();
        System.out.println("Inch : ");
        inch = sc.nextInt();
    }

    public void showDistance() // Public method to show the Data(feet & inch) on Screen
    {
        System.out.println(feet + " Feet " + inch + " Inch ");
    }

    void addDistance(Distance D1, Distance D2) // logic
    {
        inch = D1.inch + D2.inch;// adding two different inches
        // 12 inch = 1 feet
        feet = D1.feet + D2.feet + (inch / 12);// adding two different feets and quotient of inches/12(i.e feet)
        inch = inch % 12;// remainder of inches/12 is extra inches
    }
}

public class Classprogram11 {
    public static void main(String[] args) {
        Distance D1 = new Distance();// Declaring three objects d1,d2 and d3 of type Distance
        Distance D2 = new Distance();
        Distance D3 = new Distance();
        System.out.println("Enter the First Distance ");
        D1.getDistance(); // Calling get
        System.out.println("Enter the Second Distance ");
        D2.getDistance();
        D3.addDistance(D1, D2);
        System.out.println("Result :");
        D3.showDistance();

    }

}
