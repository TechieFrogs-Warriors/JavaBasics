class Degree
{
    public void getDegree()
    {
      System.out.println("I got degree");
    }
    public void myGrad()
    {
        System.out.println("this is my qualification");
    }
    
}
class UnderGraduate extends Degree
{
    public void myGrad()
    {
        System.out.println("I am an Undergraduate");
    }
}
class PostGraduate extends Degree
{
    public void MyGrad()
    {
        System.out.println("I am Postgraduate");
    }

}
public class MethodPrg5 
{
   public static void main(String[] args) 
   {
       Degree Deg1=new Degree();
       UnderGraduate Under1=new UnderGraduate();
       PostGraduate Post1=new PostGraduate();
       Deg1.getDegree();
       Deg1.myGrad();
       Under1.myGrad();
       Post1.myGrad();
    } 
}
