package Access;
import Access.Access_Specifiers;
import InheritanceConcept.Inheritance_concept;
public class AccessModifier2 extends Inheritance_concept
{
    public static void main(String[] args) 
    {
        NewData nd=new NewData();
        System.out.println(nd.diff());
        //NewData nData=new NewData();
        //nData.
        secNewData sData=new secNewData();
        sData.mul(5, 5);
        New nda=new New();
        nda.n();
        //inheritance concept checking from other package
        AccessModifier2 ac=new AccessModifier2();
        ac.div();
        
    }
    
}
class New 
{
    void n()
    {
        //accessing nested class using outerclass
        Access_Specifiers.NewData n=new Access_Specifiers.NewData();
        System.out.println("iam in new class");
        System.out.println(n.add(10, 90));
        //accessing inner class
        NewData nd=new NewData();
        System.out.println(nd.diff());
        
    }
}
