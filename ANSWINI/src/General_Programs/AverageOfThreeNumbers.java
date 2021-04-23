import java.util.Scanner;

public class AverageOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER ");
        double a=obj.nextDouble();
        System.out.println("ENTER SECOND NUMBER ");
        double b=obj.nextDouble();
        System.out.println("ENTER THIRD NUMBER ");
        double c=obj.nextDouble();
        Average obj1=new Average();
        obj1.getAverage(a, b, c);
        obj.close(); 
    }
}
class Average
{
    void getAverage(double a,double b,double c)
    {
        double average=(a+b+c)/3;
        System.out.println("AVERAGE OF THREE NUMBERS IS : "+average);
    }

}
