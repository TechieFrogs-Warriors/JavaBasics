package ExceptionHandling;

public class TryCatchFinally23 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        try{
          System.out.println(a[4]);  
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Out Of Bound");
        }
        finally{
            System.out.println("First Index Value: "+a[1]);
            System.out.println("Second Index Value: "+a[2]);
            System.out.println("Zero Index Value: "+a[0]);
        }
    }
}
