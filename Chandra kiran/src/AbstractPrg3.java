abstract class Marks
{
    public abstract void getPercentage();
}
class A3 extends Marks
{
    int M1,M2,M3;
    public void getPercentage()
    {
       
       int P;
        P=(M1+M2+M3)/3;
        System.out.println("Percentage of studentA "+P+"%");

    }
   A3(int M1,int M2,int M3)
   {
    this.M1=M1;
    this.M2=M2;
    this.M3=M3;

   }
}
class B3 extends Marks
{
    int M1,M2,M3,M4;
    public void getPercentage()
    {
       int P1;
        P1=(M1+M2+M3+M4)/4;
        System.out.println("Percentage of StudentB "+P1+"%");

    }
    B3(int M1,int M2,int M3,int M4)
    {
        this.M1=M1;
        this.M2=M2;
        this.M3=M3;
        this.M4=M4;

    }
}
public class AbstractPrg3 
{
    public static void main(String[] args) 
    {
        A3 obj = new A3(80, 70, 90);
        B3 obj1 = new B3(85, 90, 70, 80);
        obj.getPercentage();
        obj1.getPercentage();

        
    }
    
}
