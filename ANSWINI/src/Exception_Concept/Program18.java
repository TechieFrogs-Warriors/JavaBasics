package Exception_Concept;

public class Program18 
{
    //Program for checking Illegal Argument Exception
    int m;
    public void setMarks(int marks) 
    {
        //throw tells where and what exception is exactly occuring
        if(marks < 0 || marks > 100)throw new IllegalArgumentException(Integer.toString(marks));
        else
        m = marks;
    }
    public static void main(String[] args) 
    {
        Program18 p = new Program18();
        p.setMarks(45);
        System.out.println(p.m);
        Program18 p2 = new Program18();
        p2.setMarks(101);//throws exception
        System.out.println(p2.m);
        
    }
    
}
