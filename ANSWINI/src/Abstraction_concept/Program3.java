package Abstraction_concept;

public class Program3 
{
    public static void main(String[] args) 
    {
        A a=new A(90, 85, 74);
        System.out.println("percentage of studentA is: "+a.getPercentage());
        B b=new B(65, 81, 73, 94);
        System.out.println("percentage of studentBis: "+b.getPercentage());
        
    }
    
}
abstract class Marks
{
    abstract float getPercentage();
}
class A extends Marks
{
    float sub1, sub2, sub3, sub4;
    public  A(float s1,float s2,float s3)
    {
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
    float getPercentage()
    {
        float marks_Gained=sub1+sub2+sub3;
        float total_Marks=300;
        float percentage=(marks_Gained/total_Marks)*100;
        //System.out.println("percentage of studentA is: "+percentage);
        return percentage;
    }
}
class B extends Marks
{
    float sub1, sub2, sub3, sub4;
    public  B(float s1,float s2,float s3,float s4)
    {
        sub1=s1;
        sub2=s2;
        sub3=s3;
        sub4=s4;
    }
    float getPercentage()
    {
        float marks_Gained=sub1+sub2+sub3+sub4;
        float total_Marks=400;
        float percentage=(marks_Gained/total_Marks)*100;
       // System.out.println("percentage of studentA is: "+percentage);
        return percentage;
    }
}
