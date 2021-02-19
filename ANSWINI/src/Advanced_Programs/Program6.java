package Advanced_Programs;

public class Program6 
{
    //program to swap two strings without using third variable
    public static void main(String[] args) 
    {
        //two string values are taken for swapping
        String s1="aswini";
        String s2="vedhansh";
        System.out.println("s1 and s2 before swapping are: "+s1+" and "+s2);
        //swapping logic
        s1=s1+s2;//concatanated two strings
        s2=s1.substring(0, (s1.length()-s2.length()));
        s1=s1.substring(s2.length());
        System.out.println("s1 and s2 after swapping are: "+s1+" and "+s2);

    }
    
}
