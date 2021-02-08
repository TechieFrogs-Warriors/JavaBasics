package Array_Concept;

public class Program1 
{
    public static void main(String[] args) 
    {
        //copying an array to another array
        char[] a={'a','b','c'};
        char[] b={'d','e','f','g'};
        System.arraycopy(a, 0, b, 1, a.length);//copying a into b
        System.out.println("After copying values of  'a' array into 'b' array: "+String.valueOf(b));//replaces values in 'b' with 'a' values
  
    }
    
}
