abstract class AbstractionPracticeProgram{
    public static void main(String[] args) {
        Designation obj=new Designation("doctor",88000);
        obj.getDetails();
        obj.setdetails2();//final method
        obj.display();//public method
        obj.show();//protected method
        mydetails2.show3();//static method
    }
    
}
//class can be either final or abstract we didnt mention both.
abstract class mydetails2{
    String Name;
    String Address;
    String Education;
    //only public,private,protected,default for construcor.
    mydetails2(String a,String b,String c){
        this.Name=a;
        this.Address=b;
        this.Education=c;
    }
    abstract void getDetails();
    final void setdetails2(){
        System.out.println("final method");
    }
    public void display(){
        System.out.println("public method");
    }
    protected void show(){
        System.out.println("protected method");
    }
    private void show2(){
        System.out.println("Private method");
    }
    static void  show3(){
        System.out.println("static method");
    }
}
class Designation extends mydetails2{
    String Job;
    double salary;
    //abstract Designation(){ we cant provide abstract to constructor.
    //}
    Designation(String Job,double salary){
        super("sahus","vedanth","medicine");
        this.Job=Job;
        this.salary=salary;  
    }
    public void getDetails(){
       // super.show2();we cant access this method because of private
        System.out.println("Name:"+Name);
        System.out.println("Address: "+Address);
        System.out.println("Education: "+Education);
        System.out.println("Job: "+Job);
        System.out.println("salary: "+salary);
    }
    //abstract void setdetails();this type of abstract methods declerations must contain abstract class.

}
