public class TryCatchBlock5 {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3,4};
            try{
                System.out.println(a[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner try catch");
            }
            System.out.println(a[10]);
        }
        catch(Exception e){
            System.out.println("Outer Try Catch");
        }
        System.out.println("Inner And Outer Try-Catch Block.");
    }
}
