public class SubClassConcept3 
{
    public static void main(String[] args) 
    {
        myNewData obj=new myNewData();
        obj.i=25;
        obj.printNum();//parent class(myData) method is called here.
        myNewData obj1=new myNewData();//created another object for child class here.Actually not needed.
         obj1.j=75;
        obj1.printNum();//child class(myNewData) method is called here.
        //But since both methods have same name and parameters,subclass value is given to parent class.
    }   
}
class myData
{
    int i;
    void printNum()
    {
        System.out.println("VALUE OF 'i' IS : "+i);
    }
}
class myNewData extends myData
{
    int j;
    void printNum()
    {
       // i=12; I can use 'i' here which is parent class instance variable.
        System.out.println("VALUE OF 'j' IS : "+j);
    }
}
