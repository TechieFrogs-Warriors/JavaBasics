package ExceptionHandling;

public class NestedTryCatchFinally24 {
    public static void main(String[] args) {
        try{
            int a[]=new int[6];
            try{
                a[15]=145;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("OutOfBounds-1");
            }
            finally{
                System.out.println("NESTED FINALLY BLOCK");
            }
            a[9]=45;
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("OutOfBounds-2");
        }
        finally{
            System.out.println("Outer Finally Block");
        }
        System.out.println("Nested Try Catch Final Blocks.");
    }
}
