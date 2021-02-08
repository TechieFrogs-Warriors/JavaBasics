public class TryCatchBlock2 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        try{
            System.out.println(a[4]);
        }
        catch(Exception e){
            System.out.println(a[2]);
        }
        System.out.println("Both of the Blocks Contains Exceptions.");
    }
}
