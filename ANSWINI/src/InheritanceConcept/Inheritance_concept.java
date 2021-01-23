package InheritanceConcept;

public class Inheritance_concept 
{
    public static void main(String[] args) 
    {
        Grand_child gBoy=new Grand_child();
        gBoy.name="achyuth";
        gBoy.age=6;
        gBoy.profile();
        Grand_child2 gGirl=new Grand_child2();
        gGirl.name="vedha";
        gGirl.job="playing";
        gGirl.data();
        gGirl.profile();
        Parent p=new Parent(20000,15000);//calling parent constructor with arguments
        p.profile();
        Son s=new Son(50000, 45000);//calling son constructor with arguments
        s.age=25; //parent protected data member used by son 
        s.getAadharId();//parent private member used by son through getter
        s.familySize=3;//parent default member used by son
        s.profile();
        Daughter d=new Daughter();
        d.setAadharId(12345);//parent private member used by daughter using setter
        d.job="housewife";
        
    }
    public void div()
    {
        System.out.println("div method");
    }
    
}
class Parent
{
    public String name;
    protected int age;
    private int aadharId=5431;
    int familySize;
    int y=10;
    void setAadharId(int id)
    {
        aadharId=id;
    }
    int getAadharId()
    {
        return aadharId;
    }

    void profile()
    {
        String fatherName="prasad";
        String motherName="lakshmi";
        System.out.println("HEAD OF FAMILY  "+fatherName+" "+motherName);

    }
    Parent()
    {
        System.out.println("IAM DEFAULT CONSTRUCTOR OF PARENT CLASS");
    }
    Parent(int salary,int expenses)
    {
        int grocery=5000;
        int medical=5000;
        System.out.println("NOW A DAYS SALARY IS NOT ENOUGH FOR EXPENSES "+(grocery+medical));
    }
}
//inheriting parent class here"single inheritance
//hirerarical inheritance
class Son extends Parent
{
    String name="vivek";
    String hobby="cricket";
    void profile()
    {
        super.profile();//calls parent class profile.we are using it instead of overriding.
        System.out.println("IAM SON OF PARENT : "+name);
    }
    Son()
    {
        System.out.println("IAM SON'S DEFAULT CONSTRUCTOR");
    }
    Son(int salary,int expenses)
    {
        System.out.println("EXPENSES ARE TOO HIGH THAN PARENT'S TIME "+expenses);
    }
}
//inheriting parent class "single inheritance"
//hirerarical inheritence
class Daughter extends Parent
{
    String job;
    Daughter()
    {
        super(200,50);//invoking parent class constructor with arguments
        System.out.println("IAM DAUGHTER'S DEFAULT CONSTRUCTOR");
    }
    void profile()
    {
        System.out.println("IAM DAUGHTER OF PARENT");
    }   

}
//inheriting subclass(son) of parent class
//multilevel inheritence
class Grand_child extends Son
{
    void profile()
    {
        System.out.println("IAM GRANDCHILD OF PARENT AND CHILD OF SON");
    }

}
//inheriting subclass(daughter) of parent class
//multilevel inheritence
class Grand_child2 extends Daughter
{
    void data()
    {
        System.out.println("IAM GRANDCHILD OF PARENT AND CHILD OF DAUGHTER");
    }
    
}
final class Baby//final class cannot be inherited
{
    void display()
    {
        System.out.println("I AM FINAL CLASS ...CANT BE EXTENDED");
    }
}
/* class BabyBoy extends Baby{

} */

