class Average
{
    
    void average(int a,int b,int c)
    {
        int average=(a+b+c)/3;
        System.out.println("Average of Three numbers "+average);
    }
}
public class ClassObj8 
{
    public static void main(String[] args) 
    {
        Average obj = new Average();
        obj.average(10, 20, 30);
        
    }
    
}
