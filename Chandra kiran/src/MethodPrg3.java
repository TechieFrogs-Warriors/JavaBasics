class poly
{
    public  int area(int l,int b)
    {
      int h=l*b;
       return h; 
    } 
    public int area(int s)
    {
        
        return s*s;
    }
    public String area(String a)
    {
        return a;
    }
}
public class MethodPrg3 
{
    public static void main(String[] args) 
    {
        poly area1= new poly();
        System.out.println(area1.area("the area of reactangle is"));
        int p=area1.area(70, 30);
        System.out.println(p);
        System.out.println(area1.area("the area of square is"));
        int q=area1.area(50);
        System.out.println(q);
        
    }
    
}
