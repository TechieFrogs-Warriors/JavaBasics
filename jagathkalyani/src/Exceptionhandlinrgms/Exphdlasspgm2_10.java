package Exceptionhandlinrgms;

public class Exphdlasspgm2_10 {
    public static void main(String[] args) {
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch(ArithmeticException e){
           System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
           System.out.println("Some Other exception");
        }
      System.out.println("Out of try-catch block...");
    }
    
}
