public class ConstructorWithArguments 
{
    public static void main(String[] args) 
    {
        //values for parameters can be given here
        ConstructorWithArguments obj=new ConstructorWithArguments(200, "Designer", 12348.471f);
    }
    ConstructorWithArguments(int id,String jobName,float budget)
    {
        //if the following values are assigned constructor will take these only.
        //id=100;
        //jobName="developer";
        //budget=25450.789f;
        System.out.println("ARGUMENT CNSTRUCTOR IS CALLED");
        System.out.println("PROFILE IS: "+id+" "+jobName+" "+budget);

    }
}
