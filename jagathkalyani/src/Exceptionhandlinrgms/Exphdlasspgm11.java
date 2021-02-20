package Exceptionhandlinrgms;

public class Exphdlasspgm11 {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3,4};
            int b=a[4];
            System.out.println("First print statement in try block" +b);
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
