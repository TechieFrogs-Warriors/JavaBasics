package ExceptionHandling;

public class NestedTry6 {
    public static void main(String[] args) {
        try{
            int a[]=new int[6];
            try{
                a[15]=145;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("OutOfBounds-1");
            }
            a[9]=45;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("OutOfBounds-2");
        }
        System.out.println("Nested Try Blocks.");
    }
}
