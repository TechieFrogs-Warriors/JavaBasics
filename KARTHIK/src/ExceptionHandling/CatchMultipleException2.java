package ExceptionHandling;

public class CatchMultipleException2 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        try{
            System.out.println(a[5]=89);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Exception 1");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Exception 2");
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Exception 3");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception 4");
        }
    }
}
