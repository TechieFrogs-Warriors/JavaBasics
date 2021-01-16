package Access;
import AccessModifers.ProtectedSample;
public class Access_Specifiers 
{
    static int a,b;
    String nickName;
    public static void division()
    {
        a=10;b=80;
        int c=b/a;
        System.out.println(c);
    }
    public static void main(String[] args) 
    {
        class Data
        {
            void add()
            {
                int a=10,b=20,c=a+b;
                System.out.println("sum is: "+c);
            }
            String name,job_Profile;
        }
        Data d=new Data();
        d.add();
        d.name="Answini";
        d.job_Profile="Project Manager";
        System.out.println(d.job_Profile+" "+d.name);
        //accessing nested class
        NewData n=new NewData();
        int x=n.add(4, 6);
        System.out.println("subclass sum is: "+x);
        //accessing inner class
       //NewData nData=new NewData();
        //nData.
       secNewData sData=new secNewData();
       sData.mul(7, 3);
       secNewData s=new secNewData();
       Access_Specifiers ac=new Access_Specifiers();
       ac.division();
       //ProtectedSample p=new ProtectedSample();
      // ac.add();
       
    }
    static class NewData
    {
        int add(int a,int b)//private method with arguments
        {
            int sum=a+b;
            //System.out.println("sum from private method: "+sum);
            return sum;
        }
    }
    protected void mul(int a,int b)//method
    {
        int product=a*b;
        System.out.println("product of a and b is:"+product);

    }
    
}
final class NewData//this class cannot be inherited because its final
{
    final int a=2,b=4;//a and b values cannot be changed furtherbecause they are final.
    final int diff()//protected method with return type and arguments
    {
        //a=40;b=20;
        int difference=a-b;
        return difference;
    }

}
class secNewData 
{
    void mul(int a,int b)//method
    {
        int product=a*b;
        System.out.println("product of a and b is:"+product);

    }
    
    secNewData()//constructor
    {
        System.out.println("iam constructor");
    }
    int diff()
    {
        return 0;
    }
}
