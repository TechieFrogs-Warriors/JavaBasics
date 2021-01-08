public class SubclassConcept 
{
    public static void main(String[] args) 
    {
        Degree obj=new Degree();
        UnderGraduate objUnder=new UnderGraduate();
        PostGraduate objPost=new PostGraduate();
        obj.getDegree();
        objUnder.myGrad();
        objPost.myGrad();
    }
    
}
class Degree
{
    public void getDegree()
    {
        System.out.println("I GOT DEGREE");
    }
    
}
class UnderGraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("answini");
    }
    public void myGrad()
    {
        System.out.println("IAM UNDERGRADUATE");
    }
}
class PostGraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("answini");
    }
    public void myGrad()
    {
        System.out.println("IAM POSTGRADUATE");
    }
}
