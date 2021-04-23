public class ClassObjectPractice 
{
    public static void main(String[] args) 
    {
        
        int a=5,b=10,c=a+b;
        System.out.println(c);
        sampleOne obj=new sampleOne();
        obj.SampleMethod();
       KidsData secObj=new KidsData();
        secObj.getVedanshData();
       //secObj.getAchyuthData().colour="dark";
        ClassObjectPractice2 thirdObj=new ClassObjectPractice2();
        //System.out.println("how many kids"+thirdObj.getAnswiniData());
       //thirdObj.kids;
       thirdObj.getAnswiniData();
       System.out.println(obj.t);

        
    }
    
}
class sampleOne
{
    int t=18;
    void SampleMethod()
    {
        int x=35,y=25;
        int z=x-y;
        System.out.println(z);
        //a=10;
      // secObj.getVedanshData();
      KidsData secObj=new KidsData();
        secObj.getVedanshData();
       
           
     
        

        


    }

}
