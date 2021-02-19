package ExceptionHandling;

public class ArrayOutOfBounceException14 {
    public static void main(String[] args) {
        int a[]=new int[5];
        try{
            System.out.println("Value Assigned to Array:"+a[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Out Of Bounds.");
        }
    }
}
