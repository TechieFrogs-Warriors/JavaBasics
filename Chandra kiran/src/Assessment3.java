abstract class Marks2
{
    public abstract void getPercentage();
}
class A2 extends Marks2
{
    int S1,S2,S3;
    public void getPercentage()
    {
        int percent =(S1+S2+S3)/3;
        System.out.println("Percentage of student A "+percent);

    }
    A2(int S1,int S2,int S3)
    {
        this.S1=S1;
        this.S2=S2;
        this.S3=S3;
    }
}
class B2 extends Marks2
{
    int S1,S2,S3,S4;
    public void getPercentage()
    {
        int percent =(S1+S2+S3+S4)/4;
        System.out.println("Percentage of Student B "+percent);
    }
    B2(int S1,int S2,int S3,int S4)
    {
        this.S1=S1;
        this.S2=S2;
        this.S3=S3;
        this.S4=S4;
    }
}
public class Assessment3 
{
    public static void main(String[] args) 
    {
        A2 obj = new A2(70, 80, 90);
        B2 obj1 = new B2(80,90,60,70);
        obj.getPercentage();
        obj1.getPercentage();
        
    }
    
}
