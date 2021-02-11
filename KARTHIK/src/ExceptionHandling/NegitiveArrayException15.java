package ExceptionHandling;

public class NegitiveArrayException15 {
    public static void main(String[] args) {
        try{
            System.out.println(" Assaign Leangth Of The Array");
            int a[]=new int[-7];
            a[-6]=12;
        }
        catch(NegativeArraySizeException e){
            System.out.println(e.getMessage());
            System.out.println("Index Of An Array Start From '0'.");
        }
    }
}
