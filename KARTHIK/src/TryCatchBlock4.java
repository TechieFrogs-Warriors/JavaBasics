public class TryCatchBlock4 {
    public static void main(String[] args)  {
        try {
            int a[] = { 1, 2, 3 };
            System.out.println(a[9]);
            int b=10/0;
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("OUT OF BOUNDS");
        }
        catch (Exception e) {
            System.out.println("9th position not present in the  array a");
        }
        

    }
}
