package AccenturePrograms;

import java.util.Scanner;
//program to find nth or mth series element from the series
public class Nth_elementOfSeries 
{
    public static void main(String[] args) 
    {
        //Taking user input
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number position");
		int n = sc.nextInt();
        //result is based on even or odd number entered
		//System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
        sc.close();
	}
    
}
